package interviewPrograms.Amit;

public class EvenOddCountArray {

	public static void main(String[] args) 
	{
		int number [] = {1,2,3,4,5,6,7,8,9,10};
		int CountEven = 0; int CountOdd = 0;
		for (int i=0 ; i<=number.length-1 ; i++)
		{
			if(number[i]%2==0)
			{
			   	CountEven++;
			}
			else
			{
				CountOdd++;
			}
			
		}
		System.out.println("Number of even digits are = " + CountEven);
		System.out.println("Number of Odd digits are = " + CountOdd);}

}
