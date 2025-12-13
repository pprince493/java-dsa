package ArrayListTutorials;

import java.util.ArrayList;

public class PairSumInSortedArrayList {
	//2 Pointer approch
		public static void main(String args[]) {
			int target=6;
			ArrayList<Integer> height = new ArrayList<>();
			height.add(1);
			height.add(2);
			height.add(3);
			height.add(4);
			height.add(5);
			height.add(6);
			pairsum(height, target);
		}
		
		public static void pairsum(ArrayList<Integer> height, int target){
			int lp=0;
			int rp=height.size()-1;
			while(lp!=rp) {
				if(height.get(lp)+height.get(rp)==target) {
					System.out.println("Pair is "+lp +","+rp);
					return;
				}else if(height.get(lp)+height.get(rp)>target) {
					rp--;
				}else {
					lp++;
				}
			}
		}
}
