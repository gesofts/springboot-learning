package com.zz.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zz.springcloud.service.PlusService;

@RestController
public class Controller {

    @Autowired
    PlusService plusService;

    @RequestMapping(value = "/plusone", method = RequestMethod.GET)
    public String add() {
        return plusService.plus();
    }


}