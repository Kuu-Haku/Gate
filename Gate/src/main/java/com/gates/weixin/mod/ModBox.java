package com.gates.weixin.mod;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ModBox {
	private static Map<String,ModInterface> BOX = new HashMap<String,ModInterface>();
	private static int count = 0;
	
	public static int getcount(){
		return count;
	}
	
	private static ModBox MODBOX = new ModBox();
	private ModBox(){
		count = 1000;
		System.out.println("box init");
	}
	public static ModInterface getMod(String modName){
		return BOX.get(modName);
	}
	public static void setMod(String modName, ModInterface modInterface){
		BOX.put(modName, modInterface);
	}
}
