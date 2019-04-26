package com.springboot.demo1.service;

import com.springboot.demo1.common.pojo.BaseResult;
import com.springboot.demo1.dao.SysUser;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public BaseResult queryList() {
        SysUser user = new SysUser();
        user.setId(0L);
        user.setUsername("admin");
        user.setPassword("1");
        return BaseResult.ok(user);

    }
}
