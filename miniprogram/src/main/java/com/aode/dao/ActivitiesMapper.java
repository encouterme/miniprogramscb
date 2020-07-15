package com.aode.dao;

import com.aode.bean.Activities;
import com.aode.bean.ActivitiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivitiesMapper {
    long countByExample(ActivitiesExample example);

    int deleteByExample(ActivitiesExample example);

    int deleteByPrimaryKey(Integer activityId);

    int insert(Activities record);

    int insertSelective(Activities record);

    List<Activities> selectByExample(ActivitiesExample example);

    Activities selectByPrimaryKey(Integer activityId);

    int updateByExampleSelective(@Param("record") Activities record, @Param("example") ActivitiesExample example);

    int updateByExample(@Param("record") Activities record, @Param("example") ActivitiesExample example);

    int updateByPrimaryKeySelective(Activities record);

    int updateByPrimaryKey(Activities record);
}