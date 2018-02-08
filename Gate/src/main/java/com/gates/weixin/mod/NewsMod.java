package com.gates.weixin.mod;

import org.springframework.stereotype.Component;


@Component
public class NewsMod implements ModInterface{
	
	private static NewsMod newsMod = new NewsMod();
	
	private NewsMod(){
		ModBox.setMod("news", newsMod);
		System.out.println("init news");
	}
	public String deal() {
		// TODO Auto-generated method stub
		return "this is newsMod";
	}

}
