package com.springboot.base.service.user;

import com.springboot.base.common.pojo.BaseResult;
import com.springboot.base.entity.SysUser;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService {

    public BaseResult queryList() {


        SysUser user = new SysUser();
        user.setId(0);
        user.setUsername("33");
        user.setTelephone("55");
        user.setMail("");
        user.setPassword("");
        user.setDeptId(0);
        user.setStatus(0);
        user.setRemark("");
        user.setOperator("");
        user.setOperateTime(new Date());
        user.setOperateIp("");


        return BaseResult.ok(user);

    }
}
