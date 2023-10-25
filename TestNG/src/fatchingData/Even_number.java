package fatchingData;

import org.testng.annotations.Test;

public class Even_number
{
	@Test
	public void alternate()
	{
		for(int i=2;i<=100;i+=4)
		{
			System.out.println(i);
		}
	}

}
