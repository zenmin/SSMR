package com.zm.ssmr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.zm.ssmr.bean.User;
import com.zm.ssmr.dao.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper mapper;

	public List<User> getAll(){
		List<User> list = mapper.selectByExample(null);
		return list;
	}

// 此处不加注解  需要在mapper.xml中使用Cache标签
//	@CacheEvict(value = {"getUser", "getUserById"}, allEntries = true)  
//	public void updateUser(UserVO user) {
//		userDao.updateUser(user);
//	}
//
//	@Override
//	@Cacheable(value="User",key="getUserById")
//	public UserVO getUserById(int id) {
//		return userDao.getUserById(id);
//	}

}
