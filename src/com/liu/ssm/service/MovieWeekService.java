package com.liu.ssm.service;

import java.util.List;

import com.liu.ssm.pojo.MovieWeek;

public interface MovieWeekService {
	
	int addWeekMovieDatas(List<MovieWeek> list);
	
	int insert(MovieWeek record);
	
}
