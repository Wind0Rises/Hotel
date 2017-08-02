package com.liu.ssm.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.liu.ssm.mapper.EmployeeMapper;
import com.liu.ssm.pojo.Employee;
import com.liu.ssm.service.EmployeeService;

@Component("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	public void add(Employee object) {
		employeeMapper.add(object);
	}

	public void delete(Object id) {
		employeeMapper.delete(id);
	}

	public void update(Employee object) {
		employeeMapper.update(object);
	}

	public Employee getById(Object id) {
		return employeeMapper.getById(id);
	}

	public List<Employee> getPage(String employeeName, String date,
			int pageNo, int pageSize) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("employeeName", employeeName);
		map.put("date", date);
		map.put("pageSize", pageSize);
		map.put("startNo", (pageNo - 1)* pageSize);
		return employeeMapper.getPage(map);
	}

	@Override
	public int totalNumber(String employeeName, String date) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("employeeName", employeeName);
		map.put("date", date);
		return employeeMapper.totalNumber(map);
	}


}
