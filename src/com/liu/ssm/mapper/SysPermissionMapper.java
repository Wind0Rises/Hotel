package com.liu.ssm.mapper;

import com.liu.ssm.pojo.SysPermission;

public interface SysPermissionMapper {
	
	void saveSysPermission(SysPermission sysPermission) throws Exception;
	
	SysPermission getSysPermissionById(int id) throws Exception;
	
	void deleteSysPermissionById(int id) throws Exception;
	
	void updateSysPermissionById(SysPermission sysPermission) throws Exception;
	
}
