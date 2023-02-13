package com.example.demo.config.dao;

import com.example.demo.web.vo.WebUserVO;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface LoginDAO {
    /**
     * 로그인
     * @param userId 로그인 계정
     * @return 계정정보VO
     */
    WebUserVO selectUserInfo(String userId);
}
