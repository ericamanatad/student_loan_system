/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentloansystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.sql.Timestamp;
import javax.swing.table.DefaultTableModel;



        
/**
 *
 * @author Panewels
 */
public class ConnectionString {
    
    private Connection con = null;
    private static int lastGeneratedCode = 100010;

    
    private List<Student> students;
    
    public ConnectionString(){
        this.students = new ArrayList<>();
    }
    
    public static Connection DbConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentloansystem", "root", "");
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectionString.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Database connection failed: " + ex.getMessage());
            return null;
        }
    }
    
    public void addStudent(Student student, Student education, StudentLoan loan) {
        String studentQuery = "INSERT INTO student_table (id, last_name, first_name, middle_name, suffix, birthdate, gender, phone_number, email, nationality, civil_status, address, zip_code, guardian_fullname, guardian_relationship, guardian_contact_number ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        String educationQuery = "INSERT INTO education_table (student_id, department, program_enrolled, year_level) VALUES (?, ?, ?, ?)";
        String loanQuery = "INSERT INTO loan_table (student_id, amount, num_of_yrs_to_pay, interest_rate, monthly_payment, num_of_payments, total_payment, loan_purpose, created_on) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentloansystem", "root", "");
            PreparedStatement psStudent = conn.prepareStatement(studentQuery);
            PreparedStatement psEducation = conn.prepareStatement(educationQuery);
            PreparedStatement psLoan = conn.prepareStatement(loanQuery);
        ) {

            psStudent.setString(1, student.getIdNumber());
            psStudent.setString(2, student.getLastName());
            psStudent.setString(3, student.getFirstName());
            psStudent.setString(4, student.getMiddleName());
            psStudent.setString(5, student.getSuffix());
            psStudent.setDate(6, java.sql.Date.valueOf(student.getBirthdate()));
            psStudent.setString(7, student.getGender());
            psStudent.setString(8, student.getPhoneNumber());
            psStudent.setString(9, student.getEmailAddress());
            psStudent.setString(10, student.getNationality());
            psStudent.setString(11, student.getCivilStatus());
            psStudent.setString(12, student.getAddress());
            psStudent.setString(13, student.getZipCode());
            psStudent.setString(14, student.getGuardianFullName());
            psStudent.setString(15, student.getGuardianRelationship());
            psStudent.setString(16, student.getGuardianContactNumber());
            psStudent.executeUpdate();



            psEducation.setString(1, student.getIdNumber());
            psEducation.setString(2, education.getDepartment());
            psEducation.setString(3, education.getProgramEnrolled());
            psEducation.setString(4, education.getYearLevel());
            psEducation.executeUpdate();

            
            long timestampValue = System.currentTimeMillis();
            Timestamp timestamp = new Timestamp(timestampValue);
       
            
            psLoan.setString(1, student.getIdNumber());
            psLoan.setDouble(2, loan.getTotalAmount());
            psLoan.setDouble(3, loan.getNumYrsToPay());
            psLoan.setDouble(4, loan.getInterestRate());
            psLoan.setDouble(5, loan.getPaymentPerMonth());
            psLoan.setDouble(6, loan.getNumPayments());
            psLoan.setDouble(7, loan.getTotalPayment());
            psLoan.setString(8, loan.getPurpose());
            psLoan.setTimestamp(9, timestamp);
            psLoan.executeUpdate();

            JOptionPane.showMessageDialog(null, "Student added successfully");
            SL_Code slCode = new SL_Code(student, loan);
            slCode.setVisible(true);
            psStudent.close();
            psEducation.close();
            psLoan.close();
            conn.close();


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error adding student: " + e.getMessage());
        }

}
    //get the SL Code and Date of creation of student loan application
    public String[] getSLCodeAndCreatedOn(StudentLoan loan, Student student) {
        String[] codeAndTimestamp = new String[2];
        
        String queryViewSLcodeAndTimestamp = "SELECT id, created_on FROM loan_table WHERE student_id = ?";
        try (
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentloansystem", "root", "");
             PreparedStatement psSLCodeTimestamp = conn.prepareStatement(queryViewSLcodeAndTimestamp)) {
            
            psSLCodeTimestamp.setString(1, student.getIdNumber());
            ResultSet rs = psSLCodeTimestamp.executeQuery();

            if (rs.next()) {
                codeAndTimestamp[0] = rs.getString("id");
                codeAndTimestamp[1] = rs.getString("created_on");
            } else {
                codeAndTimestamp[0] = "No SL Code found for this student.";
                codeAndTimestamp[1]  = "";
            }
            rs.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error in getting SL Code : " + ex.getMessage());
            codeAndTimestamp[0] = "Error in getting SL Code";
            codeAndTimestamp[1]  = "";
        }
        return codeAndTimestamp;
    }
    

    // check the LAC - Loan Application Code
    public boolean checkLAC(int trackCode){
        boolean status = false;
        String query = "SELECT * FROM loan_table WHERE id = ?";
        try{
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentloansystem", "root", "");
            PreparedStatement psCheckLAC = conn.prepareStatement(query);
            psCheckLAC.setInt(1, trackCode);
            ResultSet rs = psCheckLAC.executeQuery();
            
            if (rs.next()){
                status = true;
            }else{
                status = false;
            }
            psCheckLAC.close();
            rs.close();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error : " + ex.getMessage());
        }
        
            return status;
    }
    
    public String getStudentName(int trackCode, Student student){
        String firstName = "";
        String midName = "";
        String lastName = "";
        String studentName = " ";
        String querySelectStudentName = "SELECT s.last_name, s.first_name, s.middle_name FROM student_table s JOIN loan_table l ON s.id = l.student_id WHERE l.id = ?";
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentloansystem", "root", "");
            PreparedStatement psSelectStudentName = conn.prepareStatement(querySelectStudentName);
            
            psSelectStudentName.setInt(1, trackCode);
            ResultSet rs = psSelectStudentName.executeQuery();
            
            if(rs.next()){
                firstName = rs.getString("s.first_name");
                midName = rs.getString("s.middle_name");
                lastName = rs.getString("s.last_name");
                studentName = firstName + " " + midName + " " + lastName;
            }
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error getting student name : " + ex.getMessage());
        }
        
        return studentName;
    }   
    
    public int countTotalApplicants(){
        int totalApplicants = 0;
        String queryCountTotalApplicants = "SELECT COUNT(*) AS count_active_students FROM student_table s JOIN loan_table l ON s.id = l.student_id;";
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentloansystem", "root", "");
            PreparedStatement psCountApplicants = conn.prepareStatement(queryCountTotalApplicants);
            
            
            ResultSet rs = psCountApplicants.executeQuery();
            if(rs.next()){
                totalApplicants = rs.getInt("count_active_students");
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error countTotalApplicants() :  " + ex.getMessage());
        }
        return totalApplicants;
    }
    
    //
    public double totalAmountReceivable(){
        double totalAmountReceivable = 0;
        String queryComputeAmountReceivable = "SELECT SUM(ROUND(total_payment, 2)) AS total_amount_receivable FROM loan_table l\n"
        		+ "JOIN student_table s ON s.id = l.student_id WHERE is_active =1;";
        try{
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentloansystem", "root", "");
            PreparedStatement psCountApplicants = conn.prepareStatement(queryComputeAmountReceivable);
            ResultSet rs = psCountApplicants.executeQuery();
            
            if(rs.next()){
                totalAmountReceivable = rs.getDouble("total_amount_receivable");
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error totalAmountReceivable() :  " + ex.getMessage());

        }
        return totalAmountReceivable;
    }
    
        public int countActiveLoaners(){
        int countActiveLoaners = 0;
        String queryCountTotalApplicants = "SELECT COUNT(*) AS count_active_loaners FROM student_table s JOIN loan_table l ON s.id = l.student_id WHERE s.is_active = 1;";
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentloansystem", "root", "");
            PreparedStatement psCountApplicants = conn.prepareStatement(queryCountTotalApplicants);
            
            
            ResultSet rs = psCountApplicants.executeQuery();
            if(rs.next()){
                countActiveLoaners = rs.getInt("count_active_loaners");
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error countActiveLoaners() :  " + ex.getMessage());
        }
        return countActiveLoaners;
    }   
     //   SELECT s.* FROM student_table s JOIN loan_table l ON s.id = l.student_id WHERE s.is_active = 1;
     public String[] viewLoanApplications(){
        String[] tbData =  new String[4];
        String fn, mn, ln, studentName;Double amount;boolean status;int loanID;
        String queryViewLoanApplications = "SELECT l.id, l.amount , s.last_name, s.first_name, s.middle_name, s.is_active FROM student_table s JOIN loan_table l ON s.id = l.student_id WHERE s.is_active = 1;";
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentloansystem", "root", "");
            PreparedStatement psViewLoanApplications = conn.prepareStatement(queryViewLoanApplications);
            
            
           ResultSet rs = psViewLoanApplications.executeQuery();
            if(rs.next()){
                tbData[0] = String.valueOf(rs.getInt("l.id"));
                fn = rs.getString("s.first_name");
                mn = rs.getString("s.middle_name");
                ln = rs.getString("s.last_name");
                studentName = fn + " " + mn + " " + ln;
                tbData[1] = studentName;
                tbData[2]= String.valueOf(rs.getDouble("l.amount"));
                tbData[3] = String.valueOf(rs.getBoolean("s.is_active"));
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error viewLoanApplications() :  " + ex.getMessage());
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return tbData;
    }   
     /*
     String[] codeAndTimestamp = new String[2];
        
        String queryViewSLcodeAndTimestamp = "SELECT id, created_on FROM loan_table WHERE student_id = ?";
        try (
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentloansystem", "root", "");
             PreparedStatement psSLCodeTimestamp = conn.prepareStatement(queryViewSLcodeAndTimestamp)) {
            
            psSLCodeTimestamp.setString(1, student.getIdNumber());
            ResultSet rs = psSLCodeTimestamp.executeQuery();

            if (rs.next()) {
                codeAndTimestamp[0] = rs.getString("id");
                codeAndTimestamp[1] = rs.getString("created_on");
            } else {
                codeAndTimestamp[0] = "No SL Code found for this student.";
                codeAndTimestamp[1]  = "";
            }
            rs.close();
     */
}