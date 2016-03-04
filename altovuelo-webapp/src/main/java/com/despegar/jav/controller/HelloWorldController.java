package com.despegar.jav.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/test")
public class HelloWorldController {

	@RequestMapping(value = "/hello-world", method = {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public String hello() {
		return "Hello World!";
	}

	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	@ResponseBody
	public String helloWitName(@PathVariable String name,
			@RequestParam(value = "lastName", required = false) String lastName,
			@RequestParam(value = "age", required = true) String age) {
		if (StringUtils.isNotBlank(lastName)) {
			return "Hello " + name + " " + lastName + " . Edad: " + age;
		}
		return "Hello " + name;
	}

}
