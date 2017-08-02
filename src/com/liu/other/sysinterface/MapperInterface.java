package com.liu.other.sysinterface;

import java.util.List;
import java.util.Map;

public interface MapperInterface<T extends Object> {
	//增
	void add(T object);
	
	//删
	void delete(Object id);
	
	//改
	void update(T object); 
	
	//查
	T getById(Object id);
	
	//总数
	int totalNumber(Map<String,Object> map);
	
	//分页
	List<T> getPage(Map<String, Object> map);
}
