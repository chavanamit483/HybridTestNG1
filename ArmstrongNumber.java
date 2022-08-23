package interviewPrograms.Amit;

public class ArmstrongNumber 
{
    
  public static boolean isArmstrong(int number)
  {
	  int num= number;
	  int sum=0;
	  while(num!=0)
	  {
		  int digit = num%10;
		  sum = sum + (int)Math.pow(digit,3);
		  num= num/10;
	  }
	  if(number==sum)
	  {
		return true;  
	  }
	  else
	  {
		  return false;
	  }
  }
 
	
	
	public static void main(String[] args) 
  {
	int num = 153;
	
	System.out.println(isArmstrong(num));
	
	if(isArmstrong(num))
	{
	   System.out.println("Given number is Armstrong");	
	}
	else
	{
		System.out.println("Given number is not Armstrong");
	}
	
		
		
		/*
		 * int number = 153; int num=number; int sum=0; while(num!=0) {
		 * 
		 * int digit = num%10; sum = sum + (int)Math.pow(digit,3); num= num/10; }
		 * System.out.println(number); System.out.println(sum);
		 * 
		 * if (number==sum) { System.out.println("Given number is armstrong"); } else {
		 * System.out.println("Given number is not armstrong"); }
		 */
	 
		
}
  
}
