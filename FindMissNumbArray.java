package interviewPrograms.Amit;

public class FindMissNumbArray 
{
   
   
   //Use this formula S = n*(a + n)/2********for 1 to 5 **  n =5, a=1,   s=Answer
   
   public static void main(String[] args) 
   {
	   int a [] = {1,2,4,5};
	   int n= a[a.length-1];
	   int sum = n*(1+n)/2;
	   int arrsum = 0;
	  // System.out.println(sum);
	   
	   for(int i =0; i<a.length ; i++)
	   {
		 arrsum = arrsum + a[i] ;  
	   }
	   
	   //System.out.println(arrsum);
	   
	   int number = sum-arrsum;
	   
	   System.out.println("Missing number is = "+number);
   }
       
   
	
}
   

