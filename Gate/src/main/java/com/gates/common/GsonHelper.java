package com.gates.common;

import com.google.gson.Gson;


public class GsonHelper {
	public static <T> T fromJson(String jsonStr,Class<T> type){
		Gson gson = new Gson();
		T result = gson.fromJson(jsonStr, type);
		return result;
	}
}
