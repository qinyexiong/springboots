package com.springboot.demo1.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		//是得/login/page映射为login.html
//		System.out.println("hahah i come ");
//		registry.addViewController("/login/page").setViewName("/web/common/security/login");
//		registry.addViewController("/login-error").setViewName("/web/common/security/error2");
//		registry.addViewController("/index").setViewName("/web/common/frame/index");
//		registry.addViewController("/logout").setViewName("/web/common/security/login");
	}

	

}
