package com.zz.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class ConfigController {

    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;
	@RequestMapping("/info")
    public String getInfo() {

        return "name:"+name+"---------"+"age:"+age;
    }



}