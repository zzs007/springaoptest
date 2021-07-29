/**
 * 
 */
package com.test.foo.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author zzs007
 *
 */
@Documented
@Retention(RUNTIME)
@Target(TYPE)
@Component
@Aspect
public @interface Aop {
	/*
	 * I want use this annotation on the aop class,but the @Aspect can only used on the class,but not on the annotation
	 * */
}
