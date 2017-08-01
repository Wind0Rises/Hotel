package com.liu.other.util;

import java.util.Date;

public class GenerateKeyUtil {
	
	/**
	 * 
	 * @author LWA
	 * @description 根据时间生成唯一字符串
	 * @data 2017-8-1 下午9:27:36
	 * @return
	 */
	public static String GenerateByDate(){
		Date date = new Date();
		long millisNumber = date.getTime();
		return String.valueOf(millisNumber);
	}
}
