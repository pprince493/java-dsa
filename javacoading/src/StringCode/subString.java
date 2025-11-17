package StringCode;

public class subString {
	public static void main(String args[]) {
		String str = "HelloWorld";
		int si=2;
		int ei=5;
		subString(str, si, ei);
	}
	public static void subString(String str, int si, int ei) {
		String substr ="";
		for(int i=si;i<ei;i++) {
			substr += str.charAt(i);
		}
		System.out.println("SubString is = "+substr);
		System.out.println("SubString via function is = "+str.substring(2,5));
	}

}
