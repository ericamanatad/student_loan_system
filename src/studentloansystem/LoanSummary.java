/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentloansystem;

import java.awt.Color;
import javax.swing.JOptionPane;


/**
 *
 * @author edlution
 */
public class LoanSummary extends javax.swing.JFrame {

    /**
     * Creates new form LoanSummary
     */
    private Student student;
    Color panDefault, panClick, panEnter;
    
    public LoanSummary() {
        initComponents();
        setResizable(false);
        
        
        panDefault = new Color(65,109,25);
        panClick = new Color(141, 236, 180);
        panEnter = new Color(65, 176, 110);
        
        //RedirectBtn.setBackground(new Color(242,242,242)); -- Next button from ApplyStep1
    }
   
    public LoanSummary(Student student, Student education){
        this.student = student;
        initComponents();
        //this.fullName = student.getFirstName();
        setResizable(false);
        panDefault = new Color(65,109,25);
        panClick = new Color(141, 236, 180);
        panEnter = new Color(65, 176, 110);
        
        //I dont know how to pass the student data. Last editted
        //Tiwas ari EKAAAAIIIIII
        //============================================================================//
       // JOptionPane.showMessageDialog(null, "Hello, "+ student +"!(LoanSummary(Student student)");
        LabelIDNo.setText("Student ID No: " + student.getIdNumber());
        LabelFullName.setText("FullName: " + student.getFirstName() + " " + student.getMiddleName() + " "+ student.getLastName());
        LabelBirthdate.setText("Birthdate: " + student.getBirthdate());
        LabelGender.setText("Gender: " + student.getGender());
        LabelPhoneNumber.setText("Phone Number: " + student.getPhoneNumber());
        LabelEmail.setText("Email Address: " + student.getEmailAddress());
        LabelNationality.setText("Nationality: " + student.getNationality());
        LabelCivilStatus.setText("Civil Status: " + student.getCivilStatus());
        LabelAddress.setText("Address: " + student.getAddress());
        LabelZipCode.setText("Zip Code: " + student.getZipCode());
        LabelGuardianName.setText("Name of parent/guardian: " + student.getGuardianFullName());
        LabelRelationship.setText("Relationship: " + student.getGuardianRelationship());
        LabelGuardianPhoneNumber.setText("Phone Number: " + student.getGuardianContactNumber());
        LabelDepartment.setText("Department Name: " + education.getDepartment());
        LabelProgramEnrolled.setText("Program Enrolled: " + education.getProgramEnrolled());
        LabelYearLevel.setText("Year Level: " + education.getYearLevel());
        //LabelNumOfYrsToPay
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LabelFullName = new javax.swing.JLabel();
        LabelBirthdate = new javax.swing.JLabel();
        LabelGender = new javax.swing.JLabel();
        LabelPhoneNumber = new javax.swing.JLabel();
        LabelLastName1 = new javax.swing.JLabel();
        LabelIDNo = new javax.swing.JLabel();
        LabelEmail = new javax.swing.JLabel();
        LabelNationality = new javax.swing.JLabel();
        LabelCivilStatus = new javax.swing.JLabel();
        LabelAddress = new javax.swing.JLabel();
        LabelZipCode = new javax.swing.JLabel();
        LabelGuardianName = new javax.swing.JLabel();
        LabelRelationship = new javax.swing.JLabel();
        LabelGuardianPhoneNumber = new javax.swing.JLabel();
        LabelDepartment = new javax.swing.JLabel();
        LabelProgramEnrolled = new javax.swing.JLabel();
        LabelYearLevel = new javax.swing.JLabel();
        LabelLastName2 = new javax.swing.JLabel();
        LabelLastName3 = new javax.swing.JLabel();
        LabelTotalAmountNeeded = new javax.swing.JLabel();
        LabelWhatIsTheFundFor = new javax.swing.JLabel();
        SubmitBtn = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        LabelNumOfYrsToPay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1163, 628));

        jPanel2.setBackground(new java.awt.Color(65, 109, 25));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 914, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/student.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(65, 109, 25));
        jLabel4.setText("Loan Application Summary");

        LabelFullName.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelFullName.setText("Full Name:");
        LabelFullName.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                LabelFullNamePropertyChange(evt);
            }
        });

        LabelBirthdate.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelBirthdate.setText("Birthdate:");

        LabelGender.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelGender.setText("Gender:");

        LabelPhoneNumber.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelPhoneNumber.setText("Phone Number:");

        LabelLastName1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        LabelLastName1.setText("GUARDIAN");
        LabelLastName1.setName(""); // NOI18N

        LabelIDNo.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelIDNo.setText("Student ID No. ");

        LabelEmail.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelEmail.setText("Email:");

        LabelNationality.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelNationality.setText("Nationality:");

        LabelCivilStatus.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelCivilStatus.setText("Civil Status:");

        LabelAddress.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelAddress.setText("Address:");

        LabelZipCode.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelZipCode.setText("Zip Code:");

        LabelGuardianName.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelGuardianName.setText("Name of parent/guardian : ");

        LabelRelationship.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelRelationship.setText("Relationship:");

        LabelGuardianPhoneNumber.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelGuardianPhoneNumber.setText("Phone Number:");

        LabelDepartment.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelDepartment.setText("Department Name:");

        LabelProgramEnrolled.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelProgramEnrolled.setText("Program Enrolled:");

        LabelYearLevel.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelYearLevel.setText("Year Level:");

        LabelLastName2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        LabelLastName2.setText("STUDENT APPLICANT");
        LabelLastName2.setName(""); // NOI18N

        LabelLastName3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        LabelLastName3.setText("EDUCATION");
        LabelLastName3.setName(""); // NOI18N

        LabelTotalAmountNeeded.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelTotalAmountNeeded.setText("Total amount needed:");

        LabelWhatIsTheFundFor.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelWhatIsTheFundFor.setText("What is the fund for?");

        SubmitBtn.setBackground(new java.awt.Color(65, 109, 25));
        SubmitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SubmitBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SubmitBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SubmitBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SubmitBtnMouseReleased(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("SUBMIT");

        javax.swing.GroupLayout SubmitBtnLayout = new javax.swing.GroupLayout(SubmitBtn);
        SubmitBtn.setLayout(SubmitBtnLayout);
        SubmitBtnLayout.setHorizontalGroup(
            SubmitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubmitBtnLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(49, 49, 49))
        );
        SubmitBtnLayout.setVerticalGroup(
            SubmitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubmitBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel21.setBackground(new java.awt.Color(0, 153, 51));
        jLabel21.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 102, 51));
        jLabel21.setText("GO BACK");

        LabelNumOfYrsToPay.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelNumOfYrsToPay.setText("Number of years to pay:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelFullName)
                            .addComponent(LabelZipCode)
                            .addComponent(LabelGender)
                            .addComponent(LabelBirthdate)
                            .addComponent(LabelEmail)
                            .addComponent(LabelPhoneNumber)
                            .addComponent(LabelNationality)
                            .addComponent(LabelCivilStatus)
                            .addComponent(LabelAddress)
                            .addComponent(LabelLastName2)
                            .addComponent(LabelIDNo))
                        .addGap(192, 192, 192)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelLastName1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelProgramEnrolled, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelYearLevel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelDepartment, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelLastName3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelGuardianName)
                                    .addComponent(LabelGuardianPhoneNumber)
                                    .addComponent(LabelRelationship))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelNumOfYrsToPay)
                                    .addComponent(LabelWhatIsTheFundFor)
                                    .addComponent(LabelTotalAmountNeeded))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(35, 35, 35)
                .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(LabelLastName2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LabelIDNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelFullName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelBirthdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelGender)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelPhoneNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelNationality)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelCivilStatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelAddress)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelZipCode))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(LabelLastName1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LabelGuardianName)
                                    .addComponent(LabelTotalAmountNeeded))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LabelRelationship)
                                    .addComponent(LabelNumOfYrsToPay))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LabelGuardianPhoneNumber)
                                    .addComponent(LabelWhatIsTheFundFor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabelLastName3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelDepartment)
                                .addGap(5, 5, 5)
                                .addComponent(LabelProgramEnrolled)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelYearLevel)
                                .addGap(22, 22, 22)))
                        .addGap(30, 30, 30)
                        .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21)
                        .addGap(38, 38, 38))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitBtnMouseClicked

        //code where to navigate next? 
        //shall we now display the page where the student will be give the transaction code to track?
        //--erica
        this.dispose();
    }//GEN-LAST:event_SubmitBtnMouseClicked

    private void SubmitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitBtnMouseEntered
        // TODO add your handling code here:
        SubmitBtn.setBackground(panEnter);
    }//GEN-LAST:event_SubmitBtnMouseEntered

    private void SubmitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitBtnMouseExited
        // TODO add your handling code here:
        SubmitBtn.setBackground(panDefault);
    }//GEN-LAST:event_SubmitBtnMouseExited

    private void SubmitBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitBtnMousePressed
        // TODO add your handling code here:
        SubmitBtn.setBackground(panClick);
    }//GEN-LAST:event_SubmitBtnMousePressed

    private void SubmitBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitBtnMouseReleased
        // TODO add your handling code here:
        SubmitBtn.setBackground(panDefault);
    }//GEN-LAST:event_SubmitBtnMouseReleased

    private void LabelFullNamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_LabelFullNamePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelFullNamePropertyChange

    /**
     * @param args the command line arguments
     */
       public javax.swing.JLabel getLabelGender() {
        return LabelGender;
    }
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Student student = new Student();
                Student education = new Student();
                LoanSummary loanSummary = new LoanSummary(student, education);
                JOptionPane.showMessageDialog(null, "Hello, "+ student +"!(LoanSummary(Student student)");

                //loanSummary.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAddress;
    private javax.swing.JLabel LabelBirthdate;
    private javax.swing.JLabel LabelCivilStatus;
    private javax.swing.JLabel LabelDepartment;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelFullName;
    private javax.swing.JLabel LabelGender;
    private javax.swing.JLabel LabelGuardianName;
    private javax.swing.JLabel LabelGuardianPhoneNumber;
    private javax.swing.JLabel LabelIDNo;
    private javax.swing.JLabel LabelLastName1;
    private javax.swing.JLabel LabelLastName2;
    private javax.swing.JLabel LabelLastName3;
    private javax.swing.JLabel LabelNationality;
    private javax.swing.JLabel LabelNumOfYrsToPay;
    private javax.swing.JLabel LabelPhoneNumber;
    private javax.swing.JLabel LabelProgramEnrolled;
    private javax.swing.JLabel LabelRelationship;
    private javax.swing.JLabel LabelTotalAmountNeeded;
    private javax.swing.JLabel LabelWhatIsTheFundFor;
    private javax.swing.JLabel LabelYearLevel;
    private javax.swing.JLabel LabelZipCode;
    private javax.swing.JPanel SubmitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}