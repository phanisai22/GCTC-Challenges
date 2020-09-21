package org.collection.miniprojects.employeeregister;

public class Employee {

    private String fName;
    private String lName;
    private Integer mNumber;
    private String eMail;
    private String address;

    public Employee() {
    }

    public Employee(String fName, String lName, Integer mNumber, String eMail, String address) {
        this.fName = fName;
        this.lName = lName;
        this.mNumber = mNumber;
        this.eMail = eMail;
        this.address = address;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Integer getmNumber() {
        return mNumber;
    }

    public void setmNumber(Integer mNumber) {
        this.mNumber = mNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
