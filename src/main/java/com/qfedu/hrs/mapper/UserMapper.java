package com.qfedu.hrs.mapper;

import com.qfedu.hrs.domain.User;

/**
 * 用户数据访问对象
 * @author 骆昊
 *
 */
public interface UserMapper {

	User findById(String username);

	boolean save(User user);
}
