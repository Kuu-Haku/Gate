package com.gates.weixin.serviceImpl;


import com.gates.weixin.entity.BaseMsg;
import com.gates.weixin.entity.ReceiveMsg;
import com.gates.weixin.entity.send.NormalMsg;
import com.gates.weixin.inter.ModInterface;
import com.gates.weixin.modcontrol.ModBox;
import com.gates.weixin.service.SystemEntranceService;

public class SystemEntranceServiceImpl implements SystemEntranceService{

	public String getTest(ReceiveMsg msg) {
		ModInterface mod = ModBox.getMod(msg.getMsgType());
		String result = ""; 
		if(mod == null){
			//返回文本信息说明模块未开放
			BaseMsg error = msg.response(new NormalMsg("该模块功能未开放!"));
			result = error.toString();
		}else{
			result = mod.deal(msg);
		}
		return result;
	}

}
