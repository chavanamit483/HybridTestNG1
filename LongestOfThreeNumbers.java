package interviewPrograms.Amit;

public class LongestOfThreeNumbers 
{
  public static void main(String[] args) {
	

	
	int a = 9665563;
   int b = 9234;
   int c = 12345;
   
  int countA=0;
  int countB = 0;
  int countC = 0;
  
  while(a!=0)
  {
	
	  a = a/10;
	  countA++;
  }
  
  while(b!=0)
  {
	  b = b/10;
	  countB++;  
  }
  
  while(c!=0)
  {
	  c = c/10;
	  countC++; 
  }
  
  if (countA>countB)
  {
	 System.out.println("a is longest"); 
  }
  else if(countB>countC)
  {
	System.out.println("b is longest");  
  }else
  {
	  System.out.println("c is longest");
  }
  
  }
   
	
}
