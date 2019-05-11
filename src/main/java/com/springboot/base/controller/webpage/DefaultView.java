package com.springboot.base.controller.webpage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author : qinyx
 * @date : 2019/5/11/0011 11:56
 * @description:
 */
@RestController
public class DefaultView {
    @RequestMapping("/")
    public ModelAndView view(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/web/common4ace/security/login");
        return modelAndView;
    }
    @RequestMapping("/mui")
    public ModelAndView view4Mui(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/web/common4Mui/index");
        return modelAndView;
    }
}

