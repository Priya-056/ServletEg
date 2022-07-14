package com.sonata.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Employee")
public class Employee {

	private String empid;
	private String empname;
	private int empsal;
	public String getEmpid() {
		return empid;
	}
	public Employee(){
		
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	public Employee(String empid, String empname, int empsal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + "]";
	}
	
	
}
