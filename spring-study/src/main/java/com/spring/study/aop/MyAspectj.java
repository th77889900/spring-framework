package com.spring.study.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * this is a aspect of my declaration
 * @author ：tengu
 * @date ：Created in 2020/10/7 4:37 下午
 */
@Component
@Aspect
public class MyAspectj {

	/**
	 * this is a point cut (in this point involve a number of methods about com.spring.study.aop.dao)
	 */
	@Pointcut("execution(* com.spring.study.aop.dao.*.*(..))")
	public void pointCut() {

	}

//	/**
//	 * execution 可以定义放的封装范围，方法名，参数类型，参数个数等等 实用性强
//	 * within 只能定义到包名 实用性不强
//	 */
//	@Pointcut("within(com.spring.study.aop.dao)")
//	public void pointCutWithin() {
//	}

	/**
	 * this is a advice
	 * advice location and context
	 */
	@Before("pointCut()")
	public void adviceBefore() {
		System.out.println("this is before advice ");
	}

	@After("pointCut()")
	public void adviceAfter() {
		System.out.println("this is after advice ");
	}


	@Around("pointCut()")
	public Object adviceAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("around before");

		Object proceed = joinPoint.proceed();

		System.out.println("around after");

		return proceed;
	}

}
