package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class ViewController {

    /**
     * 로그인 페이지
     * @param mav
     * @return
     */
    @GetMapping("/login")
    public ModelAndView login(@RequestParam(value = "error", required = false)String error,
                        @RequestParam(value = "exception", required = false)String exception, ModelAndView mav) {
        mav.addObject("error", error);
        mav.addObject("exception", exception);
        mav.setViewName("login");
        return mav;
    }

    /**
     * 회원가입 페이지
     * @return
     */
    @GetMapping("/register")
    public ModelAndView register(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("register");
        return mav;
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

    /**
     * 브랜드 소개 페이지
     * @return
     */
    @GetMapping("/about")
    public ModelAndView about(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("about");
        return mav;
    }

    /**
     * 상품리스트
     * @return
     */
    @GetMapping("/productlist")
    public ModelAndView productlist(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("productlist");
        return mav;
    }

}
