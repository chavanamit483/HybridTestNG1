package interviewPrograms.Amit;

public class MaxMinArray 
{
  public static void main(String[] args) 
  {
	  int arr[]= {2,4,6,11,78,25,56,32,};
	  int max=arr[0];
	int min=arr[0];
	
	
	for(int i=0 ; i<arr.length;i++)
	{
	  if(arr[i]>max)
	  {
		 max=arr[i]; 
	  }
	  else if(arr[i]<min)
	  {
		  min =arr[i];
	  }
	}
	
	System.out.println("Maximum number from array is = "+ max);
	System.out.println("Minimum number from array is = "+ min);
	
  }
}
