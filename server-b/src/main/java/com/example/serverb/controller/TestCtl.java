package com.example.serverb.controller;

import com.example.serverb.feign.TestFeign;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shanwang
 * @version 1.0.0
 * @descrition TODO
 * @date 2020/6/20 23:47
 */

@Api(tags = "swagger 测试")
@RestController
public class TestCtl {

    @Autowired
    TestFeign testFeign;

    @Value("${info.serverName}")
    private String serverName;

    @GetMapping("feignTest")
    @ApiOperation("feign调用测试")
    public String inquiryAccount() {

        StringBuilder sb = new StringBuilder();
        sb.append(serverName)
                .append("-->")
                .append(testFeign.testFeign());
        return sb.toString();
    }
}
