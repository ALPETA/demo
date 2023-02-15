package com.example.demo.web.controller;

import com.example.demo.web.service.RegisterService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/submit")
@Slf4j
@RequiredArgsConstructor
public class RegisterController {

    private final RegisterService registerService;

    @PostMapping(value = "/getOverlapId")
    public Map<String, Object> getOverlapId(String usrId) {
        Map<String, Object> result = new HashMap();

        try {
            result.put("overlap", registerService.getOverlapId(usrId));
        } catch (Exception e) {

        }

        return result;
    }
}
