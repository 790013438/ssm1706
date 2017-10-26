package com.qfedu.hrs.service.impl;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qfedu.hrs.domain.User;
import com.qfedu.hrs.mapper.UserMapper;
import com.qfedu.hrs.service.UserService;

/**
 * 用户相关业务实现类
 * @author 骆昊
 *
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public boolean login(String username, String password) {
		User temp = userMapper.findById(username);
		if (temp != null) {
			String md5 = DigestUtils.md5Hex(password);
			return temp.getPassword().equals(md5);
		}
		return false;
	}

	@Override
	public boolean register(User user) {
		User temp = userMapper.findById(user.getUsername());
		if (temp == null) {
			String md5 = DigestUtils.md5Hex(user.getPassword());
			user.setPassword(md5);
			return userMapper.save(user);
		}
		return false;
	}

}
