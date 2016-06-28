package com.kenny.tinyurl.model;

import java.util.Date;
import com.kenny.tinyurl.util.TinyUrlUtil;

/**
 * Created by kenny.he on 6/26/16.
 */
public class TinyUrl {
    private String url;
    private long index;
    private Date createTime;
    private int numOfAccess;
    private Date lastAccessTime;

    TinyUrl(long i, String u) {
        this.index = i;
        this.url = u;
        this.createTime = new Date();
    }

    public String getUrl() {
        return url;
    }

    public long getIndex() {
        return index;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public int getNumOfAccess() {
        return numOfAccess;
    }

    public Date getLastAccessTime() {
        return lastAccessTime;
    }

    public void touch() {
        ++numOfAccess;
        lastAccessTime = new Date();
    }

    public String getTinyUrl() {
        return TinyUrlUtil.getTinyUrl(index);
    }

    public String toString() {
        return getTinyUrl();
    }
}
