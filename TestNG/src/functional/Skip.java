package functional;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Skip
{
	@Test(priority = -63)
	public void a()
	{
		System.out.println("Rony");
	}
	@Test(priority = -54)
	public void b()
	{
		System.out.println("Galaxya");
	}

	@Test(priority = -93,invocationCount = 6)
	public void c()
	{
		System.out.println("Madhu");
	}
	@Test(priority = -82,invocationCount = 6)
	public void d ()
	{
		System.out.println("Pageli");
	}

}
