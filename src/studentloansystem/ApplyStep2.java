/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentloansystem;
import java.util.Scanner;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Panewels
 */
public class ApplyStep2 extends javax.swing.JFrame {

    private Student student;
    //ApplyStep2 apply2;
    
    Color panDefault, panClick, panEnter; 
    public ApplyStep2(Student student) {
        this.student = student;
        initComponents();
        setResizable(false);
        panDefault = new Color(65,109,25);
        panClick = new Color(141, 236, 180);
        panEnter = new Color(65, 176, 110);
        
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem5 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem6 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem7 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem8 = new javax.swing.JCheckBoxMenuItem();
        Panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        SubmitBtn = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jApplyBtn = new javax.swing.JLabel();
        RedirectBtn = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtNumOfYrsToPay = new javax.swing.JTextField();
        jComboBoxLoanPlan = new javax.swing.JComboBox();
        panelCheckBoxes = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        comboBoxDepartment = new javax.swing.JComboBox<>();
        comboBoxProgramEnrolled = new javax.swing.JComboBox<>();
        comboBoxYearLevel = new javax.swing.JComboBox<>();

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(65, 109, 25));
        jLabel5.setText("Personal Information:");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("jCheckBoxMenuItem4");

        jCheckBoxMenuItem5.setSelected(true);
        jCheckBoxMenuItem5.setText("jCheckBoxMenuItem5");

        jCheckBoxMenuItem6.setSelected(true);
        jCheckBoxMenuItem6.setText("jCheckBoxMenuItem6");

        jCheckBoxMenuItem7.setSelected(true);
        jCheckBoxMenuItem7.setText("jCheckBoxMenuItem7");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jCheckBoxMenuItem8.setSelected(true);
        jCheckBoxMenuItem8.setText("jCheckBoxMenuItem8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOAN APPLICATION FORM");

        Panel.setBackground(java.awt.Color.white);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(65, 109, 25));
        jLabel4.setText("Student Loan Application");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/student.png"))); // NOI18N

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

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("SUBMIT");

        javax.swing.GroupLayout SubmitBtnLayout = new javax.swing.GroupLayout(SubmitBtn);
        SubmitBtn.setLayout(SubmitBtnLayout);
        SubmitBtnLayout.setHorizontalGroup(
            SubmitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubmitBtnLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel21)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        SubmitBtnLayout.setVerticalGroup(
            SubmitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubmitBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(65, 109, 25));
        jLabel6.setText("Education Details:");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel2.setText("Department Name:");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel3.setText("Program Enrolled:");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel7.setText("Year Level:");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(65, 109, 25));
        jLabel9.setText("Loan Plan:");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel10.setText("Number of years to pay:");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel11.setText("What is the fund for?");

        jApplyBtn.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jApplyBtn.setText("Already submitted loan application?");
        jApplyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jApplyBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jApplyBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jApplyBtnMouseExited(evt);
            }
        });

        RedirectBtn.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        RedirectBtn.setText("Click Here to check your status");
        RedirectBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RedirectBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RedirectBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RedirectBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );

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

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel12.setText("Choose Loan Plan:");

        jComboBoxLoanPlan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1000.00", "2000.00", "3000.00", "4000.00", "5000.00", "10000.00", " ", " ", " " }));
        jComboBoxLoanPlan.setName("comboBoxLoanPlan"); // NOI18N

        jCheckBox1.setBackground(java.awt.Color.white);
        jCheckBox1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jCheckBox1.setText("Tuition Fee");

        jCheckBox2.setBackground(java.awt.Color.white);
        jCheckBox2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jCheckBox2.setText("Gadget/s for School");

        jCheckBox3.setBackground(java.awt.Color.white);
        jCheckBox3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jCheckBox3.setText("Allowance");

        jCheckBox4.setBackground(java.awt.Color.white);
        jCheckBox4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jCheckBox4.setText("Thesis");

        javax.swing.GroupLayout panelCheckBoxesLayout = new javax.swing.GroupLayout(panelCheckBoxes);
        panelCheckBoxes.setLayout(panelCheckBoxesLayout);
        panelCheckBoxesLayout.setHorizontalGroup(
            panelCheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCheckBoxesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(panelCheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox3))
                .addContainerGap())
        );
        panelCheckBoxesLayout.setVerticalGroup(
            panelCheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCheckBoxesLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(panelCheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox4))
                .addContainerGap())
        );

        comboBoxDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Technology", "Education", "Business" }));

        comboBoxProgramEnrolled.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BS Information Technology", "BS Industrial Technology", "BS Computer Technology", "BEED General Content", "BSED English", "BSED Math", "BSED Filipino", "BSBA HRDM", "BSBA MM" }));

        comboBoxYearLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jApplyBtn)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                .addComponent(RedirectBtn)
                                .addGap(14, 14, 14)))
                        .addGap(57, 57, 57))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboBoxDepartment, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboBoxYearLevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboBoxProgramEnrolled, javax.swing.GroupLayout.Alignment.LEADING, 0, 381, Short.MAX_VALUE)))
                        .addGap(540, 540, 540)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelCheckBoxes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBoxLoanPlan, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNumOfYrsToPay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)))
                                .addGap(38, 38, 38)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(668, 668, 668)
                .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jApplyBtn)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RedirectBtn)))
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel12)))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxLoanPlan, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(comboBoxDepartment))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(comboBoxProgramEnrolled, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxYearLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(txtNumOfYrsToPay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelCheckBoxes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(479, 479, 479))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitBtnMouseReleased
        // TODO add your handling code here:
        SubmitBtn.setBackground(panDefault);
    }//GEN-LAST:event_SubmitBtnMouseReleased

    private void SubmitBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitBtnMousePressed
        // TODO add your handling code here:
        SubmitBtn.setBackground(panClick);
    }//GEN-LAST:event_SubmitBtnMousePressed

    private void SubmitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitBtnMouseExited
        // TODO add your handling code here:
        SubmitBtn.setBackground(panDefault);
    }//GEN-LAST:event_SubmitBtnMouseExited

    private void SubmitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitBtnMouseEntered
        // TODO add your handling code here:
        SubmitBtn.setBackground(panEnter);
    }//GEN-LAST:event_SubmitBtnMouseEntered

    private void SubmitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitBtnMouseClicked
        
        String idNumber = student.getIdNumber();
        String department = (String) comboBoxDepartment.getSelectedItem();
        String programEnrolled = (String) comboBoxProgramEnrolled.getSelectedItem();
        String yearLevel =  (String) comboBoxYearLevel.getSelectedItem();
        
        String amountChoice = (String) jComboBoxLoanPlan.getSelectedItem();
        double amountToLoan = 0;

        try {
        amountToLoan = Double.parseDouble(amountChoice); // Use parseDouble instead of valueOf for clarity
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid amount selected."); // Changed 'this' to 'null'
        }
        double numOfYrsToPay = 0;
            try {
                numOfYrsToPay = Double.parseDouble(txtNumOfYrsToPay.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid number of years to pay. Please enter a number.");
                return;
            }        
        double numPayments = numOfYrsToPay * 12;
        double interestRate = 0.005;
        double monthlyPayment = 0;
        double totalPayment = 0;
        monthlyPayment = amountToLoan * (interestRate * Math.pow(1 + interestRate, numPayments)) / (Math.pow(1 + interestRate, numPayments) - 1);
        totalPayment = numPayments * monthlyPayment;

        
        String purpose;
        StringBuilder chosenItemInPanel = new StringBuilder();
        Component[] components = panelCheckBoxes.getComponents();
            for (Component component : components) {
                if (component instanceof JCheckBox) {
                    JCheckBox checkBox = (JCheckBox) component;
            if (checkBox.isSelected()) {
                chosenItemInPanel.append(checkBox.getText()).append(" ");
            }
    }
}
        purpose = chosenItemInPanel.toString().trim();
        
        JOptionPane.showMessageDialog(null, "Loan details " + amountToLoan  + numOfYrsToPay + interestRate + " " + purpose);

        Student education = new Student(idNumber, department, programEnrolled, yearLevel);
        StudentLoan loan = new StudentLoan(student.getIdNumber(),amountToLoan,  numOfYrsToPay, interestRate, monthlyPayment, purpose, numPayments, totalPayment );
        
        LoanSummary loanSummary = new LoanSummary(student, education, loan);
        loanSummary.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SubmitBtnMouseClicked

    private void jApplyBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jApplyBtnMouseClicked
        // TODO add your handling code here:

        ApplyStep1 step1 = new ApplyStep1();
        step1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jApplyBtnMouseClicked

    private void jApplyBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jApplyBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jApplyBtnMouseEntered

    private void jApplyBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jApplyBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jApplyBtnMouseExited

    private void RedirectBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RedirectBtnMouseClicked
        // TODO add your handling code here:
        StudentCode std = new StudentCode();
        std.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RedirectBtnMouseClicked

    private void RedirectBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RedirectBtnMouseEntered
        // TODO add your handling code here:
        RedirectBtn.setForeground(new Color(12,72,187));

    }//GEN-LAST:event_RedirectBtnMouseEntered

    private void RedirectBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RedirectBtnMouseExited
        // TODO add your handling code here:
        RedirectBtn.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_RedirectBtnMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Student student = new Student(); 
                ApplyStep2 apply2 = new ApplyStep2(student);
                apply2.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel RedirectBtn;
    private javax.swing.JPanel SubmitBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> comboBoxDepartment;
    private javax.swing.JComboBox<String> comboBoxProgramEnrolled;
    private javax.swing.JComboBox<String> comboBoxYearLevel;
    private javax.swing.JLabel jApplyBtn;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem5;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem6;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem7;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem8;
    private javax.swing.JComboBox jComboBoxLoanPlan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPanel panelCheckBoxes;
    private javax.swing.JTextField txtNumOfYrsToPay;
    // End of variables declaration//GEN-END:variables
}
