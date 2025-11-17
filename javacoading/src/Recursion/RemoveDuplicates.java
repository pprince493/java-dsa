package Recursion;

public class RemoveDuplicates {
	public static void main(String args[]) {
		String str= "appnnacollege";
		removeduplicates(str,0, new StringBuilder(""), new boolean[26]);
	}
	
	public static void removeduplicates(String str, int idx, StringBuilder newStr, boolean map[] ) {
		if(idx == str.length()) {
			System.out.println(newStr);
			return;
		}
		
		char currentChar = str.charAt(idx);
		if(map[currentChar - 'a']==true) {
			removeduplicates(str, idx+1,newStr, map);
		}
		else {
			map[currentChar-'a']=true;
			removeduplicates(str,idx+1,newStr.append(currentChar),map);
		}
	}
}
