package com.training.environment.dao;

import com.training.environment.po.Zone;
import com.training.environment.po.ZoneExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ZoneMapper {
    long countByExample(ZoneExample example);

    int deleteByExample(ZoneExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Zone row);

    int insertSelective(Zone row);

    void insertMany(List<Zone> rows);

    List<Zone> selectByExample(ZoneExample example);

    Zone selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Zone row, @Param("example") ZoneExample example);

    int updateByExample(@Param("row") Zone row, @Param("example") ZoneExample example);

    int updateByPrimaryKeySelective(Zone row);

    int updateByPrimaryKey(Zone row);
}