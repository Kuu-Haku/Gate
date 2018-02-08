package com.gates.weixin.mod;

import org.springframework.stereotype.Component;

@Component
public class TextMod implements ModInterface{
	
	private static TextMod textMod = new TextMod(); 
	
	private TextMod(){
		ModBox.setMod("text", textMod);
		System.out.println("init text");
	}
	public String deal() {
		// TODO Auto-generated method stub
		return "this is testMod";
	}

}
