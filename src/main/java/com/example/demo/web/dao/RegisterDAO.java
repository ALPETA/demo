package com.example.demo.web.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface RegisterDAO {
    String getOverlapId(String userId) throws Exception;

    int submitInnerUser(Map<String, Object> submitValues) throws Exception;
}
