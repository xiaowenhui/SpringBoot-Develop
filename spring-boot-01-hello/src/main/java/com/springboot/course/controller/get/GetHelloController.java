package com.springboot.course.controller.get;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: wenhui.xiao
 * @Date: 2018/12/10 10:43
 * @Version 1.0
 */

@Controller
public class GetHelloController {

    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return  "Hello World!";
    }
}
