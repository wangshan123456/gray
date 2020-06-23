package com.example.serverb.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("server")
public interface TestFeign {

    @GetMapping("/test")
    String testFeign();
}
