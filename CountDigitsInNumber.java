package interviewPrograms.Amit;

public class CountDigitsInNumber 
{
  public static void main(String[] args) 
  
  {
	 int number = 564789;
	 int i=0;
	 while(number!=0)
	 {
		 number = number/10;
		  i++;
	 }
System.out.println("Digits are  " + i);
}
}
