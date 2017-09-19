package com.liu.other.log;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 
 * @title UniteLog
 * @description: 自定义日志处理
 * @author LWA
 * @date 2017-7-20 下午9:27:01
 */
public class UniteLog {
	
	/**
	 * point.getTarget().getClass(): 可以获得执行类的class
	 * point.getSignature().getName()：可以获得执行的是哪个方法
	 * 
	 */
	public void before(JoinPoint point){
		Logger logger = Logger.getLogger(point.getTarget().getClass());
		
		logger.debug("自定义log:>>>>>>>>>"+ point.getTarget().getClass()
				+ ">>>>>>>>>" + point.getSignature().getName() + ">>>>>>>>>执行开始");
	}
	
	/**
	 * 
	 * @author LWA
	 * @Descrition 环绕方法特定的参数
	 * @date 2017-9-18 下午3:18:45
	 * @param pjp
	 * @throws Throwable
	 */
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println(pjp);
		System.out.println("around start");
		pjp.proceed();
		System.out.println("around end");
	} 
}
