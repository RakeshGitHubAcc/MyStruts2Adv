package com.test.action;

import com.opensymphony.xwork2.ActionSupport;
/**
 * This Action class is used to demo waitAndExecute interceptor
 * */
public class LongProcessAction extends ActionSupport {

	public String execute() throws Exception {
		// it should be delay few seconds,
		// unless you have a super powerful computer.
		for (int i = 0; i < 1000000; i++) {
			System.out.println(i);
		}
		return SUCCESS;

	}
}
