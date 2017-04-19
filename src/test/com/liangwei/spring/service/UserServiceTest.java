package com.liangwei.spring.service;

import com.liangwei.spring.dao.UserDao;
import com.liangwei.spring.demo.BaseSpringTest;
import com.liangwei.spring.demo.UserDo;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhangls on 2016/12/4 0004.
 */
@Slf4j
public class UserServiceTest extends BaseSpringTest {

    //加载方式
    //ApplicationContext context;
    //注解方式
    //AnnotationConfigApplicationContext annotationContext;
    //继承外部类实现加载
//    @Autowired
//    private UserDo userDo;
//    @Autowired
//    private UserService userservice;

    @Autowired
    private UserDao userDao;

    @Before
    public void setUp() throws Exception {

      //  context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});

        //扫描包的方式
//        annotationContext = new AnnotationConfigApplicationContext();
//        annotationContext.scan("com.liangwei.spring");
//        annotationContext.refresh();

//        SpringDemo sd = (SpringDemo) context.getBean("springDemo");

//        log.info("sd username : {}", sd.getUserName());
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testValidateUser() throws Exception {
//        UserDo userDo = new UserDo();
//        userDo.setUserName("zhangsan");
//        userDo.setPassword("123456");

        //UserService userService = (UserService)context.getBean("userService");
        //Boolean bool = userService.validateUser(userDo);
        //log.warn("bool:{}", bool);
        //log.warn("bool:",true);
        //UserService userService = annotationContext.getBean("userService",UserService.class);
//        UserDo userdo=userService.login("aaa","ssss");
//        log.warn("用户验证：{}",userdo);

        //log.warn("用户验证：{}",userDo.getUserName());
        UserDo u = new UserDo();
        u.setUserName("member");
        u.setPassword("member123");
        UserDo user = userDao.validateUser(u);
        log.warn("user:{}",user);
    }
}