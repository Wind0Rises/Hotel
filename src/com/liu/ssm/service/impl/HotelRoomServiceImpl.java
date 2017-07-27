package com.liu.ssm.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.liu.ssm.mapper.HotelRoomMapper;
import com.liu.ssm.pojo.HotelRoom;
import com.liu.ssm.service.HotelRoomService;

@Component("hotelRoomService")
public class HotelRoomServiceImpl implements HotelRoomService{
	
	@Autowired
	private HotelRoomMapper hotelRoomMapper;

	@Override
	public void addRoom(HotelRoom room) throws Exception {
		hotelRoomMapper.addRoom(room);
	}
	
	@Override
	public void deleteRoom(int id) throws Exception {
		hotelRoomMapper.deleteRoom(id);
	}

	@Override
	public void updateRoom(HotelRoom room) throws Exception {
		hotelRoomMapper.updateRoom(room);
	}
	

	@Override
	public HotelRoom getRoomById(int id) throws Exception {
		return hotelRoomMapper.getRoomById(id);
	}

	@Override
	public HotelRoom getRoomByRoomNO(String roomNo) throws Exception {
		return getRoomByRoomNO(roomNo);
	}

	@Override
	public int totalNumber(String roomNo,String status) throws Exception {
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("roomNo", roomNo);
		map.put("status", status);
		return hotelRoomMapper.totalNumber(map);
	}

	@Override
	public List<HotelRoom> getRoomByRoomNOAndStauts(String roomNo, String status,
			int pageNo, int pageSize) throws Exception {
		Map<String, String> map = new HashMap<>();
		System.out.println("roomNO :" + roomNo + "status: " + status + "pageNO: " + pageNo +"pageSize:  " + pageSize);
		map.put("roomNo", roomNo);
		map.put("status", String.valueOf(status));
		map.put("startNo", String.valueOf(pageSize*(pageNo -1)));
		map.put("pageSize", String.valueOf(pageSize));
		
		return hotelRoomMapper.getRoomByRoomNOAndStauts(map);
	}



	

}
