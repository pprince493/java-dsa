package ArraysTutorials;

public class SubArrays {
	public static void main(String args[]) {
		int arr[] = {2,4,6,8,10};
		
		subarrays(arr);
	}
	
	public static void subarrays(int number[]) {
		
		System.out.print("sub array is ");
		for(int i=0; i<number.length; i++) {
			System.out.print("("+number[i]+"),");
			for(int j=i+1 ; j<number.length; j++) {
				System.out.print("(");
				for(int k=i;k<=j;k++) {
					System.out.print(number[k]+",");
				}
				System.out.print("),");
			
			}
		
			}
		
	}

}
