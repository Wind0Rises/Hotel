package com.liu.ssm.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.liu.ssm.mapper.HotelOrderMapper;
import com.liu.ssm.pojo.HotelOrder;
import com.liu.ssm.service.HotelOrderService;

@Component("hotelOrderService")
public class HotelOrderServiceImpl implements HotelOrderService{
	
	@Autowired
	private HotelOrderMapper hotelOrderMapper;

	@Override
	public void addHotelOrder(HotelOrder hotelOrder) {
		hotelOrderMapper.addHotelOrder(hotelOrder);
	}

	@Override
	public HotelOrder getHotelOrderById(String id) {
		return hotelOrderMapper.getHotelOrderById(id);
	}

	@Override
	public void deleteHotelOrder(String id) {
		hotelOrderMapper.deleteHotelOrder(id);
	}

	@Override
	public void updateHotelOrder(HotelOrder hotelOrder) {
		hotelOrderMapper.updateHotelOrder(hotelOrder);
	}

	public List<HotelOrder> getOrderByPage(int correntPage,int pageSize,String orderName,String IDCard){
		int startNo = (correntPage - 1)*pageSize;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("startNo", startNo);
		map.put("pageSize",pageSize);
		map.put("orderName", orderName);
		map.put("IDCard", IDCard);
		return hotelOrderMapper.getOrderByPage(map);
	}

	@Override
	public int countHotelOrder() {
		return hotelOrderMapper.countHotelOrder();
	}

	@Override
	public int countByCondition(String orderName, String IDCard) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("orderName",orderName);
		map.put("IDCard",IDCard);
		return hotelOrderMapper.countByCondition(map);
	}
}
