package com.sam.springboot.mybatis.test;

import java.util.List;

/**
 * Created by sam on 2017/10/31.
 */
public interface IAppMessageService {
    public List<AppMessage> getMessage();
    public List<AppMessage> getAllMessage();
    public int addMessage(AppMessage appMessage);
    public int delMessage(String id);
}

