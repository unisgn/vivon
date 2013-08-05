package com.sink.lib.core;

import java.util.HashMap;
import java.util.Map;

public class ResponseMap {

	public static Map<String, Object> returnMap(String success, Object data, String msg) {
		Map<String, Object> rm = new HashMap<String, Object>();
		rm.put("success", success);
		rm.put("data", data);
		rm.put("message", msg);
		return rm;
	}
}
