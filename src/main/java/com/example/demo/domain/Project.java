package com.example.demo.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 项目
 */
@Data
@Entity
public class Project {
    @Id
    @GeneratedValue
    private Long id;
    /**图片*/
    private String picture;
    /**名称*/
    private String name;
    /**描述*/
    private String content;
    /**开始时间*/
    private Date startDate;
    /**预计结束时间*/
    private Date estimateEndDate;
    /**实际结束时间*/
    private Date actualEndDate;
}
