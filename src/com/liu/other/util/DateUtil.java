package com.liu.other.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public final static String DATE_ALL = "yyyy-MM-dd hh:mm:ss";
	
	public final static String DATE_DATE = "yyyy-MM-dd";
	
	public static String DateToString(Date date,String format){
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}
	
	public static long dateDateToLong(String dateString,String format) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(dateString);
		return date.getTime();
	}
	
	public static String TimeToDate(Long DateTime,String format){
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = new Date(DateTime);
		return sdf.format(date);
	}
}
