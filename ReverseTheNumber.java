package interviewPrograms.Amit;

public class ReverseTheNumber 
{
  void reverenumber()
  {
	  int number =9864128; 
	  int reverse = 0;
	  
	  while(number!=0)
	  {
		 int rem = number%10;
		 reverse = reverse*10 + rem ;
		 number = number / 10 ;
	  }
	  System.out.println(reverse);
  }
  public static void main(String[] args) 
  {
	  ReverseTheNumber obj = new ReverseTheNumber();
	  obj.reverenumber();
  }
  
}
