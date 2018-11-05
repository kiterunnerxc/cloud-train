package com.springboot.app.controller;

import com.springboot.app.common.domain.Student;
import com.springboot.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

//    @RequestMapping("/insert")
    //@RequestBody
    @PostMapping
    public int insert(@RequestBody Student student){

        return studentService.insert(student);
    }
//    @RequestMapping("/list")
    @DeleteMapping
    public  int deleteById(@RequestParam("id") int id){
        return studentService.deleteById(id);
    }
//    @RequestBody
    @PutMapping
    public  int updateById(@RequestBody Student student ){
        return studentService.updateById(student);

    }

    @GetMapping()
    public List<Student> list() {

        return studentService.list();
    }
//    @GetMapping
//    public List<Student> selectById(int id){
//        return studentService.selectById(id);
//    }

}
