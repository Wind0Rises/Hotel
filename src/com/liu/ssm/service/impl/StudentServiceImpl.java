package com.liu.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.liu.ssm.mapper.StudentDao;
import com.liu.ssm.pojo.Student;
import com.liu.ssm.service.StudentService;

@Component("studentService")
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	
	/*@Resource(name="studentMapper")
	private StudentDao studentMapper;*/

	@Override
	public Student getStudentById(int id) throws Exception{
		return studentDao.getStudentById(id);
	}
}
