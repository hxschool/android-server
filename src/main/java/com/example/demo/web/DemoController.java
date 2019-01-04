package com.example.demo.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	@RequestMapping("demo")
	public String demo(HttpServletRequest request) throws IOException {
		String str = IOUtils.toString(request.getInputStream());
		System.out.println(str);
		return str;
	}
}
