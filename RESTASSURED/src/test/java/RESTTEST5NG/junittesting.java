package RESTTEST5NG;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class junittesting {
	@BeforeTest
	
	public void BT1()
	{
		String Name = "Sunil";
		String SName = "Nishchith";
		Assert.assertEquals(SName, Name);
	}
	
	@Test
	public void testcase11()
	{
		System.out.println("This is my first teestcase1");
	}
	
	@AfterTest
	public void AT1()
		{
		System.out.println("This is After test");
	    }
11:29
@Before
	public void BT()
	{
		String Name = "Sunil";
		String SName ="Nishchith";
		
		Assert.assertEquals(SName,Name);
		System.out.println("Both the names are same");
	}
	
	@Test
	public void testcase1()
	{
		System.out.println("This is the first method");
	}
	
	@After
	public void AT()
	{
		System.out.println("This is after method");
	}
	
	

}
