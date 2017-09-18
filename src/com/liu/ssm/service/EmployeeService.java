package com.liu.ssm.service;

import java.util.List;
import java.util.Map;

import com.liu.other.sysinterface.service.SysService;
import com.liu.ssm.pojo.Employee;

public interface EmployeeService extends SysService<Employee>{

	int totalNumber(String employeeName,String date);
	
	List<Employee> getPage(String employeeName,String date,int pageNo,int pageSize);
	
	List<Map<String, Integer>> distributed(); 
}
