package com.sam.springboot.mybatis.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sam on 2017/10/31.
 */
@RestController
@RequestMapping("/mybatis")
public class AppMessageController {

    @Autowired
    private AppMessageService appMessageService;

    @RequestMapping("/getThree")
    public List<AppMessage> getThreeForMessage(){
        List<AppMessage> list = appMessageService.getMessage();
        return list;
    }

    @RequestMapping("/getAll")
    public List<AppMessage> getAllMessage(){
        List<AppMessage> list = appMessageService.getAllMessage();
        return list;
    }


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public int addMessage(@RequestBody AppMessage appMessage){
        return appMessageService.addMessage(appMessage);
    }

    @RequestMapping(value="/delMessageById",method= RequestMethod.POST)
    public int delMessageById(@RequestParam("id") String id){
        return appMessageService.delMessage(id);
    }
}


