package interviewPrograms.Amit;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class PrimeNumber
{
	//static int n =49;
	static int i;
	
	
	static boolean  isPrime(int n)
	  {
		if(n<=1)  
		{
			return false;
		}
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	  }
	
	
	
	 static public void main(String[] args) 
  {
		System.out.print("Prime number ");
		for (i = 0; i <= 100; i++)

		{

			if (isPrime(i)) {
				System.out.print(i + " ");
			}
			/*
			 * else { System.out.println("Not prime"+ i); }
			 */
  
	 }
  }
}
