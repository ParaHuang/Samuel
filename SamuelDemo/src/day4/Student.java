package day4;

//class: a definition/template of student object
public class Student {
	//information(object)	->	field/variable(class)
	//name,age,id,gender
	private int id;
	private String name;
	private int age;
	private String gender;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		//check firstly:see if the parameter is in the correct range(3~80)
		if(age<3 || age>100) {
			throw new RuntimeException("the age is invalid");
		}
		
		this.age = age;
	}
	public void setGender(String gender) {
		if(!gender.equals("male") && !gender.equals("female")) {
			throw new RuntimeException("gender can only be male or female");
		}
		this.gender = gender;
	}
	
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	
	//behavior(object)		->	method(class)
	public void study() {
		System.out.println("hey,"+name+" time to study");
	}
	
	public void selfIntroduce() {
		System.out.println("introduct myself:");
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
	}
	
}


//abstraction:a process to define class from objects(collect the detail we care about )
//    object->class
//initialization: create object of a class
//	  class->object	