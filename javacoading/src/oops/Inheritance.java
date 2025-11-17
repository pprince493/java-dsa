package oops;

public class Inheritance {
	public static void main(String args[]) {
		Fish obj = new Fish();
		obj.eat();
	}

}
// Base Class
class Animal{
	String color;
	void eat() {
		System.out.println("eats");
	}
	void breathe() {
		System.out.println("breathe");
	}
}

//Drive class or sub class
class Fish extends Animal{
	int fins;
	
	void swim() {
		System.out.println("swims in water");
	}
}