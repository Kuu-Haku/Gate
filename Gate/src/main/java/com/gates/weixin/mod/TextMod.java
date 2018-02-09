package com.gates.weixin.mod;

import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;

import com.gates.common.AccessTokenMaker;
import com.gates.common.RedisUtils;
import com.gates.weixin.entity.ReceiveMsg;
import com.gates.weixin.entity.send.NormalMsg;
import com.gates.weixin.inter.ModInterface;
import com.gates.weixin.modcontrol.ModBox;

@Component
public class TextMod implements ModInterface{
	
	private static TextMod textMod = new TextMod(); 
	
	private TextMod(){
		ModBox.setMod("text", textMod);
	}
	public String deal(ReceiveMsg msg) {
		
		Jedis redis = RedisUtils.getJedis();
		String word = redis.get("weixin");
		String result = msg.response(new NormalMsg(word)).toString();
		String as = AccessTokenMaker.getAccessToken();
		System.out.println("openid:"+msg.getFromUserName());
		System.out.println("access_token:"+as);
		return result;
	}

}
