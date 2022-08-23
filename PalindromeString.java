package interviewPrograms.Amit;

public class PalindromeString 
{
   String str = "madam";
   String reverseStr = "";
   void palindromeCheck()
   {
   for (int i=str.length()-1; i>=0 ; i--)
   {
	 reverseStr = reverseStr + str.charAt(i);  
   }
   
   if(str.equals(reverseStr))
   {
	  System.out.println("Given String is Palindrome");   
   }else
   {
	   System.out.println("Given String is not palindrome");
   }
   }
   public static void main(String[] args) 
    { 
	   PalindromeString obj = new PalindromeString();
	   obj.palindromeCheck();
    }
   
}
