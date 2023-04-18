package com.example.demo.web.controller;

import com.example.demo.web.service.ProductListService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class ViewController {

    private final ProductListService productListService;

    public ViewController(ProductListService productListService) {
        this.productListService = productListService;
    }

    /**
     * 로그인 페이지
     * @return mav
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
     * @return mav
     */
    @GetMapping("/register")
    public ModelAndView register(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("register");
        return mav;
    }

    /**
     * 메인페이지
     * @return mav
     */
    @GetMapping("/")
    public ModelAndView main() throws Exception {
        ModelAndView mav = new ModelAndView();

        Map<String, Object> newSelectValues = new HashMap<>();
        Map<String, Object> bestSelectValues = new HashMap<>();
        newSelectValues.put("newPage", "");
        bestSelectValues.put("mainPage", "");

        List<Map<String, Object>> newProductList = productListService.getProductList(newSelectValues);
        List<Map<String, Object>> bestProductList = productListService.getProductList(bestSelectValues);
        mav.addObject("newProductList",newProductList);
        mav.addObject("bestProductList",bestProductList);

        mav.setViewName("main");
        return mav;
    }

    /**
     * 브랜드 소개 페이지
     * @return mav
     */
    @GetMapping("/about")
    public ModelAndView about(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("about");
        return mav;
    }

    /**
     * 상품리스트
     * @return mav
     */
    @GetMapping("/productlist/{state}")
    public ModelAndView productlist(
            @PathVariable("state") String state
    ) throws Exception {
        ModelAndView mav = new ModelAndView();
        Map<String, Object> selectValues = new HashMap<>();

        if(state.equals("all")) {
            List<Map<String, Object>> productList = productListService.getProductList(selectValues);
            mav.addObject("productList",productList);
        }else if(state.equals("new")){
            selectValues.put("newPage", "");
            List<Map<String, Object>> productList = productListService.getProductList(selectValues);
            mav.addObject("productList",productList);
        }
        else{
            selectValues.put("brandId", state);
            List<Map<String, Object>> productList = productListService.getProductList(selectValues);
            mav.addObject("productList",productList);
        }

        mav.setViewName("productlist");
        return mav;
    }

    /**
     * 브랜드페이지
     * @return mav
     */
    @GetMapping("/brandpage/{brand}")
    public ModelAndView brandpage(
            @PathVariable("brand") String brand
    ){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("brandpage");
        return mav;
    }

}
