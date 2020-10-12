package com.spring.study.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author ：tengu
 * @date ：Created in 2020/10/7 4:31 下午
 */
@Configuration
@ComponentScan("com.spring.study.aop")
@EnableAspectJAutoProxy
public class AppConfig {

}
