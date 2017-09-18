package com.liu.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.liu.ssm.mapper.MovieWeekMapper;
import com.liu.ssm.pojo.MovieWeek;
import com.liu.ssm.service.MovieWeekService;

@Component("movieWeekService")
public class MovieWeekServiceImpl implements MovieWeekService {
	
	@Autowired
	private MovieWeekMapper movieWeekMapper;

	@Override
	public int addWeekMovieDatas(List<MovieWeek> list) {
	 	return movieWeekMapper.addWeekMovieDatas(list);
	}

	@Override
	public int insert(MovieWeek record) {
		return movieWeekMapper.insert(record);
	}

}
