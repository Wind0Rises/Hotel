package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liu.ssm.controller.DepartmentController;
import com.liu.ssm.pojo.Department;
import com.liu.ssm.service.DepartmentService;
import com.liu.ssm.service.EmployeeService;

public class DepartmentTest {
	
	@Test
	public void test() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-bean.xml");
		DepartmentService departmentService = (DepartmentService) context.getBean("departmentService");
		
		List<Department> lists = new ArrayList<>();
		for(int i = 10; i < 20; i++){
			Department department = new Department();
			department.setDepartmentNo("BM_002" + i);
			department.setDepartmentName("部门名称" + i);
			department.setSupervisorNo("zasdf" + i);
			department.setDepartmentNumber(i);
			department.setDescription("描述" + i);
			department.setHigherOfficeNo("shangji" + i);
			lists.add(department);
		}
		
		System.out.println(departmentService.insertList(lists));
		System.out.println("成功");
		
		
		
		/*System.out.println(departmentService.getPage(null,1,10));
		
		System.out.println(departmentService.totalNumber(null));*/
	}
	
	@Test
	public void test0() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-bean.xml");
		//DepartmentService departmentService = (DepartmentService) context.getBean("departmentService");
		
		DepartmentController controller = (DepartmentController) context.getBean("departmentService");
		System.out.println(controller);
		
		
		/*//批量删除
		String[] array = new String[]{"BM_0021","BM_0022","BM_0023"};
		System.out.println(departmentService.deleteList(array));
		System.out.println("成功");*/
		
		/*int i = 100;
		Department department = new Department();
		department.setDepartmentNo("BM_002" + i);
		department.setDepartmentName("部门名称" + i);
		department.setSupervisorNo("zasdf" + i);
		department.setDepartmentNumber(i);
		department.setDescription("描述" + i);
		department.setHigherOfficeNo("shangji" + i);*/
		
		//System.out.println(departmentService.addBackPrimaryKey(department));
		
	}
	
	@Test
	public void test1() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-bean.xml");
		EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
		
		System.out.println(employeeService.getById("asdfa").getEmployeeName());
		
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void test2() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-bean.xml");
		EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map = (Map<String, Integer>) employeeService.distributed();
		
		System.out.println(map);
		
		
	}
}
