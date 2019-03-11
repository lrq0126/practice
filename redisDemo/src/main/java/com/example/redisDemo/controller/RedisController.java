package com.example.redisDemo.controller;

import com.example.redisDemo.entity.User;
import com.example.redisDemo.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@Slf4j
@RestController
@RequestMapping("/redis")
public class RedisController {

    private static int ExpreTime = 60;

    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("set")
    public boolean redisset(String key, String value){
        User user = new User();
        user.setId(Long.valueOf(1));
        user.setGuid(String.valueOf(1));
        user.setName("zhangsna");
        user.setAge(String.valueOf(20));
        user.setCreateTime(new Date());
        return redisUtil.set(key,value);
    }

    @RequestMapping("get")
    public Object redisget(String key){
        return redisUtil.get(key);
    }

    @RequestMapping("expire")
    public boolean expire(String key){
        return redisUtil.expire(key,ExpreTime);
    }
}
