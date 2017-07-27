package com.liu.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.liu.other.exception.CustomException;
import com.liu.ssm.mapper.SysPermissionMapper;
import com.liu.ssm.pojo.SysPermission;
import com.liu.ssm.service.SysPermissionService;

@Component("sysPermissionService")
public class SysPermissionServiceImpl implements SysPermissionService{
	
	@Autowired
	private SysPermissionMapper sysPermissionMapper;

	@Override
	public void saveSysPermission(SysPermission sysPermission) throws Exception {
		if (sysPermissionMapper.getSysPermissionById(sysPermission.getId()) != null) {
			throw new CustomException("权限已经存在!");
		}
		sysPermissionMapper.saveSysPermission(sysPermission);
	}

	@Override
	public SysPermission getSysPermissionById(int id) throws Exception {
		return sysPermissionMapper.getSysPermissionById(id);
	}

	@Override
	public void deleteSysPermissionById(int id) throws Exception {
		sysPermissionMapper.deleteSysPermissionById(id);
	}

	@Override
	public void updateSysPermissionById(SysPermission sysPermission) throws Exception {
		sysPermissionMapper.updateSysPermissionById(sysPermission);
	}

}
