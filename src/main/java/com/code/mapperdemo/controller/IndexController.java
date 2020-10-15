package com.code.mapperdemo.controller;

import com.code.mapperdemo.bean.UserInfo;
import com.code.mapperdemo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/findAll")
    public List<UserInfo> findAll(){
        List<UserInfo> all = userInfoService.findAll();
        for (UserInfo userInfo: all
             ) {
            System.out.println("userInfo:"+userInfo.toString());
        }
        return all;
    }
}
