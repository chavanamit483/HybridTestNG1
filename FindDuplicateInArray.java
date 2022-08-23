package interviewPrograms.Amit;

public class FindDuplicateInArray 
{
  public static void main(String[] args) 
  {
	int arr [] = {1,2,3,5,6,7,6,4,2,9,10};
	
	int dupl=0;
	
	for (int i=0; i<arr.length ; i++)
	{
		for (int j=i+1; j<arr.length ; j++)
		{
			if(arr[i]==arr[j])
			{
				dupl =arr[j];
			}
		}
	}
	System.out.println(dupl);
			
  }
}
