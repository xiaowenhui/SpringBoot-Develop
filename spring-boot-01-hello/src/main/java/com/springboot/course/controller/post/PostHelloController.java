package com.springboot.course.controller.post;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: wenhui.xiao
 * @Date: 2018/12/10 11:21
 * @Version 1.0
 */
@RequestMapping("/post")
@RestController
public class PostHelloController {

    @RequestMapping(value = "/hello")
    public String hello(@RequestBody Map<String,String> map){
        String hellStr = "Hello, " + map.get("name");

        System.out.println(hellStr);
        return hellStr;
    }
}
