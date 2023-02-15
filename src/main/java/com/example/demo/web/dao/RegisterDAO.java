package com.example.demo.web.dao;

import com.example.demo.common.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegisterDAO {
    public String getOverlapId(String userId) throws Exception;

    public int submitInnerUser(UserVO userVO) throws Exception;
}
