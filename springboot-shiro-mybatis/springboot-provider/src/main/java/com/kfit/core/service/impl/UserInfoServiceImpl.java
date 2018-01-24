package com.kfit.core.service.impl;

import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import com.alibaba.dubbo.config.annotation.Service;
import com.kfit.core.service.UserInfoService;
import com.kfit.dao.UserDao;
import com.kfit.entity.userInfo;

@Service(version="1.0.0")
public class UserInfoServiceImpl implements UserInfoService {
@Autowired
private UserDao userDao;
@Autowired
private RedisTemplate redisTemplate;
private static final Logger LOGGER = LoggerFactory.getLogger(UserInfoServiceImpl.class);
	public userInfo findByUsername(String username) {
		// TODO Auto-generated method stub
		return userDao.finduserByName(username);
	}
	@Override
	public userInfo findById(int id) {
		  // 从缓存中获取信息
        String key = "user-" + id;
        ValueOperations<String, userInfo> operations = redisTemplate.opsForValue();

        // 缓存存在
        boolean hasKey = redisTemplate.hasKey(key);
        if (hasKey) {
            userInfo user = operations.get(key);

            LOGGER.info("从缓存中获取了用户 >> " +"id: "+ user.getId()+", username: "+user.getUsername()+",password: "+user.getPassword());
            return user;
        }
        userInfo user;
        // 从 DB 中获取用户信息
        user = userDao.finduserById(id);
  
        
        // 插入缓存
        if(user!=null){
        operations.set(key, user, 30, TimeUnit.SECONDS);
        LOGGER.info("用户插入缓存 >> " +"id: "+ user.getId()+", username: "+user.getUsername()+",password: "+user.getPassword());
        }

        return user;
	}

}
