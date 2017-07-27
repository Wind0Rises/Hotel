package com.liu.ssm.mapper;

import java.util.List;
import java.util.Map;

import com.liu.ssm.pojo.HotelRoom;

public interface HotelRoomMapper {
	
	void addRoom(HotelRoom room) throws Exception;
	
	HotelRoom getRoomById(int id) throws Exception;
	
	HotelRoom getRoomByRoomNO(String roomNo) throws Exception;
	
	//查看某一页的数据
	List<HotelRoom> getRoomPage(Map<String, Integer> map) throws Exception;
	
	//获取一共有多少数据
	int totalNumber() throws Exception;
	
	//根据搜索条件来查询房间
	List<HotelRoom> getRoomByRoomNOAndStauts(Map<String, String> map) throws Exception;
}
