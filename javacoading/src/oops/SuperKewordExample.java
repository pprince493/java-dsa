package oops;

public class SuperKewordExample {
	public static void main(String args[]) {
		Horseee obj = new Horseee();
		System.out.println("animal color is " + obj.color);
	}
}

class Animal2 {
	String color;
	void Animal2() {	
		System.out.println("Animal Class called");
		}
}

class Horseee extends Animal2{
	Horseee(){
		super.color="red";
		System.out.println("Horse class called");
	}
}
