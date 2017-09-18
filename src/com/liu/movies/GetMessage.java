package com.liu.movies;

import java.util.Date;

import com.liu.other.util.SendRequest;

public class GetMessage {
	
	//http://www.cbooo.cn/BoxOffice/GetHourBoxOffice?d=1504839873899
	//实时票房
	private final static String GET_HOUR = "http://www.cbooo.cn/BoxOffice/GetHourBoxOffice?d=";
	
	//http://www.cbooo.cn/BoxOffice/GetDayBoxOffice?num=-1&d=1504838791843
	//每日票房
	private final static String GET_DAY = "http://www.cbooo.cn/BoxOffice/GetDayBoxOffice?";
	
	//http://www.cbooo.cn/BoxOffice/getWeekInfoData?sdate=2017-08-28
	//每周
	private final static String GET_WEEK = "http://www.cbooo.cn/BoxOffice/getWeekInfoData?sdate="; 
	
	//http://www.cbooo.cn/BoxOffice/getMonthBox?sdate=2017-09-01
	//每月
	private final static String GET_MONTH = "http://www.cbooo.cn/BoxOffice/getMonthBox?sdate=2017-09-01";
	
	private final static String GET_WEEK_GLOBAL = "http://www.cbooo.cn/BoxOffice/getAllInfo?weekId=";
	
	public String getHour() throws Exception{
		String requestUrl = GET_HOUR + new Date().getTime();
		return SendRequest.sendRequest(requestUrl);
	}
	
	public String getWeek(String sdate) throws Exception{
		String requestUrl = GET_WEEK + sdate;
		return SendRequest.sendRequest(requestUrl);
	}
	
	public String getWeekGlobal(int weekId) throws Exception{
		String requestUrl = GET_WEEK_GLOBAL + weekId;
		return SendRequest.sendRequest(requestUrl);
	}

}
