package com.tnsif.day6.isarelationship;

public class Manager extends Employee{
	
	private String deptName;
	private int deptId;
	
	
	public Manager() {
		super();
	}

	public Manager(int empId, String empName, String deptName, int deptId) {
		super(empId, empName);
		this.deptName = deptName;
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "Manager [deptName=" + deptName + ", deptId=" + deptId + ", EmpId=" + getEmpId() + ", EmpName="
				+ getEmpName() + "]";
	}
	
	

}
