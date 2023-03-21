package com.example.demo.web.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserPageDAO {
    List<Map<String, Object>> getUserWishList(String userId) throws Exception;
    List<Map<String, Object>> getUserShopbagList(String userId) throws Exception;
    List<Map<String, Object>> getUserCuponeList(String userId) throws Exception;
    List<Map<String, Object>> getUserShoppingList(String userId) throws Exception;
    List<Map<String, Object>> getUserShoppingDetail(String shoppingCode) throws Exception;
}
