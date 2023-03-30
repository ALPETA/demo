package com.example.demo.web.service.impl;
import com.example.demo.web.dao.ProductListDAO;
import com.example.demo.web.service.ProductListService;
import com.example.demo.web.service.UserPageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Repository
public class UserPageServiceImpl implements UserPageService {

    @Override
    public List<Map<String, Object>> getUserWishList(String userId) throws Exception {
        return null;
    }

    @Override
    public List<Map<String, Object>> getUserShopbagList(String userId) throws Exception {
        return null;
    }

    @Override
    public List<Map<String, Object>> getUserCuponeList(String userId) throws Exception {
        return null;
    }

    @Override
    public List<Map<String, Object>> getUserShoppingList(String userId) throws Exception {
        return null;
    }

    @Override
    public List<Map<String, Object>> getUserShoppingDetail(String shoppingCode) throws Exception {
        return null;
    }
}
