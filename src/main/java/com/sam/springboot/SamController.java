package com.sam.springboot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sam on 2017/10/30.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/hello")
public class SamController {

    @RequestMapping("/sam")
    public String index(){
        return "hello sam";
    }
}
