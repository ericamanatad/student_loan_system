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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class LoanApplications extends JInternalFrame {

    public LoanApplications() {
        initComponents();
        this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        viewApplications(); // Call method to populate table
    }

    public void viewApplications() {
        DefaultTableModel tbModel = (DefaultTableModel) JTableLoanApplications.getModel();
        tbModel.setRowCount(0);

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentloansystem", "root", "")) {
            String queryViewLoanApplications = "SELECT l.id, l.amount, s.last_name, s.first_name, s.middle_name, l.created_on " +
                                               "FROM student_table s JOIN loan_table l ON s.id = l.student_id WHERE s.is_active = 0;";
            PreparedStatement psViewLoanApplications = conn.prepareStatement(queryViewLoanApplications);
            ResultSet rs = psViewLoanApplications.executeQuery();
            
            while (rs.next()) {
                String loanID = "" + rs.getInt("l.id");
                String studentName = rs.getString("s.first_name") + " " +
                                     rs.getString("s.middle_name") + " " +
                                     rs.getString("s.last_name");
                double amount = rs.getDouble("l.amount");
                Timestamp timeApplied = rs.getTimestamp("l.created_on");
                String timeAppliedString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(timeApplied);

                tbModel.addRow(new Object[]{loanID, studentName, amount, timeAppliedString});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error retrieving loan applications: " + ex.getMessage());
        }
    }

    private void initComponents() {
        jScrollPane1 = new JScrollPane();
        JTableLoanApplications = new JTable();

        setBackground(new Color(211, 250, 215));

        DefaultTableModel model = new DefaultTableModel(
            new Object[][]{},
            new String[]{"LACode", "Name", "Amount", "Time Applied", "Action"}
        ) {
            private static final long serialVersionUID = 1L;

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                switch (columnIndex) {
                    case 0: return String.class;
                    case 1: return String.class;
                    case 2: return Double.class;
                    case 3: return String.class;
                    case 4: return JButton.class;  // Change to JButton for the Action column
                    default: return String.class;
                }
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 4; // Only the "Action" column should be editable
            }
        };

        JTableLoanApplications.setModel(model);
        JTableLoanApplications.getColumn("Action").setCellRenderer(new ButtonRenderer());
        JTableLoanApplications.getColumn("Action").setCellEditor(new ButtonEditor(JTableLoanApplications));
        JTableLoanApplications.setRowHeight(30); // Increase row height for better readability

        // Center align text in cells
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < JTableLoanApplications.getColumnCount() - 1; i++) {
            JTableLoanApplications.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        jScrollPane1.setViewportView(JTableLoanApplications);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
                    .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addContainerGap())
        );

        pack();
    }

    class ButtonRenderer extends JButton implements TableCellRenderer {
        public ButtonRenderer() {
            setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setText("View Details");
            return this;
        }
    }

    class ButtonEditor extends AbstractCellEditor implements TableCellEditor, ActionListener {
        private JButton button;
        private JTable table;

        public ButtonEditor(JTable table) {
            this.table = table;
            button = new JButton("View Details");
            button.setOpaque(true);
            button.addActionListener(this);
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            return "View Details";
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
            	int selectedRow = table.getSelectedRow(); 
                if (selectedRow != -1) {
                    String loanId = (String) table.getValueAt(selectedRow, 0);
                    int loanID = Integer.parseInt(loanId);

                    ApplicantSummary applicantSummary = new ApplicantSummary();
                   applicantSummary.viewApplicantSummary(loanID);
                    applicantSummary.setVisible(true);
                }
                fireEditingStopped();
            }catch(Exception ex) {
            	JOptionPane.showMessageDialog(null, " public void actionPerformed(ActionEvent e" +  ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JDesktopPane desktop = new JDesktopPane();

        LoanApplications loanApplications = new LoanApplications();
        loanApplications.setTitle("Loan Applications");
        loanApplications.setSize(975, 450);
        desktop.add(loanApplications);

        frame.getContentPane().add(desktop);
        frame.setSize(1024, 600);
        frame.setVisible(true);

        loanApplications.setLocation(
            desktop.getWidth() / 2 - loanApplications.getWidth() / 2,
            desktop.getHeight() / 2 - loanApplications.getHeight() / 2
        );
    }

    private JTable JTableLoanApplications;
    private JScrollPane jScrollPane1;
}
