package com.example.demo.web.service;

import java.util.List;
import java.util.Map;

public interface ProductListService {
    /**
     * 상품리스트
     * @param selectValues
     * @throws Exception
     */
    List<Map<String, Object>> getProductList(Map<String, Object> selectValues) throws Exception;

    /**
     * 상품 상세
     * @param prdtId
     * @throws Exception
     */
    List<Map<String, Object>> getProductDetail(String prdtId) throws Exception;
}
