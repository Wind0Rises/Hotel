package com.liu.ssm.mapper;

import com.liu.ssm.pojo.MovieWeek;
import com.liu.ssm.pojo.MovieWeekExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MovieWeekMapper {
    int countByExample(MovieWeekExample example);

    int deleteByExample(MovieWeekExample example);

    int deleteByPrimaryKey(String movieid);

    int insert(MovieWeek record);

    int insertSelective(MovieWeek record);

    List<MovieWeek> selectByExample(MovieWeekExample example);

    MovieWeek selectByPrimaryKey(String movieid);

    int updateByExampleSelective(@Param("record") MovieWeek record, @Param("example") MovieWeekExample example);

    int updateByExample(@Param("record") MovieWeek record, @Param("example") MovieWeekExample example);

    int updateByPrimaryKeySelective(MovieWeek record);

    int updateByPrimaryKey(MovieWeek record);

	int addWeekMovieDatas(List<MovieWeek> list);
}