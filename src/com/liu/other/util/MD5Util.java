package com.liu.other.util;

import org.apache.shiro.crypto.hash.Md5Hash;

public class MD5Util {
	
	public static String md5Password(String clearString,String salt){
		Md5Hash md5 = new Md5Hash(clearString,salt,2);
		return md5.toString();
	}
	
}
