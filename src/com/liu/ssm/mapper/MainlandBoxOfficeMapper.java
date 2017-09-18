package com.liu.ssm.mapper;

import com.liu.ssm.pojo.MainlandBoxOffice;
import com.liu.ssm.pojo.MainlandBoxOfficeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MainlandBoxOfficeMapper {
    int countByExample(MainlandBoxOfficeExample example);

    int deleteByExample(MainlandBoxOfficeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MainlandBoxOffice record);

    int insertSelective(MainlandBoxOffice record);

    List<MainlandBoxOffice> selectByExample(MainlandBoxOfficeExample example);

    MainlandBoxOffice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MainlandBoxOffice record, @Param("example") MainlandBoxOfficeExample example);

    int updateByExample(@Param("record") MainlandBoxOffice record, @Param("example") MainlandBoxOfficeExample example);

    int updateByPrimaryKeySelective(MainlandBoxOffice record);

    int updateByPrimaryKey(MainlandBoxOffice record);
}