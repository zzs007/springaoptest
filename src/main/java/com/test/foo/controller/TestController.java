/**
 * 
 */
package com.test.foo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zzs007
 *
 */
@Controller
@RequestMapping("test")
public class TestController {
	
	@RequestMapping("hello")
	@ResponseBody
	public String hello() {
		return "helloWorld";
	}

}
