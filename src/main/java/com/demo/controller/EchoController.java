package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sp on 2016/5/31.
 */
@RestController
public class EchoController {

    @RequestMapping(value = "/echo",method = RequestMethod.GET)
    public String getEcho(){
        return "hello";
    }
}
