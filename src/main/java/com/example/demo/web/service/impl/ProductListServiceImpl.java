package com.example.demo.web.service.impl;
import com.example.demo.web.dao.ProductListDAO;
import com.example.demo.web.service.ProductListService;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
@Repository
public class ProductListServiceImpl implements ProductListService {
    final ProductListDAO productListDAO;

    @Override
    public List<Map<String, Object>> getProductList(Map<String, Object> selectValues) throws Exception {
        List<Map<String, Object>> result = productListDAO.getProductList(selectValues);

        try(Stream<Map<String, Object>> resultStream = result.stream()) {
            resultStream.filter(e -> e != null && e.containsKey("prdt_mainimg")).forEach(e -> {
                try(InputStream in = Files.newInputStream(Paths.get((e.get("prdt_mainimg")).toString()))) {
                    e.put("base64", Base64.getEncoder().encodeToString(IOUtils.toByteArray(in)));
                } catch(IOException e1) {
                    e1.printStackTrace();
                }
            });
        }
        return result;
    }

    @Override
    public List<Map<String, Object>> getProductDetail(String prdtId) throws Exception {
        List<Map<String, Object>> result = productListDAO.getProductDetail(prdtId);
        return result;
    }

    @Override
    public List<Map<String, Object>> getBrandDetail(String brandNm) throws Exception {
        List<Map<String, Object>> result = productListDAO.getBrandDetail(brandNm);
        return result;
    }
}
