package com.example.demo.web.vo;

import com.example.demo.common.vo.UserVO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class WebUserVO extends UserVO {
    private String usrId; // 아이디
    private String usrNm; // 이름
    private String passwd; // 비번
    private String phonNo; // 전화번호
    private String address; // 주소
    private String email; // 이메일
    private String level; // 등급
    private String role; // 롤(USER, ADMIN)

    @Override
    public String getUserId() {
        return this.usrId;
    }

    @Override
    public String getUserName() {
        return this.usrNm;
    }

    @Override
    public String getUserRole() {
        return this.role;
    }
}
