package com.liangwei.spring.service;


import com.liangwei.spring.demo.UserDo;

/**
 * Created by zhangls on 2016/12/4 0004.
 */
public interface UserService {


    public UserDo findUserById(UserDo userDo) throws Exception;

    public Boolean addUser(UserDo userDo);

    public UserDo login(String userName, String password) throws Exception;
}
