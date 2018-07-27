package com.webank.lian.interceptor;

import com.webank.lian.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class PassportInterceptor implements HandlerInterceptor {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private HostHolder hostHolder;
	
	@Override
	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
		String ticket = null;
		Cookie[] cookies = httpServletRequest.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				if (c.getName().equals(Constants.TICKET)) {
					ticket = c.getValue();
					break;
				}
			}
		}
		
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
		if (modelAndView != null &&
				hostHolder.get() != null) {
			modelAndView.addObject("user", hostHolder.get());
		}
	}
	
	@Override
	public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
		hostHolder.remove();
	}
}
