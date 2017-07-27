package com.liu.ssm.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.liu.other.util.DateUtil;
import com.liu.ssm.pojo.HotelOrder;
import com.liu.ssm.service.HotelOrderService;

@Controller
@RequestMapping("/order/")
public class HotelOrderController {
	
	Logger logger = Logger.getLogger(HotelOrderController.class);

	@Autowired
	private HotelOrderService hotelOrderService;

	@RequestMapping("list")
	public ModelAndView list(){
		return new ModelAndView("order/list");
	}
	
	/**
	 * 
	 * @author LWA
	 * @description 不同和条件查询使用的同一个方法
	 * @data 2017-7-19 下午11:39:34
	 * @param request
	 * @return 分页数据
	 */
	@RequestMapping("intiData")
	@ResponseBody
	public JSONObject intiData(HttpServletRequest request){
		
		String orderName = request.getParameter("orderName");
		String IDCard = request.getParameter("IDCard");
		String correntPage = request.getParameter("correntPage");
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("pageSize", 10);
		jsonObject.put("count", hotelOrderService.countByCondition(orderName,IDCard));
		jsonObject.put("orders", hotelOrderService.getOrderByPage(
				correntPage != null ? Integer.parseInt(correntPage) : 1, 10,orderName,IDCard));
		return jsonObject;
	}
	
	/**
	 * 
	 * @author LWA
	 * @description 通过id获取HotelOrder对象，并传到编辑页面
	 * @data 2017-7-19 下午11:57:21
	 * @param id
	 * @return 编辑页面
	 */
	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam("id") String id){
		ModelAndView mv = new ModelAndView("order/edit");
		if (id != null) {
			HotelOrder hotelOrder = hotelOrderService.getHotelOrderById(id);
			mv.addObject("order",hotelOrder);
		}
		return mv;
	}
	
	/**
	 * 
	 * @author LWA
	 * @description 删除数据
	 * @data 2017-7-20 下午7:52:47
	 * @param id
	 * @return
	 */
	@RequestMapping("delete")
	@ResponseBody
	public Map<String,Object> delete(@RequestParam("id")String id){
		Map<String,Object> map = new HashMap<String,Object>();
		hotelOrderService.deleteHotelOrder(id);
		map.put("message","success");
		return map;
	}
	
	/**
	 * 
	 * @author LWA
	 * @description 到添加页面
	 * @data 2017-7-26 下午11:09:41
	 * @return
	 */
	@RequestMapping("add")
	public ModelAndView add(){
		return new ModelAndView("/order/edit");
	}
	/**
	 * 
	 * @author LWA
	 * @description 保存数据可以更新可以添加
	 * @data 2017-7-26 下午10:18:26
	 * @param request
	 * @return
	 */
	@RequestMapping("save")
	@ResponseBody
	public Map<String,Object> save(HttpServletRequest request){
		Map<String,Object> map = new HashMap<String,Object>();
		HotelOrder order =  new HotelOrder();
		//缺少date工具类
		String orderName = request.getParameter("orderName");
		String IDCard = request.getParameter("IDCard");
		String phone = request.getParameter("phone");
		String enterDate = request.getParameter("enterDate");
		int status = Integer.parseInt(request.getParameter("status"));
		String outDate = request.getParameter("outDate");
		String other = request.getParameter("other");
		
		if (request.getParameter("id") == null) {
			//this is add order
			order.setDate(DateUtil.DateToString(new Date(),DateUtil.dateAll));
			order.setOrderName(orderName);
			order.setIDCard(IDCard);
			order.setPhone(phone);
			order.setEnterDate(enterDate);
			order.setStatus(status);
			order.setDate(outDate);
			order.setOther(other);
			order.setId(String.valueOf(new Date().getTime()));
			hotelOrderService.addHotelOrder(order);
			map.put("message","修改成功！");
		} else {
			//this is update order
			String date = request.getParameter("date");
			order =  hotelOrderService.getHotelOrderById(request.getParameter("id"));
			order.setDate(date);
			order.setOrderName(orderName);
			order.setIDCard(IDCard);
			order.setPhone(phone);
			order.setEnterDate(enterDate);
			order.setStatus(status);
			order.setOutDate(outDate);
			order.setOther(other);
			hotelOrderService.updateHotelOrder(order);
			map.put("message","修改成功！");
		}
		return map;
	}
	
	/**
	 * 
	 * @author LWA
	 * @description 查看页面
	 * @data 2017-7-26 下午11:16:47
	 * @param id
	 * @return
	 */
	@RequestMapping("show")
	public ModelAndView show(@RequestParam("id") String id){
		ModelAndView mv = new ModelAndView("order/show");
		if (id != null) {
			HotelOrder hotelOrder = hotelOrderService.getHotelOrderById(id);
			mv.addObject("order",hotelOrder);
		}
		return mv;
	}
}
