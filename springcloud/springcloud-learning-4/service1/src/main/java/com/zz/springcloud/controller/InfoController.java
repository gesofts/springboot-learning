package com.zz.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class InfoController {

    @Value("${province}")
    private String province;

    @RequestMapping("/from")
    public String from() {
        return "Hi,I come from "+province;
    }



}