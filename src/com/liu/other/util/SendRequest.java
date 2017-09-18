package com.liu.other.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class SendRequest {
	
	public static String sendRequest(String requestUrl) throws Exception{
		String result = "";
		URL realUrl = new URL(requestUrl);
		//打开与URL的连接
		URLConnection connection = realUrl.openConnection();
		System.out.println("connection" + connection);
				
		//通用参数配置
		connection.setRequestProperty("accept", "*/*");
		connection.setRequestProperty("connection", "Keep-Alive");
		connection.setRequestProperty("user-agent","Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
		// 建立实际的连接
		connection.connect();
		// 定义 BufferedReader输入流来读取URL的响应
		BufferedReader bufferedReader =new 
		BufferedReader(new InputStreamReader(connection.getInputStream()));
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			result += line;
		}
		
		return result;
	}
}
