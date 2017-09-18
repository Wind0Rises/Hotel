package com.liu.ssm.mapper;


import java.util.List;
import java.util.Map;

import com.liu.other.sysinterface.MapperInterface;
import com.liu.ssm.pojo.Employee;

public interface EmployeeMapper extends MapperInterface<Employee>{
	
	List<Map<String, Integer>> distributed(); 
	
}