
 public class Largestelement {
	
	static int arr[]= {10,55,66,85};
	static int largest()
	{
		int i;
		int max = arr[0];
		for (i=1;i<arr.length;i++)
			if (arr[i]>max)
				max = arr[i];
		
		return max;
			
		
	}
     public static void main (String[]args)
     {
    	 System.out.println("Largest Number in array" + largest());
     }
	
}