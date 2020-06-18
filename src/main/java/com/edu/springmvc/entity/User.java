package com.edu.springmvc.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2020/6/16 19:31
 */
public class User {
    private String username;
    private String password;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTime;

    public User(String username, String password, Date createTime) {
        this.username = username;
        this.password = password;
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
