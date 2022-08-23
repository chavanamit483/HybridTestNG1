package interviewPrograms.Amit;
import java.util.Scanner;

public class SwappingTwoNumbers 
{
   void swap()
   {
	 Scanner sc = new Scanner(System.in);
	   
	  System.out.println("Enter the first Number  x = " );
	 
	   int x = sc.nextInt();
	   
	   System.out.println("Enter the second Number y = ");
	   
	   
	   int y = sc.nextInt();
	   
	   sc.close();
	   
	   int t = x;
	   
	   x = y;
	   
	   y = t;
	   
	   System.out.println("Swapped numbers x = "+ x +" ,y = "+ y);
  }  
   void secondWay()
   {
	   int a =10;
	   int b = 20;
	   int c;
	   
	   c=a; a=b; b=c;
	System.out.println("a= " +a);
	System.out.println("b= "+b);
   }
	   
	public static void main(String[] args) 
	{
		SwappingTwoNumbers obj = new SwappingTwoNumbers();
		
		obj.swap();
		obj.secondWay();
	}   
   
}
