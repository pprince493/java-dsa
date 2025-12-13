package ArrayListTutorials;

import java.util.ArrayList;

public class PairSumInRotatedArray {
	//2 Pointer approch
			public static void main(String args[]) {
				int target=16;
				ArrayList<Integer> height = new ArrayList<>();
				height.add(11);
				height.add(15);
				height.add(6);
				height.add(8);
				height.add(9);
				height.add(10);
				pairsum(height, target);
			}
			
			public static void pairsum(ArrayList<Integer>list,int target) {
				int bp=-1;
				for(int i=0; i<list.size();i++) {
					if(list.get(i)>list.get(i+1)) { //breaking point
						bp=i;
						break;
					}
				}
				int lp=bp+1;
				int rp=bp;
				
				while(lp !=rp) {
					//case 1
					if(list.get(lp)+list.get(rp)==target) {
						System.out.println("Position is "+lp+","+rp);
						break;
					}
					
					//case 2
					if(list.get(lp) + list.get(rp) < target) {
						lp=(lp+1)%list.size();
					}
					//case3
					//case 2
					if(list.get(lp) + list.get(rp) > target) {
						rp=(list.size() + rp-1)%list.size();
					}
						
				}
			}
}
