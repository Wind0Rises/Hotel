package com.liu.ssm.service;

import java.util.List;

import com.liu.ssm.pojo.HotelRoom;

public interface HotelRoomService {
	
	void addRoom(HotelRoom room) throws Exception;
	
	void deleteRoom(int id) throws Exception;
	
	void updateRoom(HotelRoom room) throws Exception;
	
	HotelRoom getRoomById(int id) throws Exception;
	
	HotelRoom getRoomByRoomNO(String roomNo) throws Exception;
	
	int totalNumber(String roomNO,String status) throws Exception;
	
	List<HotelRoom> getRoomByRoomNOAndStauts(String roomNo,String status,int pageNo,int pageSize) throws Exception;
}
