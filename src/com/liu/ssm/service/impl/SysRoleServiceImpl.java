package com.liu.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.liu.other.exception.CustomException;
import com.liu.ssm.mapper.SysRoleMapper;
import com.liu.ssm.pojo.SysRole;
import com.liu.ssm.service.SysRoleService;

@Component("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService{

	@Autowired
	private SysRoleMapper sysUserMapper;
	
	@Override
	public void saveSysRole(SysRole sysRole) throws Exception {
		if (sysUserMapper.getSysRoleById(sysRole.getId()) != null) {
			throw new CustomException("角色已经存在!");
		}
		sysUserMapper.saveSysRole(sysRole);
	}

	@Override
	public SysRole getSysRoleById(String id) throws Exception {
		return sysUserMapper.getSysRoleById(id);
	}

	@Override
	public void deleteSysRoleById(String id) throws Exception {
		sysUserMapper.deleteSysRoleById(id);
	}

	@Override
	public void updateSysRoleById(SysRole sysRole) throws Exception {
		sysUserMapper.updateSysRoleById(sysRole);
	}

}
