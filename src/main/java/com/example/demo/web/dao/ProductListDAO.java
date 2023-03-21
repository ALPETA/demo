package com.example.demo.web.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProductListDAO {
    List<Map<String, Object>> getProductList(Map<String, Object> selectValues) throws Exception;
    List<Map<String, Object>> getProductDetail(String prdtId) throws Exception;
    List<Map<String, Object>> getBrandDetail(String brandNm) throws Exception;
}
