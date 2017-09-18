package com.liu.other.rabbit;

import org.apache.log4j.Logger;

public class Recv2 {

	private Logger logger = Logger.getLogger(Recv2.class);  
	
	public void onMessage(String message) {
		try {
			logger.info("消费者er************" + message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
