package interviewPrograms.Amit;

public class SumOfDigitsInNumber 
{
   public static void main(String[] args) 
   {
	
	   int number = 1234;
	   int sum = 0;
	   
	   while(number>0)
	   {
		   int  modulo = number%10;
		   sum =  modulo + sum ;
		  number = number/10;
	   }
	   
	   System.out.println(sum);
}
}
