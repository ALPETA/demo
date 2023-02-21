package com.example.demo.web.service.impl;
import com.example.demo.web.dao.RegisterDAO;
import com.example.demo.web.service.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
@Repository
public class RegisterServiceImpl implements RegisterService {

    private final RegisterDAO registerDAO;

    private final PasswordEncoder passwordEncoder;

    @Override
    public Boolean getOverlapId(String userId) throws Exception {
        boolean overLap = false;
        String result = registerDAO.getOverlapId(userId);

        if(result != null){
            overLap = true;
        }
        return overLap;
    }

    @Override
    public int submitInnerUser(Map<String, Object> submitValues) throws Exception {
        String password = passwordEncoder.encode(submitValues.get("passwd").toString());
        submitValues.put("passwd", password);

        System.out.println(submitValues);

        return registerDAO.submitInnerUser(submitValues);
    }
}
