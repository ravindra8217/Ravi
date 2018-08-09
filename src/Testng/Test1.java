package Testng;

import org.testng.annotations.Test;

/*
 * TestNG is a testing framework inspired from JUnit and NUnit but introducing some new functionality that make it more powerful
 *  and easier to use.It is an open source automated testing framework; where NG of TestNG means Next Generation.
 *  TestNG is used to produce a proper reports. TestNG gives us the capability to manage our test execution.
 *  In TestNG framework, we need to create testng.xml file to create and handle multiple test classes. 
 *  This is the xml file where you will configure your test run, set test dependency, include or exclude any test, method, 
 *  class or package and set priority etc.
 *  
 *  Benefits of TestNG:
It gives the ability to produce HTML Reports of execution
Annotations made testers life easy
Test cases can be Grouped & Prioritized more easily
Parallel testing is possible
Generates Logs
Data Parameterization is possible

*Annotations in TestNG
@BeforeSuite: The annotated method will be run before all tests in this suite have run.
@AfterSuite: The annotated method will be run after all tests in this suite have run.
@BeforeTest: The annotated method will be run before any test method belonging to the classes inside the tag is run.
@AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the tag have run.
@BeforeGroups: The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked.
@AfterGroups: The list of groups that this configuration method will run after. This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked.
@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
@AfterClass: The annotated method will be run after all the test methods in the current class have been run.
@BeforeMethod: The annotated method will be run before each test method.
@AfterMethod: The annotated method will be run after each test method.

@Test: The annotated method is a part of a test case.

 */
public class Test1 {
	
	@Test
	public void add1()
	{
		System.out.println("Test case 1 passed");
	}
	@Test
	public void add2()
	{
		System.out.println("Test case 2 passed");
	}

	@Test
	public void add3()
	{
		System.out.println("Test case 3 passed");
	}
	@Test
	public void add4()
	{
		System.out.println("Test case 4 passed");
	}
}
