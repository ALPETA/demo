package com.example.demo.web.service.impl;
import com.example.demo.web.dao.RegisterDAO;
import com.example.demo.web.service.RegisterService;
import com.example.demo.web.vo.WebUserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterServiceImpl implements RegisterService {

    private final RegisterDAO registerDAO;

    private final BCryptPasswordEncoder passwordEncoder;

    @Override
    public Boolean getOverlapId(String userId) throws Exception {
        Boolean overLap = false;
        String result = registerDAO.getOverlapId(userId);

        if(result != null){
            overLap = true;
        }
        return overLap;
    }

    @Override
    public int submitInnerUser(WebUserVO userVO) throws Exception {
        String password = passwordEncoder.encode(userVO.getPasswd());
        userVO.setPasswd(password);

        return registerDAO.submitInnerUser(userVO);
    }
}
