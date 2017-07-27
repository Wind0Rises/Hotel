package com.liu.other.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public static String dateAll = "yyyy-MM-dd hh:mm:ss";
	
	public static String DateToString(Date date,String format){
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}
}
