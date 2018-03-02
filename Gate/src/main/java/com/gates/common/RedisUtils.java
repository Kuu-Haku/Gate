package com.gates.common;

import org.apache.commons.lang.StringUtils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
/**
 * Redis连接池
 * @author Kuuhaku
 *
 * 2018年3月2日
 */
public class RedisUtils {
	
	private static JedisPoolConfig jedisPoolConfig = null;
	
	private static JedisPool jedisPool = null;
	
	private static String redis_password = "";
	
	private static int dbNum = 0;
	
	private static String url;
	
	private static int port;
	
	private static String password;
	
	private static int maxWaitMillis;
	
	private static int maxTotal;
	
	/**
	 * open值为1开启redis连接池
	 */
	private static int open;
	
	/**
	 * 构造器注入初始化参数
	 * @param url
	 * @param port
	 * @param password
	 * @param maxWaitMillis
	 * @param maxTotal
	 * @param dbNum
	 * @param open
	 */
	private RedisUtils(String url, int port, String password,
			int maxWaitMillis, int maxTotal, int dbNum, int open){
		try{
			RedisUtils.url = url;
			RedisUtils.port = port;
			RedisUtils.password = password;
			RedisUtils.maxWaitMillis = maxWaitMillis;
			RedisUtils.maxTotal = maxTotal;
			RedisUtils.dbNum = dbNum;
			RedisUtils.open = open;
			/**
			 * 根据配置初始化连接池
			 */
			if(open == 1){
				init(url, port, maxWaitMillis, maxTotal, dbNum, password);
			}
		}catch(Exception e){
			//记录日志
		}
	}
	
	/**
	 * 
	 * @param url
	 * @param port
	 * @param maxTimeout
	 * @throws Exception 
	 */
	public static void init(String url, int port, int maxWaitMillis, int maxTotal, int dataBaseNum, String password) throws Exception{
		jedisPoolConfig = new JedisPoolConfig();
		jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
		jedisPoolConfig.setMaxTotal(maxTotal);
		redis_password = password; 
		dbNum = dataBaseNum;
		jedisPool = new JedisPool(url, port);
	}
	
	
	public static Jedis getJedis(int dbNum){
		Jedis jedis = jedisPool.getResource();
		if(!StringUtils.isBlank(redis_password)){
			jedis.auth(redis_password);
		}
		jedis.select(dbNum);
		return jedis;
	}
	public static Jedis getJedis(){
		return getJedis(dbNum);
	}

	public static int getDbNum() {
		return dbNum;
	}

	public static void setDbNum(int dbNum) {
		RedisUtils.dbNum = dbNum;
	}

	public static String getUrl() {
		return url;
	}

	public static void setUrl(String url) {
		RedisUtils.url = url;
	}

	public static int getPort() {
		return port;
	}

	public static void setPort(int port) {
		RedisUtils.port = port;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		RedisUtils.password = password;
	}

	public static int getMaxWaitMillis() {
		return maxWaitMillis;
	}

	public static void setMaxWaitMillis(int maxWaitMillis) {
		RedisUtils.maxWaitMillis = maxWaitMillis;
	}

	public static int getMaxTotal() {
		return maxTotal;
	}

	public static void setMaxTotal(int maxTotal) {
		RedisUtils.maxTotal = maxTotal;
	}

	public static int getOpen() {
		return open;
	}

	public static void setOpen(int open) {
		RedisUtils.open = open;
	}
}
