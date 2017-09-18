package test;

import org.junit.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class RabbitMQTest {

	@Test
	public void test() throws Exception{
		AbstractApplicationContext context = new 
				ClassPathXmlApplicationContext("spring/spring-bean.xml");
		RabbitTemplate template = context.getBean(RabbitTemplate.class);
		template.convertAndSend("Hello, world!");
		Thread.sleep(1000);
		context.destroy();
	} 
}
