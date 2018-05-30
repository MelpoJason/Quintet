package com.quintet.controller.artificial;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api("artificial intelligence")
@RestController
@RequestMapping("/pc/service/ai")
public class artificialIntelligenceController {

    @ApiOperation(value = "1", notes = "123")
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "AI'S HAS START!";
    }



}
