package com.liu.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.liu.ssm.mapper.WeekGlobalMapper;
import com.liu.ssm.pojo.WeekGlobal;
import com.liu.ssm.service.WeekGlobalService;

@Component("weekGlobalService")
public class WeekGlobalServiceImpl implements WeekGlobalService{

	@Autowired
	private WeekGlobalMapper weekGlobalMapper;
	
	@Override
	public int addWeekGlobalDatas(List<WeekGlobal> lists) {
		return weekGlobalMapper.addWeekGlobalDatas(lists);
	}

}
