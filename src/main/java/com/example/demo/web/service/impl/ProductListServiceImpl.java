package com.example.demo.web.service.impl;
import com.example.demo.web.dao.ProductListDAO;
import com.example.demo.web.service.ProductListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Repository
public class ProductListServiceImpl implements ProductListService {
    final ProductListDAO productListDAO;

    @Override
    public List<Map<String, Object>> getProductList(Map<String, Object> selectValues) throws Exception {
        List<Map<String, Object>> result = productListDAO.getProductList(selectValues);
        return result;
    }

    @Override
    public List<Map<String, Object>> getProductDetail(String prdtId) throws Exception {
        List<Map<String, Object>> result = productListDAO.getProductDetail(prdtId);
        return result;
    }
}
