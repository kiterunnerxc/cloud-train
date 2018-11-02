/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: tangqihua[tang_qh@suixingpay.com]
 * @date: 2018年11月01日 21时01分
 * @Copyright 2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.springboot.app.config;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/*@Aspect
@Component*/
public class InsertAspectConfig {
    long start;
    long end;
    @Pointcut("execution(public * com.springboot.app.service.*Service.*(..))")
    public void matchCondition(){}

    @Before("matchCondition()")
    public void before(){
        System.out.println("开始执行方法");
        start=System.currentTimeMillis();
    }

    @After("matchCondition()")
    public void after(){
        System.out.println("方法执行结束");
        end = System.currentTimeMillis();
        System.out.println(end-start);
    }

}