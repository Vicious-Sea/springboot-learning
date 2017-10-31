package com.sam.springboot.mybatis.test;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by sam on 2017/10/31.
 */
@Mapper
public interface AppMessageMapper {
    int deleteByPrimaryKey(String id);

    int insert(AppMessage record);


    AppMessage selectByPrimaryKey(String id);


    int updateByPrimaryKey(AppMessage record);

    List<AppMessage> selectAll();


}
