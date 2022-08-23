package interviewPrograms.Amit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ExtractOddEvenArray 
{
    public static void main(String[] args) 
    {
		int arr [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        List  Enumbers = new ArrayList();
        List Onumbers = new ArrayList();
        
		
		for(int ob : arr)
		{
			if (ob%2==0)
			{
				
				Enumbers.add(ob);
			}
			else if(ob%2==1)
			{
				Onumbers.add(ob);
			}
			
		}
		System.out.println("Even numbers are " + Enumbers);
		System.out.println("Odd numbers are " + Onumbers);
		
		Enumbers.removeAll(Enumbers);
		Onumbers.removeAll(Onumbers);
		System.out.println(Enumbers);
		System.out.println(Onumbers);
		
		
		for(int i=0 ; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				Enumbers.add(arr[i]);
			} else 
			{
				Onumbers.add(arr[i]);
			}
		} 
		
		System.out.println(Enumbers);
		System.out.println(Onumbers);
	}
}
