package test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liu.ssm.service.DepartmentService;

public class DepartmentTest {
	
	@Test
	public void test() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-bean.xml");
		DepartmentService departmentService = (DepartmentService) context.getBean("departmentService");
		
		System.out.println(departmentService.getById("BM_001"));
		
	}
}
