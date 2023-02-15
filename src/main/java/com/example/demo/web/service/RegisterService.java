package com.example.demo.web.service;

import com.example.demo.web.vo.WebUserVO;

public interface RegisterService {
    /**
     * ID 중복확인
     * @param userId
     * @return Boolean
     * @throws Exception
     */
    public Boolean getOverlapId (String userId) throws Exception;

    /**
     * innerUser 추가
     * @param userVO
     * @return int
     * @throws Exception
     */
    public int submitInnerUser (WebUserVO userVO) throws Exception;
}
