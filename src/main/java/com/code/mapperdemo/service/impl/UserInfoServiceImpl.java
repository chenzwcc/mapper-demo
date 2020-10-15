package com.code.mapperdemo.service.impl;

import com.code.mapperdemo.bean.UserInfo;
import com.code.mapperdemo.mapper.UserInfoMapper;
import com.code.mapperdemo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {

        return userInfoMapper.selectAll();
    }
}

//    git init
//    git add README.md
//        git commit -m "first commit"
//        git branch -M main
//        git remote add origin https://github.com/chenzwcc/tr.git
//        git push -u origin main