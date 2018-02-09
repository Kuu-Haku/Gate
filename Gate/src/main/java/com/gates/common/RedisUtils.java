package com.gates.common;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Component
public class RedisUtils {
	
	private static JedisPoolConfig jedisPoolConfig = null;
	
	private static JedisPool jedisPool = null;
	
	private static String redis_password = "";
	
	private static int dbNum = 0;
	
	private RedisUtils(){
		try{
			/**
			 * 根据配置初始化连接池
			 */
			if(Redis_config.getOpen() == 1){
				init(Redis_config.getUrl(), Redis_config.getPort(), Redis_config.getMaxWaitMillis(), Redis_config.getMaxTotal(), Redis_config.getDbNum(), Redis_config.getPassword());
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
}
