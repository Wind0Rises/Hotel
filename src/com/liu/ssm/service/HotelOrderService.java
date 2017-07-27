package com.liu.ssm.service;

import java.util.List;
import java.util.Map;

import com.liu.ssm.pojo.HotelOrder;

public interface HotelOrderService {
	
	//增
	void addHotelOrder(HotelOrder hotelOrder);
	
	//删
	void deleteHotelOrder(String id);
	
	//改
	void updateHotelOrder(HotelOrder hotelOrder);
	
	//查
	HotelOrder getHotelOrderById(String id);
	
	//分页
	public List<HotelOrder> getOrderByPage(int correntPage,int pageSize,String orderName,String IDCard);
	
	//总计条数
	int countHotelOrder();
	
	int countByCondition(String orderName,String IDCard);
}
