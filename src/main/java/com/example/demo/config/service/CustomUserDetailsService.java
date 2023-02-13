package com.example.demo.config.service;

import com.example.demo.common.vo.UserVO;
import com.example.demo.config.dao.LoginDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final LoginDAO loginDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserVO result = null;
        result = loginDAO.selectUserInfo(username);

        if (result != null) {
            return new CustomUserDetails(result);
        } else {
            throw new UsernameNotFoundException("결과없음");
        }
    }
}
