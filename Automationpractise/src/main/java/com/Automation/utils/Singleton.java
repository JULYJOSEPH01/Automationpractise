package com.Automation.utils;

import java.security.Signer;

import com.Automation.POM.Signinpage;

public class Singleton {
	private Signinpage Si;

	public Signinpage getSi() {
		
		if(Si==null) {
			
			Si=new Signinpage();
		}
		
		return Si;
	}
}


