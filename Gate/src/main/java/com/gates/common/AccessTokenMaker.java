package com.gates.common;

import java.util.Date;

import com.gates.weixin.entity.AccessToken;






public class AccessTokenMaker {
	private AccessTokenMaker(){}
	private static String accessToken;
	private static Long timeMark = new Date().getTime();
	
	private static String ACCESSTOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token";
	private static String APPID = "";
	private static String APPSECRET = "";
	
	public synchronized static String getAccessToken(){
		Long nowDate = new Date().getTime();
		//每小时从新获取AccessToken
		if(AccessTokenMaker.accessToken == null || AccessTokenMaker.timeMark == null || nowDate - AccessTokenMaker.timeMark >= 3600*1000){
			String params = "grant_type=client_credential&appid="+APPID+"&secret="+APPSECRET;
			//获取accessToken
			String result = HttpHelper.sendHttpGet(ACCESSTOKEN_URL+"?"+params);
			AccessToken act = GsonHelper.fromJson(result, AccessToken.class);
			AccessTokenMaker.accessToken = act.getAccess_token();
			AccessTokenMaker.timeMark = (new Date()).getTime();
			System.out.println("AccessToken:"+AccessTokenMaker.accessToken);
		}
		System.out.println("AccessToken:"+AccessTokenMaker.accessToken);
		return AccessTokenMaker.accessToken;
	}

}
