package interviewPrograms.Amit;

public class FibonacciSeries {

	public static void main(String[] args)
	{
		int number = 10;
		int s1 =0;
		int s2 = 1;
		int s3;
		System.out.println("0");
		for (int i=0; i<=number; i++)
		{
		  s3 = s2 + s1;
		  s1=s2 ; s2=s3;
		  System.out.println(s3);
		}

	}

}
