package com.kenny.tinyurl.controller;

import com.kenny.tinyurl.service.TinyUrlService;
import com.kenny.tinyurl.util.TinyUrlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by kenny.he on 6/26/16.
 */
@RestController
public class TinyUrlController {
    @Autowired
    private TinyUrlService tinyUrlService;

    @RequestMapping(value="/urls",method= RequestMethod.POST)
    public String save(@RequestParam(value="url", required = true) String url) {
        if (! TinyUrlUtil.isValidUrl(url)) {
            return "Invalid URL: " + url;
        }
        return tinyUrlService.getTinyUrl(url);
    }

    @RequestMapping(value="/{url}",method= RequestMethod.GET)
    public ModelAndView get(@PathVariable("url") String tinyUrl, HttpServletRequest request) {
        String fullUrl = tinyUrlService.getFullUrl(tinyUrl);
        if (fullUrl == null) {
            ModelMap model = new ModelMap();
            model.put("uri", request.getRequestURL());
            return new ModelAndView("404", model);
        } else {
            return new ModelAndView(new RedirectView(fullUrl, true));
        }
    }
}
