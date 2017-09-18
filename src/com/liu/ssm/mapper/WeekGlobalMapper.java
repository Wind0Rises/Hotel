package com.liu.ssm.mapper;

import com.liu.ssm.pojo.WeekGlobal;
import com.liu.ssm.pojo.WeekGlobalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeekGlobalMapper {
    int countByExample(WeekGlobalExample example);

    int deleteByExample(WeekGlobalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WeekGlobal record);

    int insertSelective(WeekGlobal record);

    List<WeekGlobal> selectByExample(WeekGlobalExample example);

    WeekGlobal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WeekGlobal record, @Param("example") WeekGlobalExample example);

    int updateByExample(@Param("record") WeekGlobal record, @Param("example") WeekGlobalExample example);

    int updateByPrimaryKeySelective(WeekGlobal record);

    int updateByPrimaryKey(WeekGlobal record);
    
    int addWeekGlobalDatas(List<WeekGlobal> lists);
}