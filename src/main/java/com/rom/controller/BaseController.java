package com.rom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program springboot-jsp-demo
 * @description:
 * @author: hongqizhixing
 * @create: 2019/08/14 17:32
 */
@Controller
public class BaseController {

	@RequestMapping("/login")
	public String login() {
//		return "/jsp/index.jsp";

		// 配置前缀和后缀后访问地址
		return "/index";
	}

	@RequestMapping("/welcome")
	public String welcome() {
//		return "/jsp/welcome.jsp";

		// 配置前缀和后缀后访问地址
		return "/welcome";
	}
}
