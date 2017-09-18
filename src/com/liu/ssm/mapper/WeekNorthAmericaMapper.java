package com.liu.ssm.mapper;

import com.liu.ssm.pojo.WeekNorthAmerica;
import com.liu.ssm.pojo.WeekNorthAmericaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeekNorthAmericaMapper {
    int countByExample(WeekNorthAmericaExample example);

    int deleteByExample(WeekNorthAmericaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WeekNorthAmerica record);

    int insertSelective(WeekNorthAmerica record);

    List<WeekNorthAmerica> selectByExample(WeekNorthAmericaExample example);

    WeekNorthAmerica selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WeekNorthAmerica record, @Param("example") WeekNorthAmericaExample example);

    int updateByExample(@Param("record") WeekNorthAmerica record, @Param("example") WeekNorthAmericaExample example);

    int updateByPrimaryKeySelective(WeekNorthAmerica record);

    int updateByPrimaryKey(WeekNorthAmerica record);
}