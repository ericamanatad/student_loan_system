/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentloansystem;

/**
 *
 * @author edlution
 */
public class StudentLoan  extends Student {
    private String studentID;
    private double totalAmount;
    private double numYrsToPay;
    private double interestRate;
    private double paymentPerMonth;
    private String purpose;
    private double numPayments;
    private double totalPayment;
    public StudentLoan(){
    }
    
    public StudentLoan(String studentID, double totalAmount, double numYrsToPay, double interestRate, double paymentPerMonth, String purpose, double numPayments, double totalPayment) {
        this.studentID = studentID;
        this.totalAmount = totalAmount;
        this.numYrsToPay = numYrsToPay;
        this.interestRate = interestRate;
        this.paymentPerMonth = paymentPerMonth;
        this.purpose = purpose;        
        this.numPayments = numPayments;
        this.totalPayment = totalPayment;

        
        numPayments = numYrsToPay * 12;
        paymentPerMonth = totalAmount * (interestRate * Math.pow(1 + interestRate, numPayments)) / (Math.pow(1 + interestRate, numPayments) - 1);
        totalPayment = numPayments * paymentPerMonth;
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

    public double getNumPayments() {
        return numPayments;
    }

    public void setNumPayments(double numPayments) {
        this.numPayments = numPayments;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    
    @Override
    public String toString() {
        return "StudentLoan{" + "studentID=" + studentID 
                + ", totalAmount=" + totalAmount + ", numYrsToPay=" 
                + numYrsToPay + ", interestRate=" + interestRate 
                + ", purpose=" + purpose + '}';
    }
    
    
    
}
