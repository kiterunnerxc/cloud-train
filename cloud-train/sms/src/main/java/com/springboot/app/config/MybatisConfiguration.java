package com.springboot.app.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: wangzhiyuan[wang_zy1@suixingpay.com]
 * @date: 2018年10月30日 17时52分
 * @Copyright 2018 ©Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
@Configuration
@MapperScan("com.springboot.app.mapper")
public class MybatisConfiguration {
}
