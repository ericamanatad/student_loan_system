/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentloansystem;

/**
 * Represents a student with basic information.
 * 
 * @author Panewels
 */

public class Student {
    private String idNumber;    
    private String lastName;
    private String firstName;
    private String middleName;
    private String suffix;
    private String birthdate;
    private String gender;
    private String phoneNumber;
    private String emailAddress;
    private String nationality;
    private String civilStatus;
    private String address;
    private String zipCode;
    private String department;    
    private String programEnrolled;
    private String yearLevel;
    private String guardianFullName;
    private String guardianRelationship;
    private String guardianContactNumber;

 
    public Student(){
    
    }


    
    public Student(String idNumber, String lastName, String firstName, String middleName, String suffix, String birthdate, String gender, String phoneNumber, String emailAddress, String nationality, String civilStatus, String address, String zipCode, String department, String programEnrolled, String yearLevel, String guardianFullName, String guardianRelationship, String guardianContactNumber) {
        this.idNumber = idNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.suffix = suffix;
        this.birthdate = birthdate;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.nationality = nationality;
        this.civilStatus = civilStatus;
        this.address = address;
        this.zipCode = zipCode;
        this.department = department;
        this.programEnrolled = programEnrolled;
        this.yearLevel = yearLevel;
        this.guardianFullName = guardianFullName;
        this.guardianRelationship = guardianRelationship;
        this.guardianContactNumber = guardianContactNumber;
    }

    public Student( String idNumber, String department, String programEnrolled, String yearLevel){
        this.department = idNumber;
        this.department = department;
        this.programEnrolled = programEnrolled;
        this.yearLevel = yearLevel;
    }

    public Student(String idNumber, String lastName, String firstName, String middleName, String suffix, String birthdate, String gender, String phoneNumber, String emailAddress, String nationality, String civilStatus, String address, String zipCode, String guardianFullName, String guardianRelationship, String guardianContactNumber) {
        this.idNumber = idNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.suffix = suffix;
        this.birthdate = birthdate;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.nationality = nationality;
        this.civilStatus = civilStatus;
        this.address = address;
        this.zipCode = zipCode;
        this.guardianFullName = guardianFullName;
        this.guardianRelationship = guardianRelationship;
        this.guardianContactNumber = guardianContactNumber;
    }
    
    
    
      /**
     * Getter for the student's idNumber
     * 
     * @return the student'sidNumber
     */
    public String getIdNumber() {
        return idNumber;
}

    /**
     * Setter for the student's first name.
     * 
     * @param idNumber the new first name
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * Getter for the student's first name.
     * 
     * @return the student's first name
     */
    public String getFirstName() {
        return firstName;
}

    /**
     * Setter for the student's first name.
     * 
     * @param firstName the new first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for the student's last name.
     * 
     * @return the student's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for the student's last name.
     * 
     * @param lastName the new last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for the student's middle name.
     * 
     * @return the student's middle name
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Setter for the student's middle name.
     * 
     * @param middleName the new middle name
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Getter for the student's suffix.
     * 
     * @return the student's suffix (e.g., Jr., III)
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Setter for the student's suffix.
     * 
     * @param suffix the new suffix
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * Getter for the student's birthdate.
     * 
     * @return the student's birthdate (format: yyyy-MM-dd)
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * Setter for the student's birthdate.
     * 
     * @param birthdate the new birthdate (format: yyyy-MM-dd)
     */
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * Getter for the student's gender.
     * 
     * @return the student's gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Setter for the student's gender.
     * 
     * @param gender the new gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Getter for the student's phone number.
     * 
     * @return the student's phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter for the student's phone number.
     * 
     * @param phoneNumber the new phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getter for the student's email address.
     * 
     * @return the student's email address
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Setter for the student's email address.
     * 
     * @param emailAddress the new email address
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Getter for the student's nationality.
     * 
     * @return the student's nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Setter for the student's nationality.
     * 
     * @param nationality the new nationality
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
     public String getCivilStatus() {
        return civilStatus;
    }
       public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }
     public String getAddress() {
        return address;
    }
      public void setAddress(String address) {
        this.address = address;
    }
 /**
     * Getter for the student's zip code.
     * 
     * @return the student's zip code
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Setter for the student's zip code.
     * 
     * @param zipCode the new zip code
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getProgramEnrolled() {
        return programEnrolled;
    }

    public void setProgramEnrolled(String programEnrolled) {
        this.programEnrolled = programEnrolled;
    }

    public String getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(String yearLevel) {
        this.yearLevel = yearLevel;
    }

    public String getGuardianFullName() {
        return guardianFullName;
    }

    public void setGuardianFullName(String guardianFullName) {
        this.guardianFullName = guardianFullName;
    }

    public String getGuardianRelationship() {
        return guardianRelationship;
    }

    public void setGuardianRelationship(String guardianRelationship) {
        this.guardianRelationship = guardianRelationship;
    }

    public String getGuardianContactNumber() {
        return guardianContactNumber;
    }

    public void setGuardianContactNumber(String guardianContactNumber) {
        this.guardianContactNumber = guardianContactNumber;
    }
    
    
   /*
      @Override
    public String toString() {
        return "Student{" +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", suffix='" + suffix + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", nationality='" + nationality + '\'' +
                ", civilStatus='" + civilStatus + '\'' +
                ", address='" + address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", department='" + department + '\'' +
                ", programEnrolled='" + programEnrolled + '\'' +
                ", yearLevel='" + yearLevel + '\'' +
                ", guardianFullName='" + guardianFullName + '\'' +
                ", guardianRelationship='" + guardianRelationship + '\'' +
                ", guardianContactNumber='" + guardianContactNumber + '\'' +
                '}';
    }
    */
}