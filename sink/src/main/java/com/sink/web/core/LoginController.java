package com.sink.web.core;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login/login")
	@ResponseBody
	public Map<String, Object> doLogin() {
		Map<String, Object> rm = new HashMap<String, Object>(3);
		rm.put("success", "true");
		rm.put("message", "please make an authentication");
		rm.put("data", "none");
		return rm;
	}
	
	@RequestMapping(value="/login/success")
	@ResponseBody
	public Map<String, Object> doSuccess() {
		Map<String, Object> rm = new HashMap<String, Object>(3);
		rm.put("success", "true");
		rm.put("message", "login success.");
		rm.put("data", "none");
		return rm;
	}
	
	@RequestMapping(value="/logout/success")
	@ResponseBody
	public Map<String, Object> doLogout() {
		Map<String, Object> rm = new HashMap<String, Object>(3);
		rm.put("success", "true");
		rm.put("message", "logout success.");
		rm.put("data", "none");
		return rm;
	}
	
}
