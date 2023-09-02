package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngBasics {



	// pre conditions     starting with @Before
	
	@BeforeSuite                                    //1
	public void setUp() {
    System.out.println("System set property for chrome");	
    }
	
	@BeforeClass                                      //2
	public void launchBrowser() {
    System.out.println("launch chrome Browser");	
    }
	
	@BeforeTest                                        //3
	public void enterUrl() {
    System.out.println("enter url ");	
    }
	
	/*
	@BeforeMethod
	@Test   1
	@AfterMethod

	@BeforeMethod
	@Test   2
	@AfterMethod
	.
	.
	.
	.

		 */
		
	@BeforeMethod                                         //4
	public void login() {
    System.out.println("login to the app");	
    }
	// test case starting with @Test
	
	@Test                                        //5
	public void googleTitleTest() {
    System.out.println("google title test ");	
    }
	
	@Test                                        //5
	public void searchTest() {
    System.out.println("search  Test ");	
    }
	
	// post conditions     starting with @After
	
	
    @AfterMethod                                         //6
	public void logOutTest() {
    System.out.println("logout from an app");	
    }
	
	@AfterClass                                //7
	public void closeBrowser() {
        System.out.println("closing of a browser");	
    }
	
	@AfterTest                                        //8
	public void deleteAllCoockies() {
    System.out.println("deleteAll  Coockies");	
    }	
	
	
	@AfterSuite                                               //9
	public void generateTestReport() {
    System.out.println("generate Test Report");	
    }
	
	
}