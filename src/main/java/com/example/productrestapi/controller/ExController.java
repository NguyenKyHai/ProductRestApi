package com.example.productrestapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class ExController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String getAllProducts( ) {

        return "Hello World!";
    }
}

