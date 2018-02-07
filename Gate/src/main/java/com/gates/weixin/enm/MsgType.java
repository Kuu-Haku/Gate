package com.gates.weixin.enm;

/**
 * 收发信息的各种消息类型
 * @author Kuuhaku
 *
 * 2018年2月7日
 */
public enum MsgType {
	//文本信息
	Text("text"),
	//图文信息
	News("news");
	private String name;
	
	private MsgType(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}
