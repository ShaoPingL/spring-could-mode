package com.shaop.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ShaoPing
 * @Data:2019\11\1 0001 11:18
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${user.name}")
    private String test;

    @RequestMapping("/test")
    public String getPort(){
        return test;
    }
}
