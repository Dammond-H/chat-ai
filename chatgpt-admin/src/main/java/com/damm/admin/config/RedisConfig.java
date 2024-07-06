package com.damm.admin.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;
import org.springframework.util.StringUtils;
import redis.clients.jedis.Jedis;

/**
 * @author 黄林强
 * @ClassName RedisConfig
 * @description: TODO
 * @date 2024年03月02日
 * @version: 1.0
 */
@Configuration
public class RedisConfig {

    @Value("spring.redis.host")
    private String host;

    @Value("spring.redis.password")
    private String password;

    @Bean
    public Jedis jedis() {
        return new Jedis(host);
    }

    @Bean
    public RedisTemplate<String, Object> redisTemplate() {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(new JedisConnectionFactory());
        redisTemplate.setValueSerializer(new GenericToStringSerializer<>(Object.class));
        return redisTemplate;
    }
}
