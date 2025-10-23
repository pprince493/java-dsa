package patterns;

public class InvertedStarPattern {
	public static void main(String args[]) {
		int lenght = 5;
		for(int i=1;i<=lenght;i++) {
			for(int j=0;j<=lenght-i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
