package com.springboot.app.controller;

import com.springboot.app.domain.Student;
import com.springboot.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: wangzhiyuan[wang_zy1@suixingpay.com]
 * @date: 2018年10月30日 17时53分
 * @Copyright 2018 ©Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
@RestController

public class StudentController {
    @Autowired
    private StudentService userService;

    @RequestMapping("/list")
    public List<Student> list() {

        return userService.list();
    }

    @RequestMapping("/insert")
    public int insert(){
        Student student = new Student();
        student.setId(3);
        student.setAge(15);
        student.setName("wanguw");
        return userService.insert(student);
    }
}
