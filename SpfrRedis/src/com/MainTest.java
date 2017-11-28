package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"spring-redis.xml"})
public class MainTest {
	
	@Autowired
	RedisTemplate<String, String> template;
	
	@Test
	public void testRedisConnection(){
		//操作字符串
//		template.opsForValue().set("dxh_test_redis_str", "123");
	}
}
