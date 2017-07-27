package com.liu.ssm.service;

import java.util.List;

import com.liu.ssm.pojo.HotelRoom;

public interface HotelRoomService {
	
	void addRoom(HotelRoom room) throws Exception;
	
	HotelRoom getRoomById(int id) throws Exception;
	
	HotelRoom getRoomByRoomNO(String roomNo) throws Exception;
	
	List<HotelRoom> getRoomPage(int pageNO,int pageSize) throws Exception;
	
	int totalNumber() throws Exception;
	
	List<HotelRoom> getRoomByRoomNOAndStauts(String roomNo,int status,int pageNo,int pageSize) throws Exception;
}
