package com.aode.dao;

import com.aode.bean.Annc;
import com.aode.bean.AnncExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnncMapper {
    long countByExample(AnncExample example);

    int deleteByExample(AnncExample example);

    int deleteByPrimaryKey(Integer anncId);

    int insert(Annc record);

    int insertSelective(Annc record);

    List<Annc> selectByExample(AnncExample example);

    Annc selectByPrimaryKey(Integer anncId);

    int updateByExampleSelective(@Param("record") Annc record, @Param("example") AnncExample example);

    int updateByExample(@Param("record") Annc record, @Param("example") AnncExample example);

    int updateByPrimaryKeySelective(Annc record);

    int updateByPrimaryKey(Annc record);
}