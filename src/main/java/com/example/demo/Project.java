package com.example.demo;

import java.util.Date;
import java.util.List;

/**
 * 项目
 */
public class Project {
    /**图片*/
    private String picture;
    /**名称*/
    private String name;
    /**描述*/
    private String describe;
    /**开始时间*/
    private Date startDate;
    /**预计结束时间*/
    private Date estimateEndDate;
    /**实际结束时间*/
    private Date actualEndDate;

    public Project() {
        this.picture = "/1.png";
        this.name = "项目名称";
        this.describe = "项目描述";
        this.startDate = new Date();
        this.estimateEndDate = new Date();
        this.actualEndDate = new Date();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEstimateEndDate() {
        return estimateEndDate;
    }

    public void setEstimateEndDate(Date estimateEndDate) {
        this.estimateEndDate = estimateEndDate;
    }

    public Date getActualEndDate() {
        return actualEndDate;
    }

    public void setActualEndDate(Date actualEndDate) {
        this.actualEndDate = actualEndDate;
    }
}
