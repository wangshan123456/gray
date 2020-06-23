package com.example.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shanwang
 * @version 1.0.0
 * @descrition TODO
 * @date 2020/6/20 13:15
 */

@RestController
public class TestCtl {

    @Value("${info.serverName}")
    private String serverName;

    @GetMapping("test")
    public String inquiryAccount() {
        return serverName;
    }

}
