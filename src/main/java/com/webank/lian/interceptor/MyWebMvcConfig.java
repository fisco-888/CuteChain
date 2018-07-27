package com.webank.lian.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class MyWebMvcConfig extends WebMvcConfigurerAdapter {
	
	@Autowired
	private PassportInterceptor passportInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(passportInterceptor);
		super.addInterceptors(registry);
	}
}
