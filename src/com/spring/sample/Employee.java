package com.spring.sample;

public class Employee {
	private int empID;
	private String name;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name) {
		super();
		this.name = name;
	}
	public Employee(int empID) {
		super();
		this.empID = empID;
	}
	public Employee(int empID, String name) {
		super();
		this.empID = empID;
		this.name = name;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}