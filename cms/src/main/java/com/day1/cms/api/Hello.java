package com.day1.cms.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping(value = "/hello")
    public String saHello(){
        return "Hello Hoa Dep zai";
    }
}
