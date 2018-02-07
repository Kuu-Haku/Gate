package com.gates.weixin.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *	接收消息集合类 
 * @author Kuuhaku
 *	当前收录类型
 *	---------事件-----------
 *	关注/取消关注
 *	---------消息-----------
 *	文本消息
 *
 *
 * 2018年2月7日
 */
@XmlRootElement(name = "xml")
public class ReceiveMsg extends BaseMsg{
	//文本信息内容
	private String content;
	//关注/取消关注事件[事件类型，subscribe(订阅)、unsubscribe(取消订阅)]
	private String msgId;
	private String event;
	@XmlElement(name = "Event")
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	@XmlElement(name = "Content")
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@XmlElement(name = "MsgId")
	public String getMsgId() {
		return msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
}
