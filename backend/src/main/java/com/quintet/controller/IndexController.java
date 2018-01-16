package com.quintet.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api("index controller")
@RestController
public class IndexController {


    @ApiOperation(value = "1", notes = "123")
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Quintet's system!";
    }


    @ApiOperation(value = "2", notes = "456")
    @RequestMapping("/health")
    @ResponseBody
    public String health() {
        return "Quintet system is health!";
    }

}
