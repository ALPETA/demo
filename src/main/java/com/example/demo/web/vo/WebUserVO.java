package com.example.demo.web.vo;

import com.example.demo.common.vo.UserVO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class WebUserVO extends UserVO {

    private String USER_ID; // 아이디
    private String USER_NM; // 이름
    private String PASSWD; // 비번
    private String PHONE_NO; // 전화번호
    private String ADDRESS; // 주소
    private String EMAIL; // 이메일
    private String USER_LEVEL; // 등급
    private String USER_ROLE; // 롤(USER, ADMIN)
    private String REG_DT; // 가입일

    @Override
    public String getUserId() {
        return this.USER_ID;
    }

    @Override
    public String getUserName() {
        return this.USER_NM;
    }

    @Override
    public String getUserRole() {
        return this.USER_ROLE;
    }

    @Override
    public String getPasswd() {
        return this.PASSWD;
    }
}
