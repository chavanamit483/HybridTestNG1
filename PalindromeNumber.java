 package interviewPrograms.Amit;

public class PalindromeNumber 
{
	void PalindromeCheck()
	{
	int num = 123456789;
   int revN =0;
   
   while(num!=0)
   {
	  int rem = num % 10;
	  revN = revN * 10 + rem ;
	  num = num / 10 ;
   }
   
   if(num==revN)
   {
	 System.out.println("Given number is palindrome");  
   }else
   {
	   System.out.println("given number is not palindrome");
   }
   }
	
	public static void main(String[] args) 
	{
		PalindromeNumber obj = new PalindromeNumber();
		obj.PalindromeCheck();
	}
}
