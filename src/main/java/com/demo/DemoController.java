package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhangfanfan on 16-9-5.
 */
@RequestMapping("/")
@Controller
public class DemoController {

    @RequestMapping("demo")
    @ResponseBody
    public Object demo(){
        return "hello";
    }
}
