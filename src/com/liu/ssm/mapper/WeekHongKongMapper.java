package com.liu.ssm.mapper;

import com.liu.ssm.pojo.WeekHongKong;
import com.liu.ssm.pojo.WeekHongKongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeekHongKongMapper {
    int countByExample(WeekHongKongExample example);

    int deleteByExample(WeekHongKongExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WeekHongKong record);

    int insertSelective(WeekHongKong record);

    List<WeekHongKong> selectByExample(WeekHongKongExample example);

    WeekHongKong selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WeekHongKong record, @Param("example") WeekHongKongExample example);

    int updateByExample(@Param("record") WeekHongKong record, @Param("example") WeekHongKongExample example);

    int updateByPrimaryKeySelective(WeekHongKong record);

    int updateByPrimaryKey(WeekHongKong record);
}