package day3;

//class: a definition/template of student object
public class Student {
	//information(object)	->	field/variable(class)
	//name,age,id,gender
	int id;
	String name;
	int age;
	String gender;
	

	//behavior(object)		->	method(class)
	public void study() {
		System.out.println("hey,"+name+" time to study");
	}
	
}


//abstraction:a process to define class from objects(collect the detail we care about )
//    object->class
//initialization: create object of a class
//	  class->object	