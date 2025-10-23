package ArraysTutorials;

public class LinearSearchData {
	public static void main(String args[]) {
		int number[]= {1,2,55,33,10,22,33,43,16};
		int key = 110;
		System.out.println("index of key is "+LinearSearch(number,key));
	}
	
	public static int LinearSearch(int number[], int key) {
		for(int i=0;i<number.length;i++) {
			if(number[i] == key)
				return i;
		}
		return -1;
	}
}
