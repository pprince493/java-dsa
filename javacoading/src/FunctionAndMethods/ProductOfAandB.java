package FunctionAndMethods;

public class ProductOfAandB {
	public static void main(String arg[]) {
		int a = 3;
		int b = 5;
		ProductOfAandB obj = new ProductOfAandB();
		int product = obj.multiply(a,b);
		System.out.print("Sum of product is "+product );
	}
	 int multiply(int a , int b) {
		 int product = a*b;
		 return product;
	 }
}
