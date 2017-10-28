package com.eapp.wrapme.reterofit2;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jitu on 5/8/2017.
 */

public class news {
    @SerializedName("id")
    private Integer id;
    @SerializedName("sourcename")
    private String sourcename;
    @SerializedName("pagelink")
    private String pagelink;
    @SerializedName("title")
    private String title;
    @SerializedName("imagelink")
    private String imagelink;

    @SerializedName("sourceicon")
    private String sourceicon;
    @SerializedName("body")
    private String body;
    @SerializedName("time")
    private String time;
    @SerializedName("totalviews")
    private String totalviews;
    @SerializedName("totallikes")
    private String totallikes;

    @SerializedName("w")
    private String w;


    public news(String sourcename,String pagelink, String title, Integer id, String imagelink,String sourceicon,String body,String time,String totalviews,String totallikes) {
        this.id = id;
        this.sourcename = sourcename;
        this.pagelink = pagelink;
        this.title = title;
        this.imagelink = imagelink;
        this.sourceicon = sourceicon;
        this.body = body;
        this.time = time;
        this.totalviews = totalviews;
        this.totallikes = totallikes;


    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSourcename() {
        return sourcename;
    }

    public void setSourcename(String sourcename) {
        this.sourcename = sourcename;
    }

    public String getPagelink() {
        return pagelink;
    }

    public void setPagelink(String pagelink) {
        this.pagelink = pagelink;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImagelink() {
        return imagelink;
    }

    public void setImagelink(String imagelink) {
        this.imagelink = imagelink;
    }

    public String getSourceicon() {
        return sourceicon;
    }

    public void setSourceicon(String sourceicon) {
        this.sourceicon = sourceicon;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTotalviews() {
        return totalviews;
    }

    public void setTotalviews(String totalviews) {
        this.totalviews = totalviews;
    }

    public String getTotallikes() {
        return totallikes;
    }

    public void setTotallikes(String totallikes) {
        this.totallikes = totallikes;
    }


}
