package StringCode;

public class ConvertToUppercase {
	public static void main(String args[]) {
		String name = "hi, i am prince";
		StringBuilder sb = new StringBuilder("");
		sb.append(name.charAt(0));
		for(int i=1;i<name.length();i++) {
			if(name.charAt(i) == ' ' && i<name.length()-1) {
				sb.append(name.charAt(i));
				
			}else {
				sb.append(Character.toUpperCase(name.charAt(i)));
			}
		}
		System.out.print(sb);
	}
}
