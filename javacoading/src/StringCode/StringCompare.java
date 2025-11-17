package StringCode;

public class StringCompare {
	public static void main(String args[]) {
		String s1 = "Tony";
		String s2 = "Tony";
		String s3 = new String("Tony");
		
		if(s1 == s2) {
			System.out.println("Strings s1 = s2");
		}else {
			System.out.println("Strings s1 != s2");
		}
		

		if(s1 == s3) {
			System.out.println("Strings s1 = s3");
		}else {
			System.out.println("Strings s1 != s3");
		}
		
		if(s1.equals(s3)) {
			System.out.println("Strings s1 equals s3");
		}else {
			System.out.println("Strings s1 not equals s3");
		}
	}

}
