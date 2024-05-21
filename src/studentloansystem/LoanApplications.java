package studentloansystem;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class LoanApplications extends javax.swing.JInternalFrame {

    public LoanApplications() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        viewApplications(); // Call method to populate table
    }

    public void viewApplications() {
        DefaultTableModel tbModel = (DefaultTableModel) JTableLoanApplications.getModel();
        tbModel.setRowCount(0);

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentloansystem", "root", "");
            String queryViewLoanApplications = "SELECT l.id, l.amount, s.last_name, s.first_name, s.middle_name, l.created_on FROM student_table s JOIN loan_table l ON s.id = l.student_id WHERE s.is_active = 1;";
            PreparedStatement psViewLoanApplications = conn.prepareStatement(queryViewLoanApplications);

            ResultSet rs = psViewLoanApplications.executeQuery();
            while (rs.next()) {
                String loanID = "SL" + rs.getInt("l.id"); // Prepend "SL" to loan ID
                String fn = rs.getString("s.first_name");
                String mn = rs.getString("s.middle_name");
                String ln = rs.getString("s.last_name");
                String studentName = fn + " " + mn + " " + ln;
                double amount = rs.getDouble("l.amount");
                Timestamp timeApplied = rs.getTimestamp("l.created_on");

                // Format timestamp to string for display
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String timeAppliedString = dateFormat.format(timeApplied);

                // Add data to table model
                tbModel.addRow(new Object[]{loanID, studentName, amount, timeAppliedString});
                
                //in case naay error or unsa
                //tbModel.addRow(new Object[]{loanID, studentName, amount, timeAppliedString, false});
                
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error viewApplications() :  " + ex.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableLoanApplications = new javax.swing.JTable();

        setBackground(new java.awt.Color(211, 250, 215));

        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new String[]{"LACode", "Name", "Amount", "Time Applied", "Action"}) {
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
                        return String.class;
                    case 4:
                        return Boolean.class;  // Change to Boolean for a checkbox (or JButton if you want a button)
                    default:
                        return String.class;
                }
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 4; // Only the "Action" column should be editable if you want to handle button clicks
            }
        };

        JTableLoanApplications.setModel(model);
        JTableLoanApplications.getColumn("Action").setCellRenderer(new ButtonRenderer());
        JTableLoanApplications.getColumn("Action").setCellEditor(new ButtonEditor());

        jScrollPane1.setViewportView(JTableLoanApplications);
        JTableLoanApplications.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int row = JTableLoanApplications.rowAtPoint(e.getPoint());
                if (row >= 0 && row < JTableLoanApplications.getRowCount()) {
                    JTableLoanApplications.setRowSelectionInterval(row, row);
                }
                JTableLoanApplications.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
                    .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(60, 60, 60))
        );

        pack();
    }

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

        public ButtonEditor() {
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

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(button, "Action: Clicked!");
            fireEditingStopped();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JDesktopPane desktop = new JDesktopPane();

        LoanApplications loanApplications = new LoanApplications();
        loanApplications.setTitle("Loan Applications");
        loanApplications.setSize(975, 359);
        desktop.add(loanApplications);

        frame.getContentPane().add(desktop);
        frame.setSize(1024, 768);
        frame.setVisible(true);

        loanApplications.setLocation(desktop.getWidth() / 2 - loanApplications.getWidth() / 2, desktop.getHeight() / 2 - loanApplications.getHeight() / 2);
    }

    private javax.swing.JTable JTableLoanApplications;
    private javax.swing.JScrollPane jScrollPane1;
}
