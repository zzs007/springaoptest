/**
 * 
 */
package com.test.foo.aop;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.test.foo.annotation.Aop;

import lombok.RequiredArgsConstructor;

/**
 * @author zzs007
 *
 */
@Aop
//@Aspect
@RequiredArgsConstructor
public class TestAop {
	
	/*
	 * in this pointcut(),I just want to find all class annotationed by @Controller,
	 * the @RestController is a merged annotation,in spring it equals to @Controller+@ResponseBody
	 * so we can say the class annotationed by @RestController is also a controller class
	 * but the pointcut con't find it,and I must build another pointcut for RestController
	 * 
	 * but I find that the component scan can find all class annotationed by @Component
	 *  or what ever it is used in the merged annotation
	 * 
	 * */
	@Pointcut("@within(org.springframework.stereotype.Controller)")
	public void pointcut() {
	}
	
	/*
	 * @Pointcut("@within(org.springframework.web.bind.annotation.RestController)")
	 * public void pointcut2() { }
	 */

	@Around("pointcut()")
	//@Around("pointcut()||pointcut2()")
	public Object methodAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("api request in");
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		HttpSession session = request.getSession();
		//TODO something
		Object obj = pjp.proceed();
		//TODO something
		return obj;
	}

}
