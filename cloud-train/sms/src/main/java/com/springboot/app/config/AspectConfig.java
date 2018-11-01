/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: guoqixin[guo_qx@suixingpay.com]
 * @date: 2018年11月01日 19时50分
 * @Copyright 2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.springboot.app.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class AspectConfig {
    //@Pointcut("execution(public * com.springboot.app.service..*Service.*(..) throws java.lang.IllegalAccessException)")
    //@org.aspectj.lang.annotation.Pointcut("execution(public * com.springboot.app.service..*Service.*(..) throws java.lang.IllegalAccessException)")
    @Pointcut("within(com.springboot.app.service.*)")
    public void matchCondition(){}

    @Around("matchCondition()")
    public void before(ProceedingJoinPoint joinPoint) throws Throwable{
        long startTime = System.currentTimeMillis();
        System.out.println("前置通知：执行方法为：" +
                joinPoint.getSignature().getDeclaringTypeName() +
                "." + joinPoint.getSignature().getName()
                + "   方法参数：" + Arrays.toString(joinPoint.getArgs()));
        joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        Long executeTime = endTime-startTime;
        System.out.println("后置通知：方法执行时间为" + executeTime+"ms");
    }
}