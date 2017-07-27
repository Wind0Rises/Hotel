package com.liu.ssm.mapper;

import com.liu.ssm.pojo.Student;

public interface StudentDao {
	
	Student getStudentById(int id) throws Exception;
	
}
