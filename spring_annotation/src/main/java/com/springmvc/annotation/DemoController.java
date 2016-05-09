package com.springmvc.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yzp on 2016/5/9.
 */
@Controller
public class DemoController {
    @RequestMapping("/init")
    public String init(){
        return "success";
    }
}
