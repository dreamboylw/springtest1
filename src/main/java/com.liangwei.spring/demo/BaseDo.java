package com.liangwei.spring.demo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by admin on 2017/4/18.
 */
@Data
public class BaseDo implements Serializable {
    private String state;//是否可用状态
    private String createBy;//创建人
    private String createDate;//创建日期
    private String updateBy;//更新人

    private String updateDate;//更新时间

}
