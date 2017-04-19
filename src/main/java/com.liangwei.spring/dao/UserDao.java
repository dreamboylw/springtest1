package com.liangwei.spring.dao;

import com.liangwei.spring.demo.UserDo;

/**
 * Created by zhangls on 2016/12/4 0004.
 */
public interface UserDao {

    //public Boolean validateUser(UserDo userDo);
    public UserDo validateUser(UserDo userDo);
}
