package StringCode;

public class StringCompression {
	public static void main(String args[]) {
		String str = "aabbccddefghhhhiiiijjj";
		
		compressString(str);
	}
	public static void compressString(String str) {
		String newstr="";
		
		for(int i=0;i<str.length();i++) {
			Integer count=1;
			while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
				count++;
				i++;
			}
			newstr += str.charAt(i);
			if(count>1) {
				newstr += count.toString();
			}
		}
		System.out.println("String is = "+ newstr);
	}
}
