package com.code.mapperdemo.mapper;

import com.code.mapperdemo.bean.UserInfo;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;


//注意： Mapper也是引用tk.mybatis.mapper.common.Mapper包中的
@Repository
public interface UserInfoMapper extends Mapper<UserInfo> {
}
