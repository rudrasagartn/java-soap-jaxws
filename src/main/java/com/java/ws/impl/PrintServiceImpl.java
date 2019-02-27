package com.java.ws.impl;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.java.ws.IPrintService;


@WebService(endpointInterface = "com.java.ws.IPrintService")
public class PrintServiceImpl implements IPrintService {

	@WebMethod
	public String getHelloWorld() {
		return "Hello World :) :)";
	}

}
