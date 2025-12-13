package ArrayListTutorials;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		
		//add operation
		list.add(1); //O(1)
		list.add(22);
		list.add(3);
		list.add(42);
		list.add(5);
		
		System.out.println("Before Sorting "+ list);
		Collections.sort(list);
		System.out.println("After Sorting in Assending Order "+ list);
		
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println("After Sorting in dessending Order "+ list);
		
		
		
		
	}
}
