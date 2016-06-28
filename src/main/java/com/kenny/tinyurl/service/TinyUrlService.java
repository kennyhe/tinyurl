package com.kenny.tinyurl.service;

import com.kenny.tinyurl.model.TinyUrlModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kenny.he on 6/26/16.
 */

@Service
public class TinyUrlService {

    @Autowired
    private TinyUrlModel model;

    public String getTinyUrl(String fullUrl) {
        return model.getTinyUrl(fullUrl);
    }

    public String getFullUrl(String tinyUrl) {
        return model.getFullUrl(tinyUrl);
    }
}
