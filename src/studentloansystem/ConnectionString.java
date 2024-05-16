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


/**
 *
 * @author Panewels
 */
public class ConnectionString {
    
    private Connection con = null;
    
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
    
    public void addStudent(Student student, Student education, StudentLoan loan){
        try{
            JOptionPane.showMessageDialog(null, "addStudent:" + student + education);
        
        }
        
        
        catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void editStudent(Student student){
    
    }
    public void deactivateStudent(Student student){
    
    }
    
}