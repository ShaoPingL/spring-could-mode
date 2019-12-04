package com.shaop.serivceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: ShaoPing
 * @Data:2019\10\30 0030 11:34
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    LoadBalancerClient loadBalancerClient;

    public String hiService(String name) {
        //loadBalancerClient.choose("SERVICE-HI");
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }


}
