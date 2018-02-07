package com.gates.common;

/**
 * 微信处理工具
 * @author Kuuhaku
 *
 * 2018年2月7日
 */
public class WeixinUtils {
	
	/**
	 * 微信发送信息时包装字符串
	 * @param data
	 * @return
	 */
	public static String text(String data){
		return "<![CDATA["+data+"]]>";
	}
}
