package com.qfedu.hrs.mapper;

import com.qfedu.hrs.domain.User;

/**
 * �û����ݷ��ʶ���
 * @author ���
 *
 */
public interface UserMapper {

	User findById(String username);

	boolean save(User user);
}
