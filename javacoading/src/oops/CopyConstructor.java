package oops;

public class CopyConstructor {
	public static void main(String args[]) {
		Student s1 = new Student();
		s1.name = "prince";
		s1.roll = 10;
		Student s2 = new Student(s1);
		}

}
class Student{
	String name;
	int roll;
	
	Student(Student s1){
		this.name=s1.name;
		this.roll=s1.roll;
		System.out.println("name "+s1.name + " roll number is " + s1.roll );
	}
	
	Student(){
		System.out.println("Constructor is called");
	}
}
