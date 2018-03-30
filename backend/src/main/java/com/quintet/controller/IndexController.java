package com.quintet.controller;

import com.quintet.model.dto.GenericDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {
    Logger logger = LoggerFactory.getLogger(IndexController.class);

    @GetMapping(value = "/isHealth")
    public GenericDTO health() {
        return GenericDTO.getReturnDTO("quintet is alive!");
    }

}
