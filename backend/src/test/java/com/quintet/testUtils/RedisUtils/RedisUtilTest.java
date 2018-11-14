package com.quintet.testUtils.RedisUtils;

import com.quintet.BackendApplicationTests;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

public class RedisUtilTest extends BackendApplicationTests {

    Logger logger = LoggerFactory.getLogger(RedisUtilTest.class);

    @Autowired
    RedisConnectionFactory connect;

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    public void testInputValue() {
        RedisConnection redisConnection = connect.getConnection();
        try {
            redisConnection.set("jason".getBytes(), "test input value".getBytes());
            logger.info(new String(redisConnection.get("jason".getBytes())));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            redisConnection.del("jason".getBytes());
        }
    }

    @Test
    public void testRedisTemplate() {
        try {
            redisTemplate.opsForValue().set("redis:template:test", 123123);
            logger.info(String.valueOf(redisTemplate.opsForValue().get("redis:template:test")));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            redisTemplate.delete("redis:template:test");
        }
    }
}