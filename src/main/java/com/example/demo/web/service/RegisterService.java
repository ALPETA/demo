package com.example.demo.web.service;

import com.example.demo.web.vo.WebUserVO;

import java.util.Map;

public interface RegisterService {
    /**
     * ID 중복확인
     * @param userId
     * @throws Exception
     */
    public Boolean getOverlapId (String userId) throws Exception;

    /**
     * innerUser 추가
     * @param submitValues
     * @throws Exception
     */
    public int submitInnerUser (Map<String, Object> submitValues) throws Exception;
}
