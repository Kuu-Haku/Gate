package com.gates.weixin.modcontrol;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.gates.weixin.inter.ModInterface;

@Component
public class ModBox {
	private static Map<String,ModInterface> BOX = new HashMap<String,ModInterface>();
	@SuppressWarnings("unused")
	private static ModBox MODBOX = new ModBox();
	private ModBox(){}
	public static ModInterface getMod(String modName){
		return BOX.get(modName);
	}
	public static void setMod(String modName, ModInterface modInterface){
		BOX.put(modName, modInterface);
	}
}
