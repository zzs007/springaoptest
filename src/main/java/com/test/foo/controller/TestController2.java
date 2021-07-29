/**
 * 
 */
package com.test.foo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzs007
 *
 */
@RestController//in this example,the pointcut con't find this controller class,
@RequestMapping("test")
public class TestController2 {
	
	@RequestMapping("hello2")
	public String hello() {
		return "helloWorld";
	}

}
