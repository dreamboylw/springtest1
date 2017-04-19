package com.liangwei.spring.service.impl;

import com.liangwei.spring.demo.BaseSpringTest;
import com.liangwei.spring.demo.UserDo;
import com.liangwei.spring.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by admin on 2017/4/18.
 */
@Slf4j
public class UserServiceImplTest extends BaseSpringTest{

    @Autowired(required = false)
    private UserService userService;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findUserById() throws Exception {
        UserDo userDo = new UserDo();
        userDo.setUserId(1);
        UserDo userD1 = userService.findUserById(userDo);
        log.warn("UserD1 : {}", userD1);
    }

    @Test
    public void addUser() throws Exception {
    }

    @Test
    public void login() throws Exception {
        UserDo user=userService.login("lidk","123456789");
        log.warn("UserDo:{}",user);
    }

}