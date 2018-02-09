package com.gates.common;

import org.springframework.stereotype.Component;

@Component("redisConfig")
public class Redis_config {
	
	@SuppressWarnings("unused")
	private static Redis_config redis_config = new Redis_config();
	
	private static String url;
	
	private static int port;
	
	private static String password;
	
	private static int maxWaitMillis;
	
	private static int maxTotal;
	
	private static int dbNum;
	
	/**
	 * open值为1开启redis连接池
	 */
	private static int open;

	public static int getOpen() {
		return open;
	}

	public static void setOpen(int open) {
		Redis_config.open = open;
	}

	public static int getMaxWaitMillis() {
		return maxWaitMillis;
	}

	public static void setMaxWaitMillis(int maxWaitMillis) {
		Redis_config.maxWaitMillis = maxWaitMillis;
	}

	public static int getMaxTotal() {
		return maxTotal;
	}

	public static void setMaxTotal(int maxTotal) {
		Redis_config.maxTotal = maxTotal;
	}

	public static String getUrl() {
		return url;
	}

	public static void setUrl(String url) {
		Redis_config.url = url;
	}

	public static int getPort() {
		return port;
	}

	public static void setPort(int port) {
		Redis_config.port = port;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		Redis_config.password = password;
	}

	public static int getDbNum() {
		return dbNum;
	}

	public static void setDbNum(int dbNum) {
		Redis_config.dbNum = dbNum;
	}
	
	
}
