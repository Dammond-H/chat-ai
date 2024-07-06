package com.damm.admin.util;

import com.alibaba.fastjson2.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import redis.clients.jedis.Jedis;

/**
 * @author 黄林强
 * @ClassName RedisUtil
 * @description: TODO
 * @date 2024年03月02日
 * @version: 1.0
 */
@Slf4j
@Component
public class RedisUtil {

    @Autowired
    private Jedis jedis;

    public void saveObject(String key, Object value) {
        try {
            String jsonString = JSON.toJSONString(value);
            jedis.set(key, jsonString);
            jedis.expire(key, 60*60*12);
        } catch (Exception e) {
            log.error("redis save failed, msg {}", e.getMessage());
        }
    }

    public Object getObject(String key, Class clazz) {
        String value = jedis.get(key);
        if(StringUtils.isEmpty(value)) {
            log.error("redis get object failed, key: {}", key);
            return null;
        }
        return JSON.parseObject(key, clazz);
    }

}
