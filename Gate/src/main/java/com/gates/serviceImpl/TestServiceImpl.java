package com.gates.serviceImpl;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.gates.dao.WQrcodeDao;
import com.gates.entity.Test;
import com.gates.entity.WQrcode;
import com.gates.service.TestService;

@WebService(endpointInterface="com.gates.service.TestService")
public class TestServiceImpl implements TestService{
	
	@Autowired
	private WQrcodeDao tests;
	
	public Test getTest(String name) {
		Test entity = new Test();
		entity.setAge(1);
		entity.setName("evangelion"+name);
		//System.out.println("-------"+name);
		WQrcode t = tests.getOne();
		System.out.println(t.getTicket());
		return entity;
	}

}
