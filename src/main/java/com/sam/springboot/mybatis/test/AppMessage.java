package com.sam.springboot.mybatis.test;

import java.util.Date;

/**
 * 此Model与数据库对应
 * Created by sam on 2017/10/31.
 */
public class AppMessage {
    private String id;

    private String message;

    private Date senddate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Date getSenddate() {
        return senddate;
    }

    public void setSenddate(Date senddate) {
        this.senddate = senddate;
    }
}
