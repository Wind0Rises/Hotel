package com.liu.ssm.mapper;

import java.util.List;
import java.util.Map;

import com.liu.other.sysinterface.MapperInterface;
import com.liu.ssm.pojo.Department;

public interface DepartmentMapper extends MapperInterface<Department>{
	
	List<Department> getDepartmentByName(String departmentName);
	
	int insertList(List<Department> list);
	
	int deleteList(String[] array);
}