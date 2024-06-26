/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package studentloansystem;

import java.awt.Color;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Panewels
 */
public class Payment extends javax.swing.JInternalFrame {

    private Color panDefault;
    private Color panEnter;
    private Color panClick;

    /**
     * Creates new form Payment
     */
    public Payment() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }
    
    public class Main {
        public static void main(String[] args) {
            // Create a new JFrame to contain the JDesktopPane
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a new JDesktopPane
            JDesktopPane desktop = new JDesktopPane();

            // Create a new Home JInternalFrame and add it to the JDesktopPane
            Payment payment = new Payment();
            payment.setTitle("Home");
            payment.setSize(975, 359);
            desktop.add(payment);

            // Add the JDesktopPane to the JFrame
            frame.getContentPane().add(desktop);

            // Set the JFrame size and make it visible
            frame.setSize(1024, 768);
            frame.setVisible(true);

            // Move the Home JInternalFrame to the center of the JDesktopPane
            payment.setLocation(desktop.getWidth() / 2 - payment.getWidth() / 2, desktop.getHeight() / 2 - payment.getHeight() / 2);
            
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtInputLACode = new javax.swing.JTextField();
        btnOK = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        LabelLAC = new javax.swing.JLabel();
        LabelStudentFullName = new javax.swing.JLabel();
        LabelAmountBorrowed = new javax.swing.JLabel();
        LabelMonthlyPayment = new javax.swing.JLabel();
        LabelNumOfYearsToPay = new javax.swing.JLabel();
        LabelRemainingBalance = new javax.swing.JLabel();
        txtPayment = new javax.swing.JTextField();
        btnPayNow = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        lcl = new javax.swing.JLabel();
        LabelStudentID = new javax.swing.JLabel();

        setBackground(new java.awt.Color(211, 250, 215));

        btnOK.setBackground(new java.awt.Color(65, 109, 25));
        btnOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOKMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOKMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnOKMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnOKMouseReleased(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("OK");

        javax.swing.GroupLayout btnOKLayout = new javax.swing.GroupLayout(btnOK);
        btnOK.setLayout(btnOKLayout);
        btnOKLayout.setHorizontalGroup(
            btnOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnOKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
        );
        btnOKLayout.setVerticalGroup(
            btnOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnOKLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap())
        );

        LabelLAC.setText("Loan Application Code:");

        LabelStudentFullName.setText("Student FullName:");

        LabelAmountBorrowed.setText("Amount Borrowed:");

        LabelMonthlyPayment.setText("Monthly Payment: ");

        LabelNumOfYearsToPay.setText("No of Years:");

        LabelRemainingBalance.setText("Remaining Balance:");

        txtPayment.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaymentActionPerformed(evt);
            }
        });

        btnPayNow.setBackground(new java.awt.Color(65, 109, 25));
        btnPayNow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPayNowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPayNowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPayNowMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPayNowMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPayNowMouseReleased(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("PAY NOW");

        javax.swing.GroupLayout btnPayNowLayout = new javax.swing.GroupLayout(btnPayNow);
        btnPayNow.setLayout(btnPayNowLayout);
        btnPayNowLayout.setHorizontalGroup(
            btnPayNowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPayNowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnPayNowLayout.setVerticalGroup(
            btnPayNowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPayNowLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addContainerGap())
        );

        lcl.setText("Please enter SL Code");

        LabelStudentID.setText("Student ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtInputLACode, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelRemainingBalance)
                            .addComponent(LabelNumOfYearsToPay)
                            .addComponent(LabelMonthlyPayment)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelLAC)
                                    .addComponent(LabelStudentID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 457, Short.MAX_VALUE)
                                .addComponent(txtPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lcl))
                        .addGap(109, 109, 109))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelAmountBorrowed)
                            .addComponent(LabelStudentFullName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPayNow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lcl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtInputLACode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txtPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelLAC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelStudentID)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelStudentFullName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelAmountBorrowed))
                    .addComponent(btnPayNow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelMonthlyPayment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelNumOfYearsToPay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelRemainingBalance)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKMouseClicked
        int laCode = Integer.parseInt(txtInputLACode.getText());
        double inputPayment = 0;
        ConnectionString dbOperation = new ConnectionString();
        List<String[]> loanerInfo = dbOperation.viewLoanerInfo(laCode);
        String name = loanerInfo.get(0)[1];
        String studentID = loanerInfo.get(0)[2];
        double amountBorrowed = Double.parseDouble(loanerInfo.get(0)[3]);
        double monthlyPayment = Double.parseDouble(loanerInfo.get(0)[4]);
        double numOfYearsToPay = Double.parseDouble(loanerInfo.get(0)[5]);
        double remainingBalance = Double.parseDouble(loanerInfo.get(0)[6]);
        //dbOperation.addPaymentTransaction(laCode, inputPayment, name, studentID, amountBorrowed, monthlyPayment, numOfYearsToPay, remainingBalance);

        
        LabelLAC.setText("Loan Application Code: " + laCode);
        LabelStudentFullName.setText("Student FullName: " +  name);
        LabelStudentID.setText("Student ID: " +  studentID);
        LabelAmountBorrowed.setText("Amount Borrowed: PHP "+  amountBorrowed);
        LabelMonthlyPayment.setText("Monthly Payment: PHP "+  monthlyPayment);
        LabelNumOfYearsToPay.setText("No of Years: "+  numOfYearsToPay);
        LabelRemainingBalance.setText("Remaining Balance: PHP "+  remainingBalance);
        
        
     
       
    }//GEN-LAST:event_btnOKMouseClicked

    private void btnOKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKMouseEntered
        // TODO add your handling code here:
        btnOK.setBackground(panEnter);
    }//GEN-LAST:event_btnOKMouseEntered

    private void btnOKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKMouseExited
        // TODO add your handling code here:
        btnOK.setBackground(panDefault);
    }//GEN-LAST:event_btnOKMouseExited

    private void btnOKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKMousePressed
        // TODO add your handling code here:
        btnOK.setBackground(panClick);
    }//GEN-LAST:event_btnOKMousePressed

    private void btnOKMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKMouseReleased
        // TODO add your handling code here:
        btnOK.setBackground(panDefault);
    }//GEN-LAST:event_btnOKMouseReleased

    private void btnPayNowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPayNowMouseClicked
                            
        int laCode = Integer.parseInt(txtInputLACode.getText());
        double inputPayment = Double.parseDouble(txtPayment.getText());  
        ConnectionString dbOperation = new ConnectionString();
        List<String[]> loanerInfo = dbOperation.viewLoanerInfo(laCode);
        String name = loanerInfo.get(0)[1];
        String studentID = loanerInfo.get(0)[2];
        double amountBorrowed = Double.parseDouble(loanerInfo.get(0)[3]);
        double monthlyPayment = Double.parseDouble(loanerInfo.get(0)[4]);
        double numOfYearsToPay = Double.parseDouble(loanerInfo.get(0)[5]);
        double remainingBalance = Double.parseDouble(loanerInfo.get(0)[6]);
        
        dbOperation.addPaymentTransaction(laCode, inputPayment, name, studentID, amountBorrowed, monthlyPayment, numOfYearsToPay, remainingBalance);
        
        
       JOptionPane.showMessageDialog(null, ""+ inputPayment + ", " + laCode + ", " + name + ",  "+ studentID+ ", " + amountBorrowed + ", "+ monthlyPayment + ", " + numOfYearsToPay + ", "+ remainingBalance );
               
        
    }//GEN-LAST:event_btnPayNowMouseClicked

    private void btnPayNowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPayNowMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPayNowMouseEntered

    private void btnPayNowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPayNowMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPayNowMouseExited

    private void btnPayNowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPayNowMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPayNowMousePressed

    private void btnPayNowMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPayNowMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPayNowMouseReleased

    private void txtPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaymentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAmountBorrowed;
    private javax.swing.JLabel LabelLAC;
    private javax.swing.JLabel LabelMonthlyPayment;
    private javax.swing.JLabel LabelNumOfYearsToPay;
    private javax.swing.JLabel LabelRemainingBalance;
    private javax.swing.JLabel LabelStudentFullName;
    private javax.swing.JLabel LabelStudentID;
    private javax.swing.JPanel btnOK;
    private javax.swing.JPanel btnPayNow;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel lcl;
    private javax.swing.JTextField txtInputLACode;
    private javax.swing.JTextField txtPayment;
    // End of variables declaration//GEN-END:variables
}
