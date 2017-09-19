package com.liu.ssm.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.session.SqlSession;
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
		departmentMapper.update(object);
	}

	@Override
	public Department getById(Object id) {
		return departmentMapper.getById(id);
	}

	@Override
	public int totalNumber(String departmentName) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("departmentName",departmentName);
		return departmentMapper.totalNumber(map);
	}

	@Override
	public List<Department> getPage(String departmentName, int pageNo,
			int pageSize) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("departmentName",departmentName);
		map.put("startNo",(pageNo - 1)*pageSize);
		map.put("pageSize",pageSize);
		return departmentMapper.getPage(map);
	}

	@Override
	public List<Department> getDepartmentByName(String departmentName) {
		return departmentMapper.getDepartmentByName(departmentName);
	}

	@Override
	public int insertList(List<Department> list) {
		return departmentMapper.insertList(list);
	}

	@Override
	public int deleteList(String[] array) {
		return departmentMapper.deleteList(array);
	}
}
