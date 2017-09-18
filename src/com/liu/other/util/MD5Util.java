package com.liu.other.util;

import org.apache.shiro.crypto.hash.Md5Hash;

public class MD5Util {
	
	/**
	 * 
	 * @author LWA
	 * @Descrition 返回MD5加密过后的明文密码
	 * @date 2017-8-8 上午8:46:36
	 * @param clearString
	 * @param salt
	 * @return
	 */
	public static String md5Password(String clearString,String salt){
		Md5Hash md5 = new Md5Hash(clearString,salt,2);
		return md5.toString();
	}
	
}
