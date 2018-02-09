package com.gates.weixin.mod;

import org.springframework.stereotype.Component;

import com.gates.weixin.entity.ReceiveMsg;
import com.gates.weixin.inter.ModInterface;
import com.gates.weixin.modcontrol.ModBox;

/**
 * 推送事件处理模块
 * @author Kuuhaku
 *
 * 2018年2月9日
 */
@Component
public class EventMod  implements ModInterface{
	
	private static EventMod eventMod = new EventMod();
	
	private EventMod(){
		ModBox.setMod("event", eventMod);
	}
	@Override
	public String deal(ReceiveMsg msg) {
		// TODO Auto-generated method stub
		return "this is eventMod";
	}

}
