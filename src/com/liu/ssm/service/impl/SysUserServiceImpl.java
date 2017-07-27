package com.liu.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.liu.other.exception.CustomException;
import com.liu.ssm.mapper.SysUserMapper;
import com.liu.ssm.pojo.SysUser;
import com.liu.ssm.service.SysUserService;

@Component("sysUserService")
public class SysUserServiceImpl implements SysUserService{
	
	@Autowired
	private SysUserMapper sysUserMapper;

	@Override
	public void saveSysUser(SysUser sysUser) throws Exception {
		SysUser user = sysUserMapper.getSysUserById(sysUser.getId());
		if (user != null) throw new CustomException("用户已经存在!"); 
		sysUserMapper.saveSysUser(sysUser);
	}

	@Override
	public SysUser getSysUserById(String id) throws Exception {
		return sysUserMapper.getSysUserById(id);
	}

	@Override
	public void deleteSysUserById(String id) throws Exception {
		sysUserMapper.deleteSysUserById(id);
	}

	@Override
	public void updateSysUserById(SysUser sysUser) throws Exception {
		sysUserMapper.updateSysUserById(sysUser);
	}
}
