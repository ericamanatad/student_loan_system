/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentloansystem;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 *
 * @author edlution
 */
public class StudentLoanStatus extends javax.swing.JFrame {

    /**
     * Creates new form StudentLoanStatus
     */
    private int trackCode;
    private Student student;
    private String approvedLoanStatus = "Success! Your loan application has been approved.";
    private String disapprovedLoanStatus = "Sorry, Your loan application has not been approved. You may reapply. Thank you.";
    public StudentLoanStatus() {
        initComponents();
    }
    
    public StudentLoanStatus(int trackCode, Student student) {
        initComponents();
        this.trackCode = trackCode;
        this.student = student;
        
        ConnectionString dbOperation = new ConnectionString();
        String studentName = dbOperation.getStudentName(trackCode, student);
        LabelLAC.setText(String.valueOf(trackCode));
        LabelStudentName.setText(studentName + ", your loan application status is : ");
        LabelLoanStatus.setText(approvedLoanStatus);
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        LabelLAC = new javax.swing.JLabel();
        LabelLoanStatus = new javax.swing.JLabel();
        LabelStudentName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        OKbtn = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/student.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(65, 109, 25));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(65, 109, 25));
        jLabel4.setText("Student Loan Status");

        LabelLAC.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        LabelLAC.setForeground(new java.awt.Color(65, 109, 25));
        LabelLAC.setText("SL0000");

        LabelLoanStatus.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        LabelLoanStatus.setText("Loan application status appears here...");

        LabelStudentName.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        LabelStudentName.setForeground(new java.awt.Color(65, 109, 25));
        LabelStudentName.setText("Juan Dela Cruz, your loan application status is : ");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(65, 109, 25));
        jLabel6.setText("Loan Application Code (LAC) : ");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("To receive your borrowed cash, please proceed to the school cashier's office. They will assist you with the disbursement process ");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("and provide you with a form to signify that the cash has been claimed. Additionally, you will be required to sign a promissory note");

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("outlining the agreed payment method. If you have any questions or need further assistance,  please don't hesitate to reach out to our office.");

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Thank you.");

        OKbtn.setBackground(new java.awt.Color(65, 109, 25));
        OKbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OKbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OKbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OKbtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OKbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                OKbtnMouseReleased(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("OK");

        javax.swing.GroupLayout OKbtnLayout = new javax.swing.GroupLayout(OKbtn);
        OKbtn.setLayout(OKbtnLayout);
        OKbtnLayout.setHorizontalGroup(
            OKbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OKbtnLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel16)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        OKbtnLayout.setVerticalGroup(
            OKbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OKbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 1091, Short.MAX_VALUE)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(46)
        							.addComponent(jLabel1)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jLabel4)
        							.addGap(699))))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(142)
        							.addComponent(jLabel6)
        							.addGap(18)
        							.addComponent(LabelLAC))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(192)
        							.addComponent(LabelStudentName))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(331)
        							.addComponent(jLabel13)))
        					.addGap(0, 434, Short.MAX_VALUE)))
        			.addContainerGap())
        		.addGroup(layout.createSequentialGroup()
        			.addGap(95)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        					.addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 837, GroupLayout.PREFERRED_SIZE)
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(jLabel14)
        						.addGap(11)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(37)
        					.addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 839, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(434)
        					.addComponent(jLabel15)))
        			.addContainerGap(132, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(985, Short.MAX_VALUE)
        			.addComponent(OKbtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(62))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(303)
        			.addComponent(LabelLoanStatus)
        			.addContainerGap(530, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel1)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(12)
        					.addComponent(jLabel4)))
        			.addGap(27)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(LabelLAC)
        				.addComponent(jLabel6))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(LabelStudentName)
        			.addGap(24)
        			.addComponent(LabelLoanStatus)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel9)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel12)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabel13)
        			.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
        			.addComponent(OKbtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(38))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKbtnMouseClicked
        this.dispose();
        
    }//GEN-LAST:event_OKbtnMouseClicked

    private void OKbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKbtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_OKbtnMouseEntered

    private void OKbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKbtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_OKbtnMouseExited

    private void OKbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKbtnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_OKbtnMousePressed

    private void OKbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKbtnMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_OKbtnMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentLoanStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentLoanStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentLoanStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentLoanStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentLoanStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelLAC;
    private javax.swing.JLabel LabelLoanStatus;
    private javax.swing.JLabel LabelStudentName;
    private javax.swing.JPanel OKbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
