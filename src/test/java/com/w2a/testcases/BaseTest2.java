package com.w2a.testcases;

import org.testng.annotations.AfterSuite;

import com.w2a.base.Page;

public class BaseTest2 {
	
	
	@AfterSuite
	public void tearDown(){
		
		Page.quit();
		
	}

}
