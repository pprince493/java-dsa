package oops;

public class abstractClass {
	public static void main(String args[]) {
		Horse h = new Horse();
		h.walk();
		h.eat();
		System.out.println("color is = " + h.color);
		
		Chicken c = new Chicken();
		c.walk();
		c.eat();
		
		HorseType hy = new HorseType();
		
	}
}

abstract class Animal1{
	String color;
	Animal1(){
		color="brown";
		System.out.println("Animal class constructor called");
	}
	void eat() {
			System.out.println("animal eats");
	}
	abstract void walk();
}

class Horse extends Animal1{
	Horse(){
		System.out.println("Horse class constructor called");
	}
	void changeColor() {
		color = "dark brown";
	}
	void walk() {
		System.out.println("walks on 4 legs");
	}
}
class HorseType{
	HorseType(){
		System.out.print("HorseType class constructor called");
	}
}

class Chicken extends Animal1{
	void changeColor() {
		color = "yellow";
	}
	void walk() {
		System.out.println("walks on 2 legs");
	}
}