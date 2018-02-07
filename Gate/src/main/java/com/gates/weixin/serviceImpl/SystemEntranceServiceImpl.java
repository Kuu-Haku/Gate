package com.gates.weixin.serviceImpl;


import java.util.ArrayList;
import java.util.List;

import com.gates.weixin.entity.ReceiveMsg;
import com.gates.weixin.entity.send.NewsMsg;
import com.gates.weixin.entity.send.NewsMsg.Item;
import com.gates.weixin.service.SystemEntranceService;

//@WebService(endpointInterface="com.gates.weixin.service.TestService")
public class SystemEntranceServiceImpl implements SystemEntranceService{

	public String getTest(ReceiveMsg msg) {
		//http://5b0988e595225.cdn.sohucs.com/images/20171007/875f3a2df4894a32b695f083a10a76fa.jpeg
		NewsMsg news = new NewsMsg();
		news.setFromUserName(msg.getToUserName());
		news.setToUserName(msg.getFromUserName());
		news.setArticleCount(1);
		List<Item> list = new ArrayList<>();
		Item item = new Item();
		item.setTitle("test");
		item.setDescription("just for test");
		item.setPicUrl("http://5b0988e595225.cdn.sohucs.com/images/20171007/875f3a2df4894a32b695f083a10a76fa.jpeg");
		item.setUrl("http://www.baidu.com");
		list.add(item);
		news.setArticles(list);
		return news.toString();
	}
	
	
	
	

}
