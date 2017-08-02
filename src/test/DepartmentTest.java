package test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liu.ssm.pojo.Department;
import com.liu.ssm.service.DepartmentService;
import com.liu.ssm.service.EmployeeService;

public class DepartmentTest {
	
	@Test
	public void test() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-bean.xml");
		DepartmentService departmentService = (DepartmentService) context.getBean("departmentService");
		
		/*for(int i = 1; i < 30; i++){
			Department department = new Department();
			department.setDepartmentNo("BM_002" + i);
			department.setDepartmentName("部门名称" + i);
			department.setSupervisorNo("zasdf" + i);
			department.setDepartmentNumber(i);
			department.setDescription("描述" + i);
			department.setHigherOfficeNo("shangji" + i);
			departmentService.add(department);
		}
		
		System.out.println(departmentService.getPage(null,1,10));
		
		System.out.println(departmentService.totalNumber(null));
		*/
		
	}
	
	@Test
	public void test1() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-bean.xml");
		EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
		
		System.out.println(employeeService.getById("asdfa").getEmployeeName());
		
		
	}
}
