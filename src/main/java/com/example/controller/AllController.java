package com.example.controller;

import com.example.service.AllService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName AllController
 * @Description TODO
 * @Author zhujianquanAdministrator
 * @Date 2019/04/24 14:10
 */
@Controller
@RequestMapping("/view")
public class AllController {

    @Resource
    private AllService allService;

    @RequestMapping("/test")
    @ResponseBody
    public List<HashMap<String,Object>> test() {
//        allService.test();
        return allService.test();
    }

    @RequestMapping("/getUserCount")
    @ResponseBody
    public HashMap<String,Object> getUserCount(){
        HashMap<String,Object> map = allService.getUserCount();
        return map;
    }
}
