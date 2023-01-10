
class Person{
	String name;
	String email;
	String Phone;
	
	void walk() {
		System.out.println(name + " is walking");
		
	}
	void eat() {
		System.out.println(email);
	}
	void sleep() {
		System.out.println(name + "is sleeping");
	}
}

public class Demo {
	public static void main(String[] args) {
		Person person1 = new Person();
		
		//define properties
		person1.name = "Joe";
		person1.email = "jow@yahoo";
		person1.Phone = "123231";
		
		//abstraction
		person1.walk();
		person1.sleep();
		person1.eat();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.sleep();
		
		/*
		// Person
		String name = "joe";
		String emmail = "j@yahoo";
		String phone ="11111";
		
		//Action/activity/behavior
		//System.out.println(name + "is walking");
		walking(name);
		System.out.println(name + "is eating");
		
		//What if we wanted to do this for another person?
		
		String name2 = "Sarah";
		String email2 = "jj@yahoo";
		String phone2 = "122222";
		
		//action,activity,behavior
		//System.out.println(name2 + "is walking");
		walking(name2);
		System.out.println(name2 + "is eating");
		
		//what about binding attributes and properties together
	}
// enhance by add function to minimize code
	static void walking(String name){
		System.out.println(name + "is walking");
		*/
	}
	
}
