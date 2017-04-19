package com.liangwei.spring.dao.impl;

import com.liangwei.spring.dao.UserDao;
import com.liangwei.spring.demo.UserDo;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


/**
 * Created by zhangls on 2016/12/4 0004.
 */
@Slf4j
@Repository
public class UserDaoImpl implements UserDao {


//    @Override
//    public Boolean validateUser(UserDo userDo) {
//        if("zhangsan".equals(userDo.getUserName()) && "123456".equals(userDo.getPassword())){
//            return Boolean.TRUE;
//        }else {
//            return Boolean.FALSE;
//        }
//    }
        @Getter
        //spring自带的数据库连接JdbcTemplate
        @Autowired
        private JdbcTemplate jdbcTemplate;

        @Override
        public UserDo validateUser(UserDo userdo){
            System.out.println("bbbbbb");
            String sql="SELECT " +
                    "t.user_id userId," +
                    "t.user_name userName," +
                    "t.pass_word password," +
                    "t.real_name realName," +
                    "t.email email," +
                    "t.cell_phone cellPhone," +
                    "t.address address," +
                    "t.user_type userType," +
                    "t.state," +
                    "t.create_by," +
                    "t.create_date," +
                    "t.update_by," +
                    "t.update_date " +
                    "FROM tb_user t WHERE t.user_name=? AND t.pass_word=?";
            RowMapper<UserDo> rm=new BeanPropertyRowMapper<UserDo>(UserDo.class);
//            List<UserDo> ls= Lists.newArrayList();
            return this.getJdbcTemplate().queryForObject(sql,
                    new Object[]{userdo.getUserName(),
                            userdo.getPassword()},rm);
        }

}
