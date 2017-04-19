package com.liangwei.spring.demo;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by zhangls on 2016/12/4 0004.
 */
@Component
@Data
//和数据库要映射的表进行绑定
@Table(name="tb_user")
public class UserDo extends BaseDo{

    //主键也是表里面的主键字段user_id
    @Id
    //这个意思是主键user_id自增长
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    private String userName;//登陆用户名

    //Column意思就是数据库字段 @Column功能：是把数据库字段转换成自定义的格式
    @Column(name = "pass_word")
    private String password;//登陆密码

    private String realName;//真实姓名
    private String email;//电子邮件
    private String cellPhone;//联系电话
    private String address;//地址
    private String userType;//user_type = 1:系统用户 0:注册会员用户

    //@Transient该字段不进行数据库映射
    @Transient
    private String productId;

}
