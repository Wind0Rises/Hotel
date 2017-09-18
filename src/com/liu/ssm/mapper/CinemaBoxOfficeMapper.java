package com.liu.ssm.mapper;

import com.liu.ssm.pojo.CinemaBoxOffice;
import com.liu.ssm.pojo.CinemaBoxOfficeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CinemaBoxOfficeMapper {
    int countByExample(CinemaBoxOfficeExample example);

    int deleteByExample(CinemaBoxOfficeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CinemaBoxOffice record);

    int insertSelective(CinemaBoxOffice record);

    List<CinemaBoxOffice> selectByExample(CinemaBoxOfficeExample example);

    CinemaBoxOffice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CinemaBoxOffice record, @Param("example") CinemaBoxOfficeExample example);

    int updateByExample(@Param("record") CinemaBoxOffice record, @Param("example") CinemaBoxOfficeExample example);

    int updateByPrimaryKeySelective(CinemaBoxOffice record);

    int updateByPrimaryKey(CinemaBoxOffice record);
}