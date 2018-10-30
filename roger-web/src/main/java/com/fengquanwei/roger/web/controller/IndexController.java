package com.fengquanwei.roger.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 首页控制器
 *
 * @author fengquanwei
 * @create 2018/10/30 11:14
 **/
@RestController
@RequestMapping("/")
public class IndexController {
    @Value("${roger.key.name}")
    private String name;
    @Value("${roger.key.phone}")
    private String phone;
    @Value("${roger.key.email}")
    private String email;

    @RequestMapping("")
    public Object index() {
        Map<String, String> info = new HashMap<>();
        info.put("name", name);
        info.put("phone", phone);
        info.put("email", email);

        return info;
    }
}
