package com.liu.ssm.mapper;

import com.liu.ssm.pojo.SysUser;

public interface SysUserMapper {
	
	void saveSysUser(SysUser sysUser) throws Exception;
	
	SysUser getSysUserById(String id) throws Exception;
	
	void deleteSysUserById(String id) throws Exception;
	
	void updateSysUserById(SysUser sysUser) throws Exception;
	
}
