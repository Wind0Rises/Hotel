package com.liu.ssm.mapper;

import com.liu.ssm.pojo.SysRole;

public interface SysRoleMapper {
	
	void saveSysRole(SysRole sysRole) throws Exception;
	
	SysRole getSysRoleById(String id) throws Exception;
	
	void deleteSysRoleById(String id) throws Exception;
	
	void updateSysRoleById(SysRole sysRole) throws Exception;
}
