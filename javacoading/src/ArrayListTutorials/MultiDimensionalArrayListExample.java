package ArrayListTutorials;

import java.util.ArrayList;

public class MultiDimensionalArrayListExample {
	public static void main(String args[]) {
		ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
		ArrayList<Integer>list=new ArrayList<>();
		list.add(1);
		list.add(2);
		mainList.add(list);
		System.out.println(list);
		System.out.println(mainList);
		
		ArrayList<Integer>list2=new ArrayList<>();
		list2.add(11);
		list2.add(12);
		mainList.add(list2);
		System.out.println(mainList);
	}
}
