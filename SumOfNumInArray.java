package interviewPrograms.Amit;

import java.util.Iterator;

public class SumOfNumInArray 
{
  
 
  public static void main(String[] args) 
  {
	  int num [] = {1,2,3,4,5};
	  int sum =0;
	  int sum1=0;
	  for(int ob : num)
	  {
		 sum = sum + ob;
	  }
	  System.out.println(sum);
	  
	  // second method
	  
	  for(int i=0; i<num.length ;i++)
	  {
		  sum1 =sum1 +num[i];
	  }
	  System.out.println(sum);
  }
}
