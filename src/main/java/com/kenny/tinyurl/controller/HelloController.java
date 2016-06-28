package com.kenny.tinyurl.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public ModelAndView index(HttpServletRequest request) {
        ModelMap model = new ModelMap();
        model.put("ip", request.getRemoteHost());
        return new ModelAndView("index", model);
    }
    
}
