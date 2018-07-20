package com.quintet.controller.artificial;


import com.quintet.model.dto.GenericDTO;
import com.quintet.service.ArtificialIntelligenceServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api("artificial intelligence")
@RestController
@RequestMapping("/pc/service/ai")
public class artificialIntelligenceController {

    @Autowired
    private ArtificialIntelligenceServiceImpl artificialIntelligenceService;


    @ApiOperation(value = "1", notes = "123")
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "AI'S HAS START!";
    }


    /**
     * @param userId
     * @return
     */
    @GetMapping("/base")
    public GenericDTO baseInfo(@RequestParam(value = "usrId", name = "", required = true, defaultValue = "-1") Integer userId) {
        return artificialIntelligenceService.baseInfo(userId);
    }

}
