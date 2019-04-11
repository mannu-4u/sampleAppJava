package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Welcome {
	@Value("${welcome.message:test}")
	private String message = "Welcome to Springboot Web-Application";

	@RequestMapping(value={"", "/", "dashboard"})
	public String welcomeTest(Map<String, Object> model) {
		model.put("message", this.message);
		return "examples/dashboard";
	}

	@RequestMapping("/icons")
	public String icon() {
		return "examples/icons";
	}

	@RequestMapping("/map")
	public String map() {
		return "examples/map";
	}

	@RequestMapping("/notifications")
	public String notification() {
		return "examples/notifications";
	}

	@RequestMapping("/tables")
	public String tables() {
		return "examples/tables";
	}

	@RequestMapping("/typography")
	public String typography() {
		return "examples/typography";
	}

	@RequestMapping("/upgrade")
	public String upgrade() {
		return "examples/upgrade";
	}

	@RequestMapping("/user")
	public String user() {
		return "examples/user";
	}

}
