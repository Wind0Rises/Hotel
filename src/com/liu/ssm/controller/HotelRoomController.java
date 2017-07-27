package com.liu.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.liu.ssm.pojo.HotelRoom;
import com.liu.ssm.service.HotelRoomService;

@Controller
@RequestMapping("/room/")
public class HotelRoomController {

	@Autowired
	private HotelRoomService hotelRoomService;
	
	@RequestMapping("list")
	public ModelAndView list(HttpServletRequest request) throws Exception{
		int pageNo = 1;
		int pageSize = 10;
		if (request.getParameter("pageNo")!=null) pageNo = Integer.parseInt(request.getParameter("pageNo"));
		if (request.getParameter("pageSize")!=null) pageSize = Integer.parseInt(request.getParameter("pageSize"));
		
		int totalPage = hotelRoomService.totalNumber()/pageSize + 1;
		ModelAndView mv = new ModelAndView("room/list");
		mv.addObject("rooms", hotelRoomService.getRoomPage(pageNo, pageSize));
		mv.addObject("pageSize", 10);
		mv.addObject("totalPage", totalPage);
		return mv;
	}
	
	/**
	 * 返回指定也得Room数据
	 * @param request
	 * @return
	 * @throws Exception
	 */
	
	@RequestMapping("pageData")
	@ResponseBody
	public Object pageData(HttpServletRequest request) throws Exception{
		int pageNo = 1;
		int pageSize = 10;
		if (request.getParameter("pageNo")!=null) pageNo = Integer.parseInt(request.getParameter("pageNo"));
		if (request.getParameter("pageSize")!=null) pageSize = Integer.parseInt(request.getParameter("pageSize"));
		
		List<HotelRoom> list = hotelRoomService.getRoomPage(pageNo, pageSize);
		
		JSONObject object = new JSONObject();
		
		object.put("rooms", list);
		object.put("pageSize", 10);
		
		Map<String, List<HotelRoom>> map = new HashMap<String, List<HotelRoom>>();
		
		map.put("rooms", list);
		
		return object;
	}
	
	
	@RequestMapping("search")
	@ResponseBody
	public Object search(HttpServletRequest request) throws Exception{
		int pageNo = 1;
		int pageSize = 10;
		
		String roomNo = request.getParameter("roomNo");
		String status = request.getParameter("status");
		
		if (request.getParameter("pageNo")!=null) pageNo = Integer.parseInt(request.getParameter("pageNo"));
		if (request.getParameter("pageSize")!=null) pageSize = Integer.parseInt(request.getParameter("pageSize"));
		
		List<HotelRoom> list = hotelRoomService.getRoomByRoomNOAndStauts(roomNo, Integer.parseInt(status), pageNo, pageSize);
		
		JSONObject object = new JSONObject();
		object.put("rooms", list);
		
		return object;
	}
}
