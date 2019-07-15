package com.sp.controller;

import com.sp.pojo.Bplan;
import com.sp.service.SpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author ZhPJ
 * @Date 2019/7/15 001510:09
 * @Version 1.0
 * @Description:
 */
@Controller
public class SpController {

    @Autowired
    private SpService spService;

    @GetMapping("/index")
    public String index() {
        return "/index/index";
    }

    @GetMapping("/allZte")
    @ResponseBody
    public List<Bplan> allZte() {
        return spService.selectBplans();
    }

}
