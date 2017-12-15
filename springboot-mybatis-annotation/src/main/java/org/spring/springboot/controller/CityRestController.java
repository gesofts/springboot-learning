package org.spring.springboot.controller;

import java.net.MalformedURLException;

import java.util.HashMap;
import java.util.Map;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Zeng zhen on 21/11/2017.
 */
@RestController
@RequestMapping("/api")
public class CityRestController {

    @Autowired
    private CityService cityService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(HttpServletResponse response,
			HttpServletRequest request) throws MalformedURLException {
		return new ModelAndView("index");

	}

    @RequestMapping(value = "/city", method = RequestMethod.GET)  
    public @ResponseBody Map<String, String> findOneCity(@RequestParam(value = "cityName", required = true) String cityName, HttpServletResponse response,
			HttpServletRequest request) {
    	City city=cityService.findCityByName(cityName);
    	Map<String, String> map=new HashMap<String, String>();
    	map.put("name", city.getDescription());
        return map;
    }
}
