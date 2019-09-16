package com.nieshenkuan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @ResponseBody
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello(){
        logger.info("HelloController--hello");
        return "Hello World!";
    }
}
