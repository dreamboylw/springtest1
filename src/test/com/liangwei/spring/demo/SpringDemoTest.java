package com.liangwei.spring.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by zhangls on 2016/12/4 0004.
 */
@Slf4j
public class SpringDemoTest {

    ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetUsername(){

        SpringDemo sd = (SpringDemo) context.getBean("springDemo");

        SpringDemo sd1 = (SpringDemo) context.getBean("springDemo");

        if(sd.equals(sd1)){
            log.info("是同一个对象");
        }else {
            log.info("不是同一个对象");
        }

//        log.info("sd username : {}", sd.getUserName());
    }
}