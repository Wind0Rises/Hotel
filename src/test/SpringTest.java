package test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liu.ssm.mapper.StudentDao;
import com.liu.ssm.pojo.Student;
import com.liu.ssm.pojo.SysUser;
import com.liu.ssm.service.StudentService;
import com.liu.ssm.service.SysUserService;

public class SpringTest {
	
	@Test
	public void test() throws Exception{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-bean.xml");
		
		SysUserService service = (SysUserService) context.getBean("sysUserService");
		/*SysUser sysUser = new SysUser();
		sysUser.setId("liuweian");
		sysUser.setUsercode("liuweian");
		sysUser.setUsername("liuweian");
		sysUser.setPassword("liuweian");
		sysUser.setSalt("liuweian");
		sysUser.setLocked(1);
		service.saveSysUser(sysUser);*/
		
		/*SysUser sysUser = service.getSysUserById("liuweian");
		
		sysUser.setPassword("love");
		
		service.updateSysUserById(sysUser);*/
		
		service.deleteSysUserById("liuweadscccfian");
		
	}
}
