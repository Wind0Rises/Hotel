package com.liu.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.liu.ssm.pojo.HotelRoom;
import com.liu.ssm.service.HotelRoomService;
import com.sun.istack.internal.logging.Logger;
import com.sun.org.apache.xpath.internal.operations.Mod;

@Controller
@RequestMapping("/room/")
public class HotelRoomController {

	Logger logger = Logger.getLogger(HotelRoomController.class);
	
	@Autowired
	private HotelRoomService hotelRoomService;
	
	/**
	 * 
	 * @author LWA
	 * @Descrition 到列表页面
	 * @date 2017-7-27 上午10:02:24
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("list")
	public ModelAndView list(HttpServletRequest request) throws Exception{
		return new ModelAndView("room/list");
	}
	
	/**
	 * 
	 * @author LWA
	 * @Descrition 页面初始化数据
	 * @date 2017-7-27 上午10:48:33
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("intiData")
	@ResponseBody
	public JSONObject intiData(HttpServletRequest request) throws Exception{
		
		String roomNo = request.getParameter("roomNo");
		String status = request.getParameter("status");
		String correntPage = request.getParameter("correntPage");
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("pageSize", 10);
		jsonObject.put("count", hotelRoomService.totalNumber(roomNo, status));
		jsonObject.put("rooms", hotelRoomService.getRoomByRoomNOAndStauts(roomNo,status,correntPage != null ? Integer.parseInt(correntPage) : 1, 10));
		return jsonObject;
	}
	
	/**
	 * @author LWA
	 * @Descrition 编辑页面
	 * @date 2017-7-27 上午11:39:56
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam("id")int id) throws Exception{
		ModelAndView mv = new ModelAndView("room/edit");
		if (hotelRoomService.getRoomById(id) != null) {
			mv.addObject("room", hotelRoomService.getRoomById(id));
		}
		return mv;
	}
	
	/**
	 * 
	 * @author LWA
	 * @Descrition 保存操作
	 * @date 2017-7-27 上午11:56:55
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("save")
	@ResponseBody
	public Map<String, Object> save(HttpServletRequest request) throws Exception{
		Map<String, Object> map = new HashMap<>();
		String id = request.getParameter("id");
		String roomNo = request.getParameter("roomNo");
		String level = request.getParameter("level");
		double original_price = Double.parseDouble(request.getParameter("original_price"));
		double now_price = Double.parseDouble(request.getParameter("now_price"));
		int status = Integer.parseInt(request.getParameter("status"));
		String description = request.getParameter("description");
		HotelRoom room = null;
		
		if (hotelRoomService.totalNumber(roomNo, null) > 0) {
			map.put("message", "改房间号已经存在，不能重复命名，确定跳转到列表页面，取消留在当前页面。");
			return map;
		}
		if (id == null || id == "") {
			//this is add
			room = new HotelRoom();
			room.setRoomNo(roomNo);
			room.setLevel(level);
			room.setOriginal_price(original_price);
			room.setNow_price(now_price);
			room.setStatus(status);
			room.setDescription(description);
			hotelRoomService.addRoom(room);
			map.put("message", "恭喜您！添加成功，确定跳转到列表页面，取消留在当前页面。");
		}else {
			//this is update
			room = hotelRoomService.getRoomById(Integer.parseInt(request.getParameter("id")));
			room.setRoomNo(roomNo);
			room.setLevel(level);
			room.setOriginal_price(original_price);
			room.setNow_price(now_price);
			room.setStatus(status);
			room.setDescription(description);
			hotelRoomService.updateRoom(room);
			map.put("message", "恭喜您！修改成功，确定跳转到列表页面，取消留在当前页面。");
		}
		return map;
	}
	
	/**
	 * 
	 * @author LWA
	 * @Descrition 添加
	 * @date 2017-7-27 上午11:58:51
	 * @return
	 */
	@RequestMapping("add")
	public ModelAndView add(){
		return new ModelAndView("room/edit");
	}
	
	/**
	 * 
	 * @author LWA
	 * @Descrition 查看页面
	 * @date 2017-7-27 下午12:01:59
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("show")
	public ModelAndView show(@RequestParam("id") int id) throws Exception{
		ModelAndView mv = new ModelAndView("room/show");
		mv.addObject("room", hotelRoomService.getRoomById(id));
		return mv;
	}
	
	@RequestMapping("delete")
	@ResponseBody
	public Map<String, Object> delete(@RequestParam("id") int id) throws Exception{
		Map<String, Object> map = new HashMap<>();
		hotelRoomService.deleteRoom(id);
		map.put("message", "删除成功");
		return map;
	}
	
}
