package com.example.demo.web.controller;

import com.example.demo.web.service.RegisterService;
import com.example.demo.web.vo.WebUserVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/register")
@Slf4j
@RequiredArgsConstructor
public class RegisterController {

    private final RegisterService registerService;

    @PostMapping(value = "/getOverlapId")
    public Map<String, Object> getOverlapId(String usrId) {
        Map<String, Object> result = new HashMap<String, Object>();

        try {
            result.put("overlap", registerService.getOverlapId(usrId));
            result.put("result","success");
        } catch (Exception e) {
            result.put("result","fail");
            e.printStackTrace();
        }

        return result;
    }

    @PostMapping(value = "/submitUser")
    public Map<String, Object> submitInnerUser(@RequestBody Map<String, Object> submitValues) {
        System.out.println(submitValues);
        Map<String, Object> result = new HashMap<String, Object>();

        try {
            registerService.submitInnerUser(submitValues);
            result.put("result","success");
        } catch (Exception e) {
            result.put("result","fail");
            e.printStackTrace();
        }
        return result;
    }
}
