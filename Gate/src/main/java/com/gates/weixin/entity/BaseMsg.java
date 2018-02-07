package com.gates.weixin.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

import com.gates.common.WeixinUtils;

//收发信息的基础信息模板
public class BaseMsg {
	//接收方
	private String toUserName;
	//发送方
	private String fromUserName;
	//消息创建时间
	private String createTime;
	//消息类型
	private String msgType;
	@XmlElement(name = "ToUserName")
	public String getToUserName() {
		return toUserName;
	}
	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}
	@XmlElement(name = "FromUserName")
	public String getFromUserName() {
		return fromUserName;
	}
	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}
	@XmlElement(name = "CreateTime")
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	@XmlElement(name = "MsgType")
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	
	public String getXml(String content){
		StringBuffer sb = new StringBuffer();
		sb.append("<xml>");
		sb.append("<ToUserName>"+WeixinUtils.text(toUserName)+"</ToUserName>");
		sb.append("<FromUserName>"+WeixinUtils.text(fromUserName)+"></FromUserName>");
		sb.append("<CreateTime>"+(new Date()).getTime()/1000+"></CreateTime>");
		sb.append("<MsgType>"+WeixinUtils.text(msgType)+"></MsgType>");
		sb.append(content);
		sb.append("</xml>");
		return sb.toString();
	}
	
}
