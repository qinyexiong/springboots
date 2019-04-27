package com.springboot.base.controller.webpage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SecurityController {

    @RequestMapping("/login/error")
    public ModelAndView loginError() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/web/common4ace/security/error2");
        modelAndView.addObject("msg", "error");
        return modelAndView;
    }

    @RequestMapping("/login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/web/common4ace/security/login");
        return modelAndView;
    }

    @RequestMapping("/jui")
    public ModelAndView indexJui() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/web/common4dwz/frame/index");
        return modelAndView;
    }

    @RequestMapping("/ace")
    public ModelAndView indexAce() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/web/common4ace/frame/index");
        return modelAndView;
    }


}