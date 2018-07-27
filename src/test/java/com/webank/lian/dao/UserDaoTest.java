package com.webank.lian.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
	
	@Autowired
	UserDao userDao;
	
	@Test
	public void getUserByName() {
		System.out.println(userDao.getUserByName("zyd"));
	}
	
	@Test
	public void getUserById() {
		System.out.println(userDao.getUserById(1L));
	}
}