package com.testng.practice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTestngAnotations {
	
	@Test
	public void test() {
		System.out.println("This is @Test");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is @beforetest");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is @beforemathod");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is @beforesuite");
	}
	@AfterTest
	public void aftertestMethod() {
		System.out.println("This is @aftertest");
	}
	@AfterSuite
	public void aftersuiteMethod() {
		System.out.println("This is @aftersuite");
	}
	
	

}
