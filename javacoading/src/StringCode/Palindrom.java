package StringCode;

public class Palindrom {
	public static void main(String args[]) {
		String str="racecar";
		if(isPalindrom(str)) {
		System.out.print("string is palindrom");
		}else {
			System.out.print("string is not palindrom");
		}
	}
	public static boolean isPalindrom(String str) {
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
}
