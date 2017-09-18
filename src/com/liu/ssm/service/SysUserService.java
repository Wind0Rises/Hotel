package com.liu.ssm.service;

import com.liu.ssm.pojo.SysUser;

public interface SysUserService {
	
	void saveSysUser(SysUser sysUser) throws Exception;
	
	SysUser getSysUserById(String id) throws Exception;
	
	void deleteSysUserById(String id) throws Exception;
	
	void updateSysUserById(SysUser sysUser) throws Exception;
}
