package com.wrapper.employeedetails;

public class Employee implements Cloneable{
    private String name;
    private String id;
    private String email;

	public Employee(String name, String id, String email) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
	}

	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", email=" + email + "]";
	}

}
