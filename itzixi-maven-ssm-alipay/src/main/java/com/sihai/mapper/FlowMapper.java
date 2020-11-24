package com.sihai.mapper;

import com.sihai.pojo.Flow;
import com.sihai.pojo.FlowExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FlowMapper {
    int countByExample(FlowExample example);

    int deleteByExample(FlowExample example);

    int deleteByPrimaryKey(String id);

    int insert(Flow record);

    int insertSelective(Flow record);

    List<Flow> selectByExample(FlowExample example);

    Flow selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Flow record, @Param("example") FlowExample example);

    int updateByExample(@Param("record") Flow record, @Param("example") FlowExample example);

    int updateByPrimaryKeySelective(Flow record);

    int updateByPrimaryKey(Flow record);
}