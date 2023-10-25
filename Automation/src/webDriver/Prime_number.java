package webDriver;

public class Prime_number 
{
	public static void main(String[] args) 
	{
		System.out.println("Prime numbers between 1 and 100 are:");

		for (int i = 2; i <= 100; i++)
		{
			boolean isPrime = true;

			for (int j = 2; j < i; j++) 
			{
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime)
			{
				System.out.println( i);
			}
		}
	}

}


