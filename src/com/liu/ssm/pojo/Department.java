package com.liu.ssm.pojo;

public class Department {
	
	private String departmentNo;
	
	private String departmentName;
	
	//部门主管编号
	private String SupervisorNo;
	
	private int departmentNumber;
	
	private String description;
	
	//上级部门
	private String higherOfficeNo;

	public String getDepartmentNo() {
		return departmentNo;
	}

	public void setDepartmentNo(String departmentNo) {
		this.departmentNo = departmentNo;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getSupervisorNo() {
		return SupervisorNo;
	}

	public void setSupervisorNo(String supervisorNo) {
		SupervisorNo = supervisorNo;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHigherOfficeNo() {
		return higherOfficeNo;
	}

	public void setHigherOfficeNo(String higherOfficeNo) {
		this.higherOfficeNo = higherOfficeNo;
	}
	
}
