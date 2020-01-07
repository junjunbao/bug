package com.boot.service;

import com.boot.domain.User;

/**
 * @author  dongbenqiang
 * @// FIXME: 2019/6/26
 */
public interface UserService {
	/**
	 * 根据id查询
	 * @param userId
	 * @return
	 */
	User selectUserById(Integer userId); 
}
