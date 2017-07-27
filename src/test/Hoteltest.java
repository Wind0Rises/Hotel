package test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liu.ssm.pojo.HotelRoom;
import com.liu.ssm.service.HotelRoomService;
import com.liu.ssm.service.SysUserService;

public class Hoteltest {
	@Test
	public void test() throws Exception{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-bean.xml");
		
		HotelRoomService service = (HotelRoomService) context.getBean("hotelRoomService");
		
		HotelRoom room = service.getRoomById(1);
		
		System.out.println(room.getRoomNo());
		
	}
}
