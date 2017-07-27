package com.liu.ssm.mapper;

import java.util.List;
import java.util.Map;

import com.liu.ssm.pojo.HotelRoom;

public interface HotelRoomMapper {
	
	//增加房间
	void addRoom(HotelRoom room) throws Exception;
	
	//删
	void deleteRoom(int id) throws Exception;
	
	//改
	void updateRoom(HotelRoom room) throws Exception;
	
	//查
	HotelRoom getRoomById(int id) throws Exception;
	
	//通过房间号获取房间信息
	HotelRoom getRoomByRoomNO(String roomNo) throws Exception;
	
	//获取一共有多少数据
	int totalNumber(Map<String, Object> map) throws Exception;
	
	//根据搜索条件来查询房间
	List<HotelRoom> getRoomByRoomNOAndStauts(Map<String, String> map) throws Exception;
}
