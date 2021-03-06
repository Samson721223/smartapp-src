package com.youle.gamebox.ui.greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table RECOMMEND_GAME.
 */
public class RecommendGame {

    private Long appid;
    private String name;
    private String downloadurl;
    private String imageurl;
    private Boolean isrecommend;

    public RecommendGame() {
    }

    public RecommendGame(Long appid) {
        this.appid = appid;
    }

    public RecommendGame(Long appid, String name, String downloadurl, String imageurl, Boolean isrecommend) {
        this.appid = appid;
        this.name = name;
        this.downloadurl = downloadurl;
        this.imageurl = imageurl;
        this.isrecommend = isrecommend;
    }

    public Long getAppid() {
        return appid;
    }

    public void setAppid(Long appid) {
        this.appid = appid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDownloadurl() {
        return downloadurl;
    }

    public void setDownloadurl(String downloadurl) {
        this.downloadurl = downloadurl;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public Boolean getIsrecommend() {
        return isrecommend;
    }

    public void setIsrecommend(Boolean isrecommend) {
        this.isrecommend = isrecommend;
    }

}
