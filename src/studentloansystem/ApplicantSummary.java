/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentloansystem;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Panewels
 */
public class ApplicantSummary extends javax.swing.JFrame {

    /**
     * Creates new form ApplicantSummary
     */
    Color panDefault, panClick, panEnter, decDefault, decClick, decEnter;
    private Student student;
    private Student education;
    private StudentLoan loan;
    private int loanID= 0;

    public ApplicantSummary() {
    	initComponents();
    }
    
    public ApplicantSummary(int loanID) {
    	this.loanID = loanID;
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        panDefault = new Color(65,109,25);
        panClick = new Color(141, 236, 180);
        panEnter = new Color(65, 176, 110);
        decDefault = new Color (184,0 , 0);
        decClick = new Color(255, 162, 127);
        decEnter = new Color(231, 41, 41);
        
}
    
    
    public ApplicantSummary(Student student, Student education, StudentLoan loan) {
        initComponents();
        this.student = student;
        this.education = education;
        this.loan = loan;
        setResizable(false);
        panDefault = new Color(65,109,25);
        panClick = new Color(141, 236, 180);
        panEnter = new Color(65, 176, 110);
    } 
    
    public void viewApplicantSummary(int loanID) {
    	  try {
    		  JOptionPane.showMessageDialog(null, "ApplicantSummary(int code) : "+ loanID);
              LblLACode.setText(""+ loanID);
              ConnectionString dbOperation = new ConnectionString();
              Student education = new Student();
              Student student = new Student();
              StudentLoan loan = new StudentLoan();
              dbOperation.getApplicantSummary(loanID, student, education, loan);
              
              System.out.println(student.getFirstName());
              //change label texts
              LabelIDNo12.setText("" +  education.getIdNumber());
              LabelFullName.setText("<html><b>Full Name:</b> " + student.getFirstName() + " " + student.getMiddleName() + " "+ student.getLastName() + "</html>");
              LabelBirthdate.setText("<html><b>Birthdate:</b> " + student.getBirthdate() + "</html>");
              LabelGender.setText("<html><b>Gender:</b> " + student.getGender() + "</html>");
              LabelPhoneNumber.setText("<html><b>Phone Number:</b> " + student.getPhoneNumber() + "</html>");
              LabelEmail.setText("<html><b>Email Address:</b> " + student.getEmailAddress() + "</html>");
              LabelNationality.setText("<html><b>Nationality:</b> " + student.getNationality() + "</html>");
              LabelCivilStatus.setText("<html><b>Civil Status:</b> " + student.getCivilStatus() + "</html>");
              LabelAddress.setText("<html><b>Address:</b> " + student.getAddress() + "</html>");
              LabelZipCode.setText("<html><b>Zip Code:</b> " + student.getZipCode() + "</html>");
              LabelGuardianName.setText("<html><b>Name of parent/guardian:</b> " + student.getGuardianFullName() + "</html>");
              LabelRelationship.setText("<html><b>Relationship:</b> " + student.getGuardianRelationship() + "</html>");
              LabelGuardianPhoneNumber.setText("<html><b>Phone Number:</b> " + student.getGuardianContactNumber() + "</html>");
              LabelDepartment.setText("<html><b>Department Name:</b> " + education.getDepartment() + "</html>");
              LabelProgramEnrolled.setText("<html><b>Program Enrolled:</b> " + education.getProgramEnrolled() + "</html>");
              LabelYearLevel.setText("<html><b>Year Level:</b> " + education.getYearLevel() + "</html>");
              LabelTotalAmountNeeded.setText("<html><b>Total amount needed:</b> " + loan.getTotalAmount() + "</html>");
              LabelNumOfYrsToPay.setText("<html><b>Number of years to pay:</b> " + loan.getNumYrsToPay() + "</html>");
              LabelInterestRate.setText("<html><b>Interest Rate:</b> " + loan.getInterestRate() + "</html>");
              LabelWhatIsTheFundFor.setText("<html><b>What is the fund for?:</b> " + loan.getPurpose() + "</html>");
              LabelPaymentPerMonth.setText("<html><b>Payment per Month:</b> " + loan.getPaymentPerMonth() + "</html>");
              LabelNumberOfPayments.setText("<html><b>Number of Payments:</b>  " + loan.getNumPayments() + "</html>");
              LabelTotalPayment12.setText("" + loan.getTotalPayment());
              
    	  }catch(Exception ex) {
    		  JOptionPane.showMessageDialog(null, ex.getMessage());
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

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LabelLastName2 = new javax.swing.JLabel();
        LabelIDNo12 = new javax.swing.JLabel();
        LabelFullName = new javax.swing.JLabel();
        LabelBirthdate = new javax.swing.JLabel();
        LabelGender = new javax.swing.JLabel();
        LabelPhoneNumber = new javax.swing.JLabel();
        LabelEmail = new javax.swing.JLabel();
        LabelNationality = new javax.swing.JLabel();
        LabelCivilStatus = new javax.swing.JLabel();
        LabelAddress = new javax.swing.JLabel();
        LabelZipCode = new javax.swing.JLabel();
        LabelYearLevel = new javax.swing.JLabel();
        LabelProgramEnrolled = new javax.swing.JLabel();
        LabelDepartment = new javax.swing.JLabel();
        LabelLastName3 = new javax.swing.JLabel();
        LabelGuardianPhoneNumber = new javax.swing.JLabel();
        LabelRelationship = new javax.swing.JLabel();
        LabelGuardianName = new javax.swing.JLabel();
        LabelLastName1 = new javax.swing.JLabel();
        LabelLastName5 = new javax.swing.JLabel();
        LabelTotalAmountNeeded = new javax.swing.JLabel();
        LabelNumOfYrsToPay = new javax.swing.JLabel();
        LabelInterestRate = new javax.swing.JLabel();
        LabelWhatIsTheFundFor = new javax.swing.JLabel();
        LabelLastName4 = new javax.swing.JLabel();
        LabelPaymentPerMonth = new javax.swing.JLabel();
        LabelNumberOfPayments = new javax.swing.JLabel();
        LabelTotalPayment12 = new javax.swing.JLabel();
        ApproveBtn = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        DeclineBtn = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        LblLACode = new javax.swing.JLabel();
        LabelTotalPayment = new javax.swing.JLabel();
        LabelIDNo = new javax.swing.JLabel();
        LblLACode12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APPLICANT");
        setBackground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(783, 680));

        jPanel2.setBackground(new java.awt.Color(65, 109, 25));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(65, 109, 25));
        jLabel4.setText("Summary of application details:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/student.png"))); // NOI18N

        LabelLastName2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        LabelLastName2.setText("STUDENT APPLICANT");
        LabelLastName2.setName(""); // NOI18N

        LabelIDNo12.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelIDNo12.setText("Student ID No. ");

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

        LabelYearLevel.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelYearLevel.setText("Year Level:");

        LabelProgramEnrolled.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelProgramEnrolled.setText("Program Enrolled:");

        LabelDepartment.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelDepartment.setText("Department Name:");

        LabelLastName3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        LabelLastName3.setText("EDUCATION");
        LabelLastName3.setName(""); // NOI18N

        LabelGuardianPhoneNumber.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelGuardianPhoneNumber.setText("Phone Number:");

        LabelRelationship.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelRelationship.setText("Relationship:");

        LabelGuardianName.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelGuardianName.setText("Name of parent/guardian : ");

        LabelLastName1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        LabelLastName1.setText("GUARDIAN");
        LabelLastName1.setName(""); // NOI18N

        LabelLastName5.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        LabelLastName5.setText("LOAN");
        LabelLastName5.setName(""); // NOI18N

        LabelTotalAmountNeeded.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelTotalAmountNeeded.setText("Total amount needed:");

        LabelNumOfYrsToPay.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelNumOfYrsToPay.setText("Number of years to pay:");

        LabelInterestRate.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelInterestRate.setText("Interest Rate :");

        LabelWhatIsTheFundFor.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelWhatIsTheFundFor.setText("What is the fund for?");

        LabelLastName4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        LabelLastName4.setText("PAYMENT");
        LabelLastName4.setName(""); // NOI18N

        LabelPaymentPerMonth.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelPaymentPerMonth.setText("Payment per Month:");

        LabelNumberOfPayments.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelNumberOfPayments.setText("Number of Payments: ");

        LabelTotalPayment12.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelTotalPayment12.setText("Total Payment : ");

        ApproveBtn.setBackground(new java.awt.Color(65, 109, 25));
        ApproveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApproveBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ApproveBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ApproveBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ApproveBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ApproveBtnMouseReleased(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("APPROVE");

        javax.swing.GroupLayout ApproveBtnLayout = new javax.swing.GroupLayout(ApproveBtn);
        ApproveBtn.setLayout(ApproveBtnLayout);
        ApproveBtnLayout.setHorizontalGroup(
            ApproveBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApproveBtnLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel22)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        ApproveBtnLayout.setVerticalGroup(
            ApproveBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApproveBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        DeclineBtn.setBackground(new java.awt.Color(184, 0, 0));
        DeclineBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeclineBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeclineBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeclineBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DeclineBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DeclineBtnMouseReleased(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("DECLINE");

        javax.swing.GroupLayout DeclineBtnLayout = new javax.swing.GroupLayout(DeclineBtn);
        DeclineBtn.setLayout(DeclineBtnLayout);
        DeclineBtnLayout.setHorizontalGroup(
            DeclineBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeclineBtnLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel23)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        DeclineBtnLayout.setVerticalGroup(
            DeclineBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeclineBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        LblLACode.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); // NOI18N
        LblLACode.setForeground(new java.awt.Color(65, 109, 25));
        LblLACode.setText("SL1000");

        LabelTotalPayment.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelTotalPayment.setText("Total Payment:");

        LabelIDNo.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        LabelIDNo.setText("Student ID No. ");

        LblLACode12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); // NOI18N
        LblLACode12.setForeground(new java.awt.Color(65, 109, 25));
        LblLACode12.setText("SL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblLACode12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblLACode))
                    .addComponent(jLabel4))
                .addContainerGap(242, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelLastName2)
                                    .addComponent(LabelFullName)
                                    .addComponent(LabelBirthdate)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelIDNo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LabelIDNo12)))
                                .addGap(120, 120, 120)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelLastName3)
                                    .addComponent(LabelProgramEnrolled)
                                    .addComponent(LabelDepartment)
                                    .addComponent(LabelYearLevel)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelPhoneNumber)
                                    .addComponent(LabelGender)
                                    .addComponent(LabelAddress)
                                    .addComponent(LabelEmail)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(LabelCivilStatus)
                                        .addComponent(LabelNationality))
                                    .addComponent(LabelZipCode)
                                    .addComponent(LabelLastName1)
                                    .addComponent(LabelGuardianName)
                                    .addComponent(LabelRelationship)
                                    .addComponent(LabelGuardianPhoneNumber))
                                .addGap(143, 143, 143)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelLastName4)
                                    .addComponent(LabelNumberOfPayments)
                                    .addComponent(LabelPaymentPerMonth)
                                    .addComponent(LabelInterestRate)
                                    .addComponent(LabelNumOfYrsToPay)
                                    .addComponent(LabelTotalAmountNeeded)
                                    .addComponent(LabelLastName5)
                                    .addComponent(LabelWhatIsTheFundFor)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelTotalPayment)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LabelTotalPayment12)))))
                        .addContainerGap(140, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ApproveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(DeclineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblLACode12)
                            .addComponent(LblLACode))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelLastName2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelIDNo)
                            .addComponent(LabelIDNo12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFullName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBirthdate))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelLastName3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelDepartment)
                        .addGap(8, 8, 8)
                        .addComponent(LabelProgramEnrolled)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelYearLevel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelGender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                        .addGap(8, 8, 8)
                        .addComponent(LabelLastName5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelTotalAmountNeeded)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelNumOfYrsToPay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelInterestRate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelWhatIsTheFundFor)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelLastName1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelGuardianName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelRelationship)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelGuardianPhoneNumber))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelLastName4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelPaymentPerMonth)
                        .addGap(8, 8, 8)
                        .addComponent(LabelNumberOfPayments)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelTotalPayment)
                            .addComponent(LabelTotalPayment12))))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ApproveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeclineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LabelFullNamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_LabelFullNamePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelFullNamePropertyChange

    private void ApproveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApproveBtnMouseClicked

        //code where to navigate next?
        //shall we now add the student
        //--erica
        //instantiate connectionString
        //ConnectionString dbOperation = new ConnectionString();
        //show msgDialog to confirm if done and sure with their inputs
        //dbOperation.addStudent(student, education, loan);
        //this.dispose();
    }//GEN-LAST:event_ApproveBtnMouseClicked

    private void ApproveBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApproveBtnMouseEntered
        // TODO add your handling code here:
        ApproveBtn.setBackground(panEnter);
    }//GEN-LAST:event_ApproveBtnMouseEntered

    private void ApproveBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApproveBtnMouseExited
        // TODO add your handling code here:
        ApproveBtn.setBackground(panDefault);
    }//GEN-LAST:event_ApproveBtnMouseExited

    private void ApproveBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApproveBtnMousePressed
        // TODO add your handling code here:
        ApproveBtn.setBackground(panClick);
    }//GEN-LAST:event_ApproveBtnMousePressed

    private void ApproveBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApproveBtnMouseReleased
        // TODO add your handling code here:
        ApproveBtn.setBackground(panDefault);
    }//GEN-LAST:event_ApproveBtnMouseReleased

    private void DeclineBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeclineBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DeclineBtnMouseClicked

    private void DeclineBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeclineBtnMouseEntered
        // TODO add your handling code here:
        DeclineBtn.setBackground(decEnter);
    }//GEN-LAST:event_DeclineBtnMouseEntered

    private void DeclineBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeclineBtnMouseExited
        // TODO add your handling code here:
        DeclineBtn.setBackground(decDefault);
    }//GEN-LAST:event_DeclineBtnMouseExited

    private void DeclineBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeclineBtnMousePressed
        // TODO add your handling code here:
        DeclineBtn.setBackground(decClick);
    }//GEN-LAST:event_DeclineBtnMousePressed

    private void DeclineBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeclineBtnMouseReleased
        // TODO add your handling code here:
        DeclineBtn.setBackground(decDefault);
    }//GEN-LAST:event_DeclineBtnMouseReleased

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
            java.util.logging.Logger.getLogger(ApplicantSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApplicantSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApplicantSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApplicantSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApplicantSummary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ApproveBtn;
    private javax.swing.JPanel DeclineBtn;
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
    private javax.swing.JLabel LabelIDNo12;
    private javax.swing.JLabel LabelInterestRate;
    private javax.swing.JLabel LabelLastName1;
    private javax.swing.JLabel LabelLastName2;
    private javax.swing.JLabel LabelLastName3;
    private javax.swing.JLabel LabelLastName4;
    private javax.swing.JLabel LabelLastName5;
    private javax.swing.JLabel LabelNationality;
    private javax.swing.JLabel LabelNumOfYrsToPay;
    private javax.swing.JLabel LabelNumberOfPayments;
    private javax.swing.JLabel LabelPaymentPerMonth;
    private javax.swing.JLabel LabelPhoneNumber;
    private javax.swing.JLabel LabelProgramEnrolled;
    private javax.swing.JLabel LabelRelationship;
    private javax.swing.JLabel LabelTotalAmountNeeded;
    private javax.swing.JLabel LabelTotalPayment;
    private javax.swing.JLabel LabelTotalPayment12;
    private javax.swing.JLabel LabelWhatIsTheFundFor;
    private javax.swing.JLabel LabelYearLevel;
    private javax.swing.JLabel LabelZipCode;
    private javax.swing.JLabel LblLACode;
    private javax.swing.JLabel LblLACode12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
