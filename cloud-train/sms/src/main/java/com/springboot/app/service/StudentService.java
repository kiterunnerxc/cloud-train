package com.springboot.app.service;

import com.springboot.app.domain.Student;
import com.springboot.app.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: wangzhiyuan[wang_zy1@suixingpay.com]
 * @date: 2018年10月30日 17时57分
 * @Copyright 2018 ©Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public List<Student> list() {
        return studentMapper.list();
    }

    public List<Student> selectById(int id) {
        return studentMapper.selectById(id);
    }
    @Transactional()
    public int insert(Student student){
        return  studentMapper.insert(student);
    }
    @Transactional()
    public int deleteById(int id){
        return  studentMapper.deleteById(id);
    }
    @Transactional()
    public int updateById(Student student){
        return studentMapper.updateById(student);
    }

}
