package com.Automation.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
	@Before
	public void beforeHook() {
		System.out.println("Before hook");
	}
	@After
	public void afterHook() {
	System.out.println("after Hook");
	}
	
}
