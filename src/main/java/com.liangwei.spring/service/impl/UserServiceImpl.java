package com.liangwei.spring.service.impl;


import com.google.common.collect.Lists;
import com.liangwei.spring.demo.LogDo;
import com.liangwei.spring.demo.UserDo;
import com.liangwei.spring.mapper.UserMapper;
import com.liangwei.spring.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2016-12-05.
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

//    @Autowired
//    private UserDao userDao;

    @Autowired(required = false)
    private UserMapper userMapper;

//    @Autowired(required = false)
//    private LogMapper logMapper;

//    @Autowired(required = false)
//    private ProductService productService;

//    @Autowired(required = false)
//    private UserMapper userMapper;

    //使用通用mapper接口进行查询
    @Override
    public UserDo findUserById(UserDo userdo)  throws Exception{
         return userMapper.selectOne(userdo);

//       return userMapper.findUserById(userDo.getUserId());

    }


    //    http://robinsoncrusoe.iteye.com/blog/825531
    @Override
//    @Transactional(readOnly = true,propagation = Propagation.REQUIRED)
    @Transactional
    public Boolean addUser(UserDo userDo) {//REQUIRESNEW
        //添加用户
//        int userNum = userMapper.insert(userDo);  //成功 A

//        //MANDATORY
//        productService.addPrduct(productService.inserA(), //失败B
//
//        productService.inserB();//成功B


        LogDo logDo = new LogDo();
        logDo.setOperName("insert");
        logDo.setTableName("tb_user");
        logDo.setState("1");
        logDo.setCreateBy("admin");
        logDo.setCreateDate("2016-10-10");
        logDo.setUpdateBy("admin");
        logDo.setUpdateDate("2016-10-10");

        //添加日志表
       // int logNum = logMapper.insert(logDo);//成功 A

//        if(userNum==1 && logNum==1){
//            return Boolean.TRUE;
////            throw new RuntimeException();
//        }else {
//            throw new RuntimeException();
//        }
        return Boolean.FALSE;
    }

    @Override
    public UserDo login(String userName, String password) throws Exception {
        UserDo user = new UserDo();
        user.setUserName(userName);
        user.setPassword(password);

        List<UserDo> ls = Lists.newArrayList();

//        return userMapper.selectOne(user);

     // return userDao.validateUser(user);
        return null;
    }
}
