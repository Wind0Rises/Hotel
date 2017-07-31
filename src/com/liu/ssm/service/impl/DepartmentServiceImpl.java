package com.liu.ssm.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.liu.ssm.mapper.DepartmentMapper;
import com.liu.ssm.pojo.Department;
import com.liu.ssm.service.DepartmentService;

@Component("departmentService")
public class DepartmentServiceImpl implements DepartmentService{
	
	Logger logger = Logger.getLogger(DepartmentServiceImpl.class);
	
	@Autowired
	private DepartmentMapper departmentMapper;

	@Override
	public void add(Department object) {
		departmentMapper.add(object);
	}

	@Override
	public void delete(Object id) {
		departmentMapper.delete(id);
	}

	@Override
	public void update(Department object) {
		departmentMapper.delete(object);
	}

	@Override
	public Department getById(Object id) {
		return departmentMapper.getById(id);
	}
}
