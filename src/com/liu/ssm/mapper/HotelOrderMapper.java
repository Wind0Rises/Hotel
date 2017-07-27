package com.liu.ssm.mapper;

import java.util.List;
import java.util.Map;

import com.liu.ssm.pojo.HotelOrder;

public interface HotelOrderMapper {
	
	//增
	void addHotelOrder(HotelOrder hotelOrder);
	
	//删
	void deleteHotelOrder(String id);
	
	//改
	void updateHotelOrder(HotelOrder hotelOrder);
	
	//查
	HotelOrder getHotelOrderById(String id);
	
	//分页查询
	public List<HotelOrder> getOrderByPage(Map<String, Object> map);
	
	//总计条数
	int countHotelOrder();
	
	/**
	 * @author LWA
	 * @description 条件orderName，IDCard查询个数
	 * @data 2017-7-19 下午11:17:53
	 * @param orderName
	 * @param IDCard
	 * @return 查询个数
	 */
	int countByCondition(Map<String,Object> map);
}
