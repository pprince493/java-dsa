package oops;

public class MethodOverriding {
	public static void main(String args[]) {
		Deer obj = new Deer();
		obj.eat();
		obj.add1(2, 4);
		obj.add2((float)1.5, (float)5.5);
	}
}

class Animalll {
	void eat() {
		System.out.println("eats anything");
	}
	void add1(int a , int b) {
		System.out.println("add1 = > "+ a + b);
	}
}

class Deer extends Animalll {
	void eat() {
		System.out.println("eats grass");
	}
	void add2(float a, float b) {
		System.out.println("add2 = > "+ (a + b));
	}
}