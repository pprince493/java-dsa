package ArrayListTutorials;

import java.util.ArrayList;

public class PrintAllValueInArrayList {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		
		//add operation
		list.add(1); //O(1)
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println("Size of ArrayList "+ list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+",");
		}
		
	}
}
