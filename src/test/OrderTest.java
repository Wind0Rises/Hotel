package test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liu.ssm.pojo.HotelOrder;
import com.liu.ssm.service.HotelOrderService;

public class OrderTest {

	@Test
	public void test(){
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-bean.xml");
		
		HotelOrderService hotelOrderService = (HotelOrderService) context.getBean("hotelOrderService");
		
		for (int i = 0; i < 100; i++) {
			HotelOrder hotelOrder = new HotelOrder();
			hotelOrder.setId("0211w" + i);
			hotelOrder.setIDCard("342423169940554");
			hotelOrder.setOther("qita");
			hotelOrder.setPhone("1825517693");
			hotelOrder.setRoomId(1);
			hotelOrder.setStatus(1);
			hotelOrder.setOrderName("liubd" + i);
			
			hotelOrderService.addHotelOrder(hotelOrder);
		}
		
	//  System.out.println(hotelOrderService.getHotelOrderById("asd001").getOrderName());
		
		//List<HotelOrder> list = hotelOrderService.getOrderByPage(2, 3);
		
		//System.out.println(list);
		
		
	} 
}
