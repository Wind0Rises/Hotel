package com.liu.ssm.service;

import com.liu.ssm.pojo.SysPermission;

public interface SysPermissionService {
	
void saveSysPermission(SysPermission sysPermission) throws Exception;
	
	SysPermission getSysPermissionById(int id) throws Exception;
	
	void deleteSysPermissionById(int id) throws Exception;
	
	void updateSysPermissionById(SysPermission sysPermission) throws Exception;
	
}
