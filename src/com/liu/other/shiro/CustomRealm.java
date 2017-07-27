package com.liu.other.shiro;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.liu.ssm.pojo.SysUser;
import com.liu.ssm.service.SysUserService;

public class CustomRealm extends AuthorizingRealm{
	
	@Autowired
	private SysUserService sysUserService;
	
	@Override
	public void setName(String name) {
		super.setName("customizeName");
	}

	/*
	 * (non-Javadoc)
	 * @author LWA
	 * @date 2017-7-19 下午8:50:50
	 * @description 
	 * @see org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
		String  usercode = (String) principal.getPrimaryPrincipal();
		
		//模拟从数据库获取数据
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("user:create");
		arrayList.add("items:add");
		arrayList.add("student:list");
		
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		info.addStringPermissions(arrayList);
		return info;
	}

	/*
	 * (non-Javadoc)
	 * @author LWA
	 * @date 2017-7-19 下午8:51:01
	 * @description 
	 * @see org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		
		//从前台传来的
		String code = (String) token.getPrincipal();
		SysUser sysUser = null;
		
		try {
			sysUser = sysUserService.getSysUserById(code);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (sysUser == null) {
			return null;
		}
		
		String password = sysUser.getPassword();
		String salt = sysUser.getSalt();
		
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(code, password,ByteSource.Util.bytes(salt),this.getName());
		return info;
	}

}
