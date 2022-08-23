package interviewPrograms.Amit;

public class ReverseString
{
	void reverse()
	{
	        String name = "gib maerd";
	        String revStr ="";
	       
	        
	        for(int i=name.length()-1; i>=0;i--)
	        {
	        	revStr = revStr + name.charAt(i);
	        }
	        System.out.println(revStr);
	        
	        
	}
	
	
	public static void main(String[] args) 
	{
	 	ReverseString obj = new ReverseString();
	 	obj.reverse();
	}
}
