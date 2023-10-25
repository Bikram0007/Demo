package fatchingData;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class JaggedArray 
{
	@DataProvider(name = "logindata")
	public Object[][]passdata()
	{
		Object[][]data = {{"admin","adm2 in123"}, {"admin","admin654","pupul"},
							
				{"Sona","Golu","Mamma"},{"admin","manager"}  };
		return data;
		}
	@Test(dataProvider = "logindata")
	public void login(Object[] obj)
	{
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i]+ " ");
		}
		System.out.println();
		System.out.println("______________________________________________________");
	}
}

