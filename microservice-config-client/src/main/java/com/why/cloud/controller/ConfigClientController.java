package com.why.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author WHY
 * @Date 2020-12-30
 * @Version 1.0
 */
@RestController
public class ConfigClientController {
    @Value("${profile}")
    private String profile;

    @GetMapping(value = "/getprofile")
    public String getProfile(){
        return this.profile;
    }
}
