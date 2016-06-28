package com.kenny.tinyurl.model;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by kenny.he on 6/26/16.
 */

@Component
public class TinyUrlModel {
    private Map<String, TinyUrl> urlMap = new HashMap<>();
    private Map<String, TinyUrl> fullUrlMap = new HashMap<>();
    private long next = 9837912415197L;

    public String getTinyUrl(String fullUrl) {
        TinyUrl info = fullUrlMap.get(fullUrl);
        if (info == null) {
            info = new TinyUrl(next++, fullUrl);
            String tinyUrl = info.getTinyUrl();
            urlMap.put(tinyUrl, info);
            fullUrlMap.put(fullUrl, info);
            return tinyUrl;
        }
        return info.getTinyUrl();
    }

    public String getFullUrl(String tinyUrl) {
        TinyUrl info = urlMap.get(tinyUrl);
        if (info == null) return null;
        info.touch();
        return info.getUrl();
    }
}
