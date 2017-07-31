package com.liu.other.sysinterface.service;

public interface SysService<T extends Object>{
	//增
	void add(T object);
		
	//删
	void delete(Object id);
		
	//改
	void update(T object); 
		
	//查
	T getById(Object id);
}
