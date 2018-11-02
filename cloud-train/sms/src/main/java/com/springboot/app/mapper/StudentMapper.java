package com.springboot.app.mapper;

import com.springboot.app.domain.Student;

import java.util.List;

/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: wangzhiyuan[wang_zy1@suixingpay.com]
 * @date: 2018年11月01日 19时00分
 * @Copyright 2018 ©Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
public interface StudentMapper {
    List<Student> list();
    List<Student> selectById(int i);
    Integer deleteById(int i);
    Integer updateById(int i);
    Integer insert(Student student);

}
