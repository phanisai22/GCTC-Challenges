package com.oops.employee;

public class Employee extends Person{

	double annualSalary;
	String year;
	String NIN;
	
	
	public Employee(String name, double annualSalary, String year, String nIN) {
		super(name);
		this.annualSalary = annualSalary;
		this.year = year;
		NIN = nIN;
	}


	public double getAnnualSalary() {
		return annualSalary;
	}


	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public String getNIN() {
		return NIN;
	}


	public void setNIN(String nIN) {
		NIN = nIN;
	}


	@Override
	public String toString() {
		return "Employee [annualSalary=" + annualSalary + ", year=" + year + ", NIN=" + NIN + ", name=" + name + "]";
	}
	
	
}
