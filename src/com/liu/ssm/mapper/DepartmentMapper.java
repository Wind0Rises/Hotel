package com.liu.ssm.mapper;

import java.util.List;
import java.util.Map;

import com.liu.other.sysinterface.MapperInterface;
import com.liu.ssm.pojo.Department;

public interface DepartmentMapper extends MapperInterface<Department>{
	
	int totalNumber(Map<String,Object> map);
	
	List<Department> getPage(Map<String,Object> map);
	
	List<Department> getDepartmentByName(String departmentName);
	
	
	 
}