package interviewPrograms.Amit;

import java.util.Arrays;

public class ArrayEquality 
{
	public static void main(String args[])
	{
		int[][] arr1 = { { 20, 5 }, { -95, 43 }, { 17, 22 } };
		int[][] arr2 = { { 20, 5 }, { -95, 43 }, { 17, 22 } };

		System.out.println(Arrays.deepEquals(arr1, arr2));
		          //OR
		
		if(Arrays.deepEquals(arr1, arr2))
		{
			System.out.println("Both the arrays are equal");
		}
		else
		{
			System.out.println("Are not equal");
		}
	}
}
