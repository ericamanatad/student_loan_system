/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentloansystem;

/**
 *
 * @author edlution
 */
public class StudentLoan {
    private String studentID;
    private double totalAmount;
    private double numYrsToPay;
    private double interestRate;
    private double paymentPerMonth;
    private String purpose;
    

    public StudentLoan(String studentID, double totalAmount, double numYrsToPay, double interestRate, double paymentPerMonth, String purpose) {
        this.studentID = studentID;
        this.totalAmount = totalAmount;
        this.numYrsToPay = numYrsToPay;
        this.interestRate = interestRate;
        this.paymentPerMonth = paymentPerMonth;
        this.purpose = purpose;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getNumYrsToPay() {
        return numYrsToPay;
    }

    public void setNumYrsToPay(double numYrsToPay) {
        this.numYrsToPay = numYrsToPay;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getPaymentPerMonth() {
        return paymentPerMonth;
    }

    public void setPaymentPerMonth(double paymentPerMonth) {
        this.paymentPerMonth = paymentPerMonth;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "StudentLoan{" + "studentID=" + studentID 
                + ", totalAmount=" + totalAmount + ", numYrsToPay=" 
                + numYrsToPay + ", interestRate=" + interestRate 
                + ", purpose=" + purpose + '}';
    }
    
    
    
}
