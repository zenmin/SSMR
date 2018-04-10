package com.zm.ssmr.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

/**
* @Title RedisCacheTransfer
* @Description 本类主要功能是静态注入中间类
* @Company null
* @author 曾敏
* @date 2017年9月20日下午3:21:38
*/
public class RedisCacheTransfer {
	    @Autowired
	    public void setJedisConnectionFactory(JedisConnectionFactory jedisConnectionFactory) {
	        RedisCache.setJedisConnectionFactory(jedisConnectionFactory);
	    }

}
