package com.sam.springboot.mybatis.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sam on 2017/10/31.
 */
@Component
public class AppMessageService implements IAppMessageService {
    @Autowired
    private AppMessageMapper appMessageMapper;

    @Override
    public List<AppMessage> getMessage(){
        List<AppMessage> list = new ArrayList<>();
        list.add(appMessageMapper.selectByPrimaryKey("1"));
        return list;
    }

    @Override
    public List<AppMessage> getAllMessage(){
        List<AppMessage> list = appMessageMapper.selectAll();
        return list;
    }

    @Override
    public int addMessage(AppMessage appMessage) {
        return appMessageMapper.insert(appMessage);
    }



    @Override
    public int delMessage(String id) {
        return appMessageMapper.deleteByPrimaryKey(id);
    }
}
