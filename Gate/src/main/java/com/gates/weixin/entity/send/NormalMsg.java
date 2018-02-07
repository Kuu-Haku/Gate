package com.gates.weixin.entity.send;

import com.gates.common.WeixinUtils;
import com.gates.weixin.enm.MsgType;
import com.gates.weixin.entity.BaseMsg;

/**
 * 被动回复文本信息
 * @author Kuuhaku
 *
 * 2018年2月7日
 */
public class NormalMsg extends BaseMsg{
	
	private String content;
	
	public NormalMsg(){
		this.setMsgType(MsgType.Text.getName());
	}
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public String toString(){
		return getXml("<Content>"+WeixinUtils.text(content)+"</Content>");
	}
	
}
