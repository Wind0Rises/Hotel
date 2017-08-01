package com.liu.ssm.service;

import java.util.List;

import com.liu.other.sysinterface.service.SysService;
import com.liu.ssm.pojo.Department;

public interface DepartmentService extends SysService<Department>{

	int totalNumber(String departmentName);
	
	List<Department> getPage(String departmentName,int pageNo,int pageSize);
	
	List<Department> getDepartmentByName(String departmentName);
}
