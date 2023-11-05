package com.testng.practice;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class PracticeTestngMathods {
    @Test(priority=0,groups={"smoke"}, invocationCount = 5)
	public void login() {
		System.out.println("This is login method");
		
	}
    @Test(priority=1,groups= {"Regression","Smoke"},dependsOnMethods="login")
	public void dress() {
		System.out.println("This is dress method");
	}
	
    @Test(priority=2,groups= {"smoke"},dependsOnMethods = "dress")
	public void cart(){
		System.out.println("This is cart method");
	}
	
    @Test(priority=3, enabled = false,dependsOnMethods = "cart")
	public void payment() {
		System.out.println("This is payment method");
	}
	
    @Test(priority=4)
	public void placeOrder() {
		System.out.println("This is  placeOrder");
	}
	
}
