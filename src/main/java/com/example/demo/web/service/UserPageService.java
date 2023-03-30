package com.example.demo.web.service;

import java.util.List;
import java.util.Map;

public interface UserPageService {
    /**
     * 관심상품 리스트
     * @param userId
     * @throws Exception
     */
    List<Map<String, Object>> getUserWishList(String userId) throws Exception;

    /**
     * 장바구니
     * @param userId
     * @throws Exception
     */
    List<Map<String, Object>> getUserShopbagList(String userId) throws Exception;

    /**
     * 사용자 쿠폰 리스트
     * @param userId
     * @throws Exception
     */
    List<Map<String, Object>> getUserCuponeList(String userId) throws Exception;

    /**
     * 주문내역
     * @param userId
     * @throws Exception
     */
    List<Map<String, Object>> getUserShoppingList(String userId) throws Exception;

    /**
     * 주문 상세 내역
     * @param shoppingCode
     * @throws Exception
     */
    List<Map<String, Object>> getUserShoppingDetail(String shoppingCode) throws Exception;
}
