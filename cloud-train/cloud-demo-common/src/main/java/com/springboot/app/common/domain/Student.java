package com.springboot.app.common.domain;

import lombok.Data;

/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: wangzhiyuan[wang_zy1@suixingpay.com]
 * @date: 2018年10月30日 17时54分
 * @Copyright 2018 ©Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
@Data
public class Student {
    //学生学号
    private  Integer id;
    //学生姓名
    private String name;
    //性别
    private String sex;
    //年龄
    private Integer age;
    //班级
    private String sclass;
    //任课老师
    private String teacher;
    //创建时间
    private String create_time;
    //年份
    private String year;
    //学生状态
    private Integer status;

}
