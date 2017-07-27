package com.liu.other.exception;


/**
 * 
 * @title CustomException
 * @description:自定义异常
 * @author LWA
 * @date 2017-7-19 下午8:45:53
 */
public class CustomException extends Exception{
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public CustomException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
