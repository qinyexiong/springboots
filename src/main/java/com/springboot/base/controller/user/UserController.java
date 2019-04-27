package com.springboot.base.controller.user;

import com.springboot.base.common.pojo.BaseResult;
import com.springboot.base.entity.SysUser;
import com.springboot.base.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/query")
    public ModelAndView queryList() {
        ModelAndView modelAndView = new ModelAndView();
        BaseResult baseResult = userService.queryList();
        if (baseResult.getStatus() == 200) {
            SysUser user = (SysUser) baseResult.getData();
            modelAndView.addObject("user", user);
        }
        modelAndView.setViewName("/web/common4ace/user/query");
        return modelAndView;
    }
}
