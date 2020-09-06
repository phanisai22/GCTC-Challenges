package com.ioOperations.serialization;

import java.io.Serializable;
import java.util.Date;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private Date dateofBirth;
    private String designation;
    private double salary;

    public Employee() {

    }

    public Employee(String name, Date dateofBirth, String designation, double salary, String department) {
        super();
        this.name = name;
        this.dateofBirth = dateofBirth;
        this.designation = designation;
        this.salary = salary;
        this.department = department;
    }

    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dateofBirth=" + dateofBirth + ", designation=" + designation + ", salary="
				+ salary + ", department=" + department + "]";
	}
    
}
