
public class Sort {

	public static void main(String[]args) {
		
		int[]arr = new int[] {5,4,9,7,2,7};
		int temp = 0;
		System.out.println("Elements in ascending order");
		for (int i= 0;i<arr.length;i++) {
		for (int j=i+1;j<arr.length;j++) {
			
			if (arr[i]>arr[j]) {
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		}
				
		 System.out.println("Elements of array sorted in ascending order: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " "); 
		
		
	}
	
}
}
