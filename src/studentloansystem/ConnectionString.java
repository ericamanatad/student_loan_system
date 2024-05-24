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
import java.text.DecimalFormat;
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
            conn.close();
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
        
             psSelectStudentName.close();
             conn.close();
             rs.close();
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
             psCountApplicants.close();
             conn.close();
             rs.close();
            
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
            PreparedStatement psTotalAmountReceivable = conn.prepareStatement(queryComputeAmountReceivable);
            ResultSet rs = psTotalAmountReceivable.executeQuery();
            
            if(rs.next()){
                totalAmountReceivable = rs.getDouble("total_amount_receivable");
            }
             psTotalAmountReceivable.close();
             conn.close();
             rs.close();
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
            
                    psCountApplicants.close();
                    conn.close();
                    rs.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error countActiveLoaners() :  " + ex.getMessage());
        }
        return countActiveLoaners;
    }   
 
    
     
        public List<String[]> viewLoanApplications() {
            List<String[]> loanApplications = new ArrayList<>();
            String queryViewLoanApplications = "SELECT l.id, l.amount, s.last_name, s.first_name, s.middle_name, s.is_active, l.created_on FROM student_table s JOIN loan_table l ON s.id = l.student_id WHERE s.is_active = 0;";
            try {
                // Update connection string with your database credentials
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentloansystem", "root", "");
                PreparedStatement psViewLoanApplications = conn.prepareStatement(queryViewLoanApplications);
                ResultSet rs = psViewLoanApplications.executeQuery();
                while (rs.next()) {
                    String[] tbData = new String[6]; // Increase array size to accommodate the created_on field
                    tbData[0] = "" + String.valueOf(rs.getInt("l.id")); // Prepend "SL" to loan ID
                    String fn = rs.getString("s.first_name");
                    String mn = rs.getString("s.middle_name");
                    String ln = rs.getString("s.last_name");
                    String studentName = fn + " " + mn + " " + ln;                  
                    tbData[1] = studentName;
                    tbData[2] = String.valueOf(rs.getDouble("l.amount"));
                    tbData[3] = rs.getString("s.is_active"); // Store as a String
                    // Format timestamp to string for display
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    tbData[4] = dateFormat.format(rs.getTimestamp("l.created_on")); // Add created_on timestamp
                    loanApplications.add(tbData);
                    
                    psViewLoanApplications.close();
                    conn.close();
                    rs.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error viewLoanApplications() :  " + ex.getMessage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            return loanApplications;
        }
        
            //get the applicant summary details - Tab(Applicant Summary)
        
        public void getApplicantSummary(int laCode, Student student, Student education, StudentLoan loan) {
        	String queryGetApplicantSummary = "SELECT * FROM loan_table l INNER JOIN student_table s ON l.student_id = s.id INNER JOIN education_table e ON s.id = e.student_id WHERE l.id = ?;";
            try {
                // Update connection string with your database credentials
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentloansystem", "root", "");
                PreparedStatement psGetApplicantSummary = conn.prepareStatement(queryGetApplicantSummary);
                psGetApplicantSummary.setInt(1,laCode );
                ResultSet rs = psGetApplicantSummary.executeQuery();
                
                //JOptionPane.showMessageDialog(null, ""+ laCode);
                        if (rs.next()) {
                        	student.setFirstName(rs.getString("s.first_name"));
                        	student.setMiddleName(rs.getString("s.middle_name"));
                        	student.setLastName(rs.getString("s.last_name"));
                        	student.setSuffix(rs.getString("s.suffix"));
                        	student.setBirthdate(rs.getString("s.birthdate"));
                        	student.setGender(rs.getString("s.gender"));
                        	student.setPhoneNumber(rs.getString("s.phone_number"));
                        	student.setEmailAddress(rs.getString("s.email"));
                        	student.setNationality(rs.getString("s.nationality"));
                        	student.setCivilStatus(rs.getString("s.civil_status"));
                        	student.setAddress(rs.getString("s.address")); 
                        	student.setZipCode(rs.getString("s.zip_code"));
                        	student.setGuardianFullName(rs.getString("s.guardian_fullname"));
                        	student.setGuardianRelationship(rs.getString("s.guardian_relationship"));
                        	student.setGuardianContactNumber(rs.getString("s.guardian_contact_number"));
                        	
                        	education.setIdNumber(rs.getString("e.student_id"));
                        	education.setDepartment(rs.getString("e.department"));
                        	education.setProgramEnrolled(rs.getString("e.program_enrolled"));
                        	education.setYearLevel(rs.getString("e.year_level"));

                            DecimalFormat df = new DecimalFormat("#.00");
                        	loan.setTotalAmount(Double.parseDouble(df.format(rs.getDouble("l.amount"))));
                        	loan.setNumYrsToPay(Double.parseDouble(df.format(rs.getDouble("l.num_of_yrs_to_pay"))));
                        	loan.setInterestRate(Double.parseDouble(df.format(rs.getDouble("l.interest_rate"))));
                        	loan.setTotalPayment(Double.parseDouble(df.format(rs.getDouble("l.total_payment"))));
                        	loan.setNumPayments(Double.parseDouble(df.format(rs.getDouble("l.num_of_payments"))));
                        	loan.setPaymentPerMonth(Double.parseDouble(df.format(rs.getDouble("l.monthly_payment"))));
                        	loan.setPurpose(rs.getString("l.loan_purpose"));
                        	//kulang created_on...	
                        	
                        

                        }
                        
                    psGetApplicantSummary.close();
                    conn.close();
                    rs.close();      
                }catch(Exception ex){
                        JOptionPane.showMessageDialog(null, "Error getApplicantSummary() :  " + ex.getMessage());

                }
        }
        //////////APPROVE APPLICANT
        //UPDATE student_table SET is_active = 1 WHERE id = '123-82345'
        //dbOperation.approveApplicant();
        public boolean approveApplicant(String studentID) {
            String queryApproveApplicant = "UPDATE student_table SET is_active = 1 WHERE id = ?;";
            JOptionPane.showMessageDialog(null, "public boolean approveApplicant(String studentID) :  " + studentID);

            boolean status = false;
            try { 
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentloansystem", "root", "");

                PreparedStatement psApproveApplicant = conn.prepareStatement(queryApproveApplicant);

                psApproveApplicant.setString(1,studentID );
                int rowsAffected = psApproveApplicant.executeUpdate();

                if (rowsAffected > 0) {
                    status = true;
                }

                psApproveApplicant.close();
                conn.close();

            }catch(Exception ex) {
                JOptionPane.showMessageDialog(null, "Error approveApplicant(String studentID) :  " + ex.getMessage());
            }
            return status;
        }

        //delete record
        public void deleteStudent(String studentID) {
            String queryDeleteStudent = "DELETE FROM student_table WHERE id = ?;";

            try { 
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentloansystem", "root", "");

                PreparedStatement psDeleteStudent = conn.prepareStatement(queryDeleteStudent);

                psDeleteStudent.setString(1, studentID);
                int rowsAffected = psDeleteStudent.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Student record deleted!");
                }

                psDeleteStudent.close();
                conn.close();

            }catch(Exception ex) {
                JOptionPane.showMessageDialog(null, "Error deleteStudent(String studentID) :  " + ex.getMessage());
            }
        }

        public void deleteLoanRecord(int loanID) {
            String queryDeleteLoanRecord = "DELETE FROM loan_table WHERE id = ?;";

            try { 
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentloansystem", "root", "");

                PreparedStatement psDeleteLoanRecord = conn.prepareStatement(queryDeleteLoanRecord);

                psDeleteLoanRecord.setInt(1, loanID);
                int rowsAffected = psDeleteLoanRecord.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Loan record deleted!");
                }

                psDeleteLoanRecord.close();
                conn.close();

            }catch(Exception ex) {
                JOptionPane.showMessageDialog(null, "Error deleteLoanRecord(String loanID) :  " + ex.getMessage());
            }

        }

        public void deleteEducation(String studentID) {
            String queryDeleteEducation = "DELETE FROM education_table WHERE student_id = ?;";

            try { 
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentloansystem", "root", "");

                PreparedStatement psDeleteEducation = conn.prepareStatement(queryDeleteEducation);

                psDeleteEducation.setString(1, studentID);
                int rowsAffected = psDeleteEducation.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Education record deleted!");
                }

                psDeleteEducation.close();
                conn.close();

            }catch(Exception ex) {
                JOptionPane.showMessageDialog(null, "Error deleteEducation(String educID) :  " + ex.getMessage());
            }

        }
        /*  public boolean disapproveApplicant(String studentID, int laCode) {
            String queryApproveApplicant = "UPDATE student_table SET is_active = 1 WHERE id = ?;";
            JOptionPane.showMessageDialog(null, "public boolean approveApplicant(String studentID) :  " + studentID);

            boolean status = false;
            try { 
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentloansystem", "root", "");

                PreparedStatement psApproveApplicant = conn.prepareStatement(queryApproveApplicant);

                psApproveApplicant.setString(1,studentID );
                int rowsAffected = psApproveApplicant.executeUpdate();

                if (rowsAffected > 0) {
                    status = true;
                    JOptionPane.showMessageDialog(null, "Applicant approved!");
                }

                psApproveApplicant.close();
                conn.close();

            }catch(Exception ex) {
                JOptionPane.showMessageDialog(null, "Error approveApplicant(String studentID) :  " + ex.getMessage());
            }
            return status;
        	
        }
        
        */
        
        
        
//     in payment tab, view student loan info
        public List<String[]> viewLoanerInfo(int laCode){
            List<String[]> viewLoanerInfo = new ArrayList<>();
            String queryViewLoanInfo = "SELECT l.id, s.last_name, s.first_name, s.middle_name, s.suffix,s.id, l.amount, l.num_of_yrs_to_pay , l.monthly_payment, l.total_payment FROM `loan_table`  l JOIN student_table s ON l.student_id = s.id WHERE l.id = ?;";
            try {
                // Update connection string with your database credentials
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentloansystem", "root", "");
                PreparedStatement psViewLoanInfo = conn.prepareStatement(queryViewLoanInfo);
                psViewLoanInfo.setInt(1,laCode );
                ResultSet rs = psViewLoanInfo.executeQuery();
                
                //JOptionPane.showMessageDialog(null, ""+ laCode);
                        while (rs.next()) {
                                String[] tbData = new String[7]; // Increase array size to accommodate the created_on field
                                tbData[0] = String.valueOf(rs.getInt("l.id")); // Prepend "SL" to loan ID
                                String fn = rs.getString("s.first_name");
                                String mn = rs.getString("s.middle_name");
                                String ln = rs.getString("s.last_name");
                                String studentName = fn + " " + mn + " " + ln;
                                String studentID = rs.getString("s.id");
                                tbData[1] = studentName;
                                tbData[2] = studentID;
                               
                                 // Format the double values to two decimal places
                                DecimalFormat df = new DecimalFormat("#.00");
                                tbData[3] = df.format(rs.getDouble("l.amount"));
                                tbData[4] = df.format(rs.getDouble("l.monthly_payment"));
                                tbData[5] = df.format(rs.getDouble("l.num_of_yrs_to_pay"));
                                tbData[6] = df.format(rs.getDouble("l.total_payment"));

                                viewLoanerInfo.add(tbData);
                        }
                        
                    psViewLoanInfo.close();
                    conn.close();
                    rs.close();      
                }catch(Exception ex){
                        JOptionPane.showMessageDialog(null, "Error viewLoanerInfo() :  " + ex.getMessage());

                }
            return viewLoanerInfo;

        }
        
        
        //when approving , also add partial transaction
        public void addPartialTransaction(int laCode, String studentID, double remainingBalance) {
        	String queryAddPartialTransaction = "INSERT INTO transaction_table (la_code, student_id, amount_paid, remaining_balance, date_paid) VALUES(?, ?, 0, ?, ?);";
        	try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentloansystem", "root", "");
	         PreparedStatement psAddPartialTransaction = conn.prepareStatement(queryAddPartialTransaction)) {

        		psAddPartialTransaction.setInt(1, laCode);
        		psAddPartialTransaction.setString(2, studentID);
        		psAddPartialTransaction.setDouble(3, remainingBalance);
                long timestampValue = System.currentTimeMillis();
                Timestamp paymentTimestamp = new Timestamp(timestampValue);

                psAddPartialTransaction.setTimestamp(4, paymentTimestamp);
                psAddPartialTransaction.executeUpdate();
                
                
                JOptionPane.showMessageDialog(null, "Applicant approved!");

                
	        	}catch(Exception ex) {
	                JOptionPane.showMessageDialog(null, "Error addPartialTransaction() - INSERT: " + ex.getMessage());
	        	}
	        }

        //storing payment history
	    public void addPaymentTransaction(int laCode, double inputPayment, String name, String studentID, double amountBorrowed, double monthlyPayment, double numOfYearsToPay, double remainingBalance) {
		    String queryGetStudentId = "SELECT student_id FROM loan_table WHERE id = ?;";
		    JOptionPane.showMessageDialog(null, "values passed in addPaymentTransaction : "+ inputPayment + ", " + laCode + ", " + name + ",  "+ studentID+ ", " + amountBorrowed + ", "+ monthlyPayment + ", " + numOfYearsToPay + ", "+ remainingBalance );
		
		    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentloansystem", "root", "");
		         PreparedStatement psGetStudentId = conn.prepareStatement(queryGetStudentId)) {
		
		        psGetStudentId.setInt(1, laCode);
		        ResultSet rs = psGetStudentId.executeQuery();
		
		        if (rs.next()) {
		            String studentId = rs.getString("student_id");
		
		            // Get the latest payment transaction from the database
		            String queryGetLatestPaymentTransaction = "SELECT * FROM transaction_table WHERE la_code = ? ORDER BY date_paid DESC LIMIT 1;";
		            try (PreparedStatement psGetLatestPaymentTransaction = conn.prepareStatement(queryGetLatestPaymentTransaction)) {
		                psGetLatestPaymentTransaction.setInt(1, laCode);
		                ResultSet rsLatestPayment = psGetLatestPaymentTransaction.executeQuery();
		
		                double oldRemainingBalance = 0;
		                if (rsLatestPayment.next()) {
		                    oldRemainingBalance = rsLatestPayment.getDouble("remaining_balance");
		                }
		
		                // Update the remaining balance based on the input payment
		                double newRemainingBalance = oldRemainingBalance - inputPayment;
		
		                // Add the new payment transaction to the database
		                String queryAddPaymentTransaction = "INSERT INTO transaction_table (la_code, student_id, amount_paid, remaining_balance, date_paid) VALUES (?, ?, ?, ?, ?);";
		                try (PreparedStatement psAddPaymentTransaction = conn.prepareStatement(queryAddPaymentTransaction)) {
		                    psAddPaymentTransaction.setInt(1, laCode);
		                    psAddPaymentTransaction.setString(2, studentId);
		                    psAddPaymentTransaction.setDouble(3, inputPayment);
		                    psAddPaymentTransaction.setDouble(4, newRemainingBalance);
		                    long timestampValue = System.currentTimeMillis();
		                    Timestamp paymentTimestamp = new Timestamp(timestampValue);
		
		                    psAddPaymentTransaction.setTimestamp(5, paymentTimestamp);
		                    psAddPaymentTransaction.executeUpdate();
		
		                    JOptionPane.showMessageDialog(null, "Payment recorded successfully. New remaining balance: PHP" + newRemainingBalance);
		
		                } catch (SQLException e) {
		                    JOptionPane.showMessageDialog(null, "Error addPaymentTransaction() - INSERT: " + e.getMessage());
		                }
		            } catch (SQLException e) {
		                JOptionPane.showMessageDialog(null, "Error addPaymentTransaction() - SELECT: " + e.getMessage());
		            }
		        } else {
		            JOptionPane.showMessageDialog(null, "Loan record not found for laCode: " + laCode);
		        }
		
		    } catch (SQLException e) {
		        JOptionPane.showMessageDialog(null, "Error addPaymentTransaction() - SELECT: " + e.getMessage());
		    }
	}
	    
	    
	    /*
	     *     public List<String[]> viewLoanApplications() {
            List<String[]> loanApplications = new ArrayList<>();
            String queryViewLoanApplications = "SELECT l.id, l.amount, s.last_name, s.first_name, s.middle_name, s.is_active, l.created_on FROM student_table s JOIN loan_table l ON s.id = l.student_id WHERE s.is_active = 0;";
            try {
                // Update connection string with your database credentials
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentloansystem", "root", "");
                PreparedStatement psViewLoanApplications = conn.prepareStatement(queryViewLoanApplications);
                ResultSet rs = psViewLoanApplications.executeQuery();
                while (rs.next()) {
                    String[] tbData = new String[6]; // Increase array size to accommodate the created_on field
                    tbData[0] = "" + String.valueOf(rs.getInt("l.id")); // Prepend "SL" to loan ID
                    String fn = rs.getString("s.first_name");
                    String mn = rs.getString("s.middle_name");
                    String ln = rs.getString("s.last_name");
                    String studentName = fn + " " + mn + " " + ln;                  
                    tbData[1] = studentName;
                    tbData[2] = String.valueOf(rs.getDouble("l.amount"));
                    tbData[3] = rs.getString("s.is_active"); // Store as a String
                    // Format timestamp to string for display
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    tbData[4] = dateFormat.format(rs.getTimestamp("l.created_on")); // Add created_on timestamp
                    loanApplications.add(tbData);
                    
                    psViewLoanApplications.close();
                    conn.close();
                    rs.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error viewLoanApplications() :  " + ex.getMessage());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            return loanApplications;
        }
        
	     */
	    public List<String[]> viewPaymentHistory(int laCode) {
	    	List<String[]> paymentHistory = new ArrayList<>();
	    
	    	String queryViewPaymentHistory = "SELECT * FROM transaction_table WHERE la_code = ?";
	    	try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentloansystem", "root", "");
	   	         PreparedStatement psViewPaymentHistory = conn.prepareStatement(queryViewPaymentHistory)) {

	    		 psViewPaymentHistory.setInt(1, laCode);
	    		 ResultSet rs = psViewPaymentHistory.executeQuery();
	    		 
	    		 while (rs.next()) { 
	    			 DecimalFormat df = new DecimalFormat("#.00");
	                    String[] tbData = new String[7]; 
	                    tbData[0] = "SL " + String.valueOf(rs.getInt("la_code")); 
	                    tbData[1] = rs.getString("student_id"); // Store as a String
	                    tbData[3] = String.valueOf(df.format(rs.getDouble("amount_paid")));
	                    tbData[4] = String.valueOf(df.format(rs.getDouble("remaining_balance")));
	                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	                    tbData[5] = dateFormat.format(rs.getTimestamp("date_paid"));
	                   paymentHistory.add(tbData);
	    		 }

	                   
	   	        	}catch(Exception ex) {
	   	                JOptionPane.showMessageDialog(null, "Error addPartialTransaction() - INSERT: " + ex.getMessage());
	   	        	}
	    		return paymentHistory;
	    	}
    
    
    

}
