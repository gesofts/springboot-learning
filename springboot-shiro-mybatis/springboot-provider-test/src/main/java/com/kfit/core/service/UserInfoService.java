package com.kfit.core.service;

import com.kfit.entity.userInfo;








public interface UserInfoService {
	
	/**通过username查找用户信息;*/
	public userInfo findByUsername(String username);
	public userInfo findById(int id);
	
}
