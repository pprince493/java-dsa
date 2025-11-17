package oops;

public class MethodOverloading {
	public static void main(String args[]){
		Abc obj = new Abc();
		obj.add1(2, 4);
		obj.add2((float)1.5, (float)5.5);
	}
}
class Abc{
	void add1(int a , int b) {
		System.out.println("add1 = > "+ a + b);
	}
	void add2(float a, float b) {
		System.out.println("add2 = > "+ (a + b));
	}
}
