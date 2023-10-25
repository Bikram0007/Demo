package functional;

import org.testng.annotations.Test;

public class NumberSum 
{
	@Test(priority = 1)
	public void sumnum()
	{
		int sum =0;
		for (int i=0;i<=10;i++)
		{
			System.out.println(i);
			sum = sum+i;
		}
		System.out.println(sum);
		System.out.println("-------------------------------");
	}
	@Test(priority = 2)
	public void even()
	{
		int sum1=0;
		for (int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				sum1 = sum1+i;
			}
			
		}
		System.out.println(sum1);
	}
	@Test
	public void table()
	{
		for(int i=10;i>=1;i--)
		{
			
			for(int j=10;j>=1;j--)
			{
				int g= i*j;
				System.out.println(i+"*"+j+"="+g);
				System.out.println("_________________________________________");
			}
		}
	}

}
