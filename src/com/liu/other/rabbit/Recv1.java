package com.liu.other.rabbit;

import org.apache.log4j.Logger;

public class Recv1 {

	private Logger logger = Logger.getLogger(Recv1.class);  
	
	public void onMessage(String message) {
		try {
			logger.info("消费者************" + message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
