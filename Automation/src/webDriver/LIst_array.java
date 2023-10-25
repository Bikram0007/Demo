package webDriver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LIst_array 
{
	public static void main(String[] args) throws Throwable 
	{
		ArrayList<String> testing = new ArrayList<String>();
		System.out.println(testing.size());
		Thread.sleep(3000);
		testing.add("Madhu");
		testing.add("Rony");
		testing.add("Ankit");
		testing.add("jay");
		testing.add("sai");
		testing.add("Madhu");
		testing.add("sai");
		System.out.println(testing.size());
		System.out.println(testing);
		for (int i=0; i<testing.size();i++)
		{
			System.out.println(testing.get(i));
		}
		Set<String>Dev = new HashSet<String>();
		Dev.add("Madhu");
		Dev.add("Rony");
		Dev.add("Ankit");
		Dev.add("jay");
		Dev.add("sai");
		Dev.add("Madhu");
		Dev.add("sai");
		System.out.println(Dev.size());
		System.out.println(Dev);
	}

}
