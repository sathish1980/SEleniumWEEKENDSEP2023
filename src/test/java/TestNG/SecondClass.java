package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SecondClass {



	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("After method in second class");
	}
	@Test(priority=0,enabled=false)
	public void Testcase3()
	{
		System.out.println("Testcase 3");
	}

	@Test(priority=1,invocationCount=5,invocationTimeOut=60,groups="Sanity")
	public void Testcase2()
	{
		System.out.println("Testcase 2");
	}

	@Test(priority=2,timeOut=60,dependsOnMethods="Testcase5",groups= {"Sanity","SIT"})
	public void Testcase4()
	{
		System.out.println("Testcase 4");
	}

	@Test(priority=3,groups= {"Sanity","SIT"})
	public void Testcase5()
	{
		System.out.println("Testcase 5");
	}

	@Test(priority=4,groups= {"SIT"})
	public void Testcase6()
	{
		System.out.println("Testcase 6");
	}

}
