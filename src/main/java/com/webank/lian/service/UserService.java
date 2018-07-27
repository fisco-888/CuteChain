package com.webank.lian.service;

import com.webank.lian.dao.UserDao;
import com.webank.lian.domain.User;
import com.webank.lian.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;


@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public Result login(String identification, String password) {
		//身份证号或密码为空
		if (StringUtils.isEmpty(identification) || StringUtils.isEmpty(password)) {
			return Result.error(1, "身份证号或密码为空");
		}
		
		//身份证号不存在
		User user = userDao.getUserByIdentification(identification);
		if (user == null) {
			return Result.error(2, "身份证号不存在");
		}
		
		//身份证号或密码错误
		if (!password.equals(user.getPassword())) {
			return Result.error(3, "身份证号或密码错误");
		}
		
		return Result.success(user.getId());
	}
	
}
