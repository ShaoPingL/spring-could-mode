package com.shaop.servicefeign.hystric;

import com.shaop.servicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @Author: ShaoPing
 * @Data:2019\10\30 0030 17:29
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}