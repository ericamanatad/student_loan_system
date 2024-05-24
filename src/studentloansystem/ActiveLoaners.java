package studentloansystem;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.*;
import java.text.SimpleDateFormat;

public class ActiveLoaners extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = 1L;
	private static JTable JTableActiveLoaners;
    private static DefaultTableModel model;

    public ActiveLoaners() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        viewLoaners(); // Call method to populate table
    }
    
    public static void viewLoaners() {
    	DefaultTableModel tbModel = (DefaultTableModel) JTableActiveLoaners.getModel();
    	tbModel.setRowCount(0);

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentloansystem", "root", "");
            String queryViewActiveLoaners = "SELECT l.id, l.amount, l.monthly_payment, l.num_of_yrs_to_pay,  s.last_name, s.first_name, s.middle_name, l.created_on, t.remaining_balance FROM student_table s JOIN loan_table l ON s.id = l.student_id JOIN transaction_table t ON l.id = t.la_code WHERE s.is_active = 1;";
            PreparedStatement psViewActiveLoaners = conn.prepareStatement(queryViewActiveLoaners);

            ResultSet rs = psViewActiveLoaners.executeQuery();
            while (rs.next()) {
                String loanID = "SL" + rs.getInt("l.id"); // Prepend "SL" to loan ID
                String fn = rs.getString("s.first_name");
                String mn = rs.getString("s.middle_name");
                String ln = rs.getString("s.last_name");
                String studentName = fn + " " + mn + " " + ln;
                double amountBorrowed = rs.getDouble("l.amount");
                double monthlyPayment = rs.getDouble("l.monthly_payment");
                int numYearsToPay = rs.getInt("l.num_of_yrs_to_pay");
                double remainingBalance = rs.getDouble("t.remaining_balance");

                // Add data to table model
                tbModel.addRow(new Object[]{loanID, studentName, amountBorrowed, monthlyPayment, numYearsToPay, remainingBalance});
            }


        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error viewLoaners() :  " + ex.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableActiveLoaners = new javax.swing.JTable();

        setBackground(new java.awt.Color(211, 250, 215));

        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new String[]{"LACode", "Name", "Amount Borrowed", "Monthly Payment", "Num Years To Pay", "Remaining Balance", "Action"}) {
            private static final long serialVersionUID = 1L;

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                switch (columnIndex) {
                    case 0:
                        return String.class;
                    case 1:
                        return String.class;
                    case 2:
                        return Double.class;
                    case 3:
                        return Double.class;
                    case 4:
                        return Integer.class;
                    case 5:
                        return Double.class;
                    case 6:
                        return JButton.class;  // Change to JButton for an action button
                    default:
                        return String.class;
                }
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 6; // Only the "Action" column should be editable
            }
        };

        JTableActiveLoaners.setModel(new DefaultTableModel(
            	new Object[][] {
            	},
            	new String[] {
            		"LACode", "Name", "Amount Borrowed", "Monthly Payment", "Num Years To Pay", "Remaining Balance", "Action"
            	}
            ));
        JTableActiveLoaners.getColumn("Action").setCellRenderer(new ButtonRenderer());
        class LeftAlignRenderer extends DefaultTableCellRenderer {

            public LeftAlignRenderer() {
                super();
                setHorizontalAlignment(SwingConstants.LEFT); // Align text to the left
            }
        }


        jScrollPane1.setViewportView(JTableActiveLoaners);
        JTableActiveLoaners.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int row = JTableActiveLoaners.rowAtPoint(e.getPoint());
                if (row >= 0 && row < JTableActiveLoaners.getRowCount()) {
                	JTableActiveLoaners.setRowSelectionInterval(row, row);
                }
                JTableActiveLoaners.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(54)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 937, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(25)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }
//
//    private void JTableActiveLoanersMouseMoved(java.awt.event.MouseEvent evt) {
//        int row = JTableActiveLoaners.rowAtPoint(evt.getPoint());
//        if (row >= 0 && row < JTableActiveLoaners.getRowCount()) {
//            JTableActiveLoaners.setRowSelectionInterval(row, row);
//        } else {
//            JTableActiveLoaners.clearSelection();
//        }
//        JTableActiveLoaners.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//    }

 // Custom button renderer class
    class ButtonRenderer extends JButton implements TableCellRenderer {

        public ButtonRenderer() {
            setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setText("Action");
            return this;
        }
    }

    // Custom button editor class
    class ButtonEditor extends AbstractCellEditor implements TableCellEditor, ActionListener {
        private JButton button;
        private JTable table;

        public ButtonEditor(JTable table) {
            this.table = table;
            button = new JButton("Action");
            button.setOpaque(true);
            button.addActionListener(this);
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            return "Action";
        }
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            int selectedRow = table.getSelectedRow();
//            if (selectedRow != -1) {
//                String loanID = (String) table.getValueAt(selectedRow, 0);
//                String studentName = (String) table.getValueAt(selectedRow, 1);
//                double amountBorrowed = (double) table.getValueAt(selectedRow, 2);
//                double monthlyPayment = (double) table.getValueAt(selectedRow, 3);
//                int numYearsToPay = (int) table.getValueAt(selectedRow, 4);
//                double remainingBalance = (double) table.getValueAt(selectedRow, 5);
//
//                // Create and display the ApplicantSummary form
//                ApplicantSummary applicantSummary = new ApplicantSummary();
//                applicantSummary.setLACode(loanID);  // Set the Loan_ID in the LblLACode
//                applicantSummary.setStudentName(studentName);  // Set the student name
//                applicantSummary.setAmountBorrowed(amountBorrowed);  // Set the amount borrowed
//                applicantSummary.setMonthlyPayment(monthlyPayment);  // Set the monthly payment
//                applicantSummary.setNumYearsToPay(numYearsToPay);  // Set the number of years to pay
//                applicantSummary.setRemainingBalance(remainingBalance);  // Set the remaining balance
//                applicantSummary.setVisible(true);
//            }
//            fireEditingStopped();
//        }

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JDesktopPane desktop = new JDesktopPane();

        ActiveLoaners activeLoaners = new ActiveLoaners();
        activeLoaners.setTitle("Active Loaners");
        activeLoaners.setSize(975, 359);
        desktop.add(activeLoaners);

        frame.getContentPane().add(desktop);
        frame.setSize(1024, 768);
        frame.setVisible(true);

        activeLoaners.setLocation(desktop.getWidth() / 2 - activeLoaners.getWidth() / 2, desktop.getHeight() / 2 - activeLoaners.getHeight() / 2);
    }
   
    private javax.swing.JScrollPane jScrollPane1;
}
