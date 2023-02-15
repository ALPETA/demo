package com.example.demo.web.vo;

import com.example.demo.common.vo.UserVO;
import lombok.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class WebUserVO extends UserVO {
    @Getter
    @Setter
    private String userId; // 아이디
    private String usrNm; // 이름
    private String passwd; // 비번
    private String phonNo; // 전화번호
    private String address; // 주소
    private String email; // 이메일
    private String level; // 등급
    private String userRole; // 롤(USER, ADMIN)
    private String regDt; // 가입일

    @Override
    public String getUserId() {
        return this.userId;
    }

    @Override
    public String getUserName() {
        return this.usrNm;
    }

}
