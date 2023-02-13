package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class ViewController {

    /**
     * 로그인 페이지
     * @param principal
     * @return
     */
    @GetMapping("/login")
    public String login(Principal principal) {

        if (principal != null) {
            return "redirect:/";
        } else {
            return "login";
        }
    }

    /**
     * 메인페이지
     * @return
     */
    @GetMapping("/")
    public ModelAndView main(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("main");
        return mav;
    }

}
