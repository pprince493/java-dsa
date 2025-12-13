package ArrayListTutorials;
import java.util.ArrayList;

public class classroom {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>(); 
		ArrayList<String> list2 = new ArrayList<>(); 
		ArrayList<Boolean> list3 = new ArrayList<>(); 
		
		//add operation
		list.add(1); //O(1)
		list.add(2);
		list.add(3);
		list.add(4);
		
		//add element in specific index
		list.add(1,9);
		System.out.println(list);
		
		//get opertion
		
		int element = list.get(2);
		System.out.println(element);
		
		//remove element
		list.remove(2);
		System.out.println(list);
		
		//set element at index
		list.set(2, 10);
		System.out.println(list);
		
		//check contains element
		System.out.println(list.contains(1));
		System.out.println(list.contains(11));
		
		
	}
}
