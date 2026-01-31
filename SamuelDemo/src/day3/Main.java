package day3;

public class Main {

	public static void main(String[] args) {
		//write any code we want to run at here
		//initialization
		//ClassName reference = new ClassName();
		Student stu1 = new Student();	//image: an real student object just created
		//assign value to the field of this object
		//reference.filed = value;
		stu1.id = 1001;
		stu1.name = "Jack";
		stu1.age = -23;
		stu1.gender = "male";
		//reference.method();
		stu1.study();
		stu1.selfIntroduce();
		
		System.out.println();
		
		Student stu2 = new Student();
		stu2.id = 1002;
		stu2.name = "Lily";
		stu2.age = 2200;
		stu2.gender = "female";
		stu2.study();
		stu2.selfIntroduce();
		
		
//		System.out.println();
	}

}
