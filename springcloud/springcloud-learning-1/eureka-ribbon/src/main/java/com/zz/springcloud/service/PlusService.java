package com.zz.springcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class PlusService {

	@Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "Fallback")
    public String plus() {
        return restTemplate.getForEntity("http://EUREKA-SERVICE/plus?number=0", String.class).getBody();
    }

    public String Fallback() {
        return "fall back";
    }
}
