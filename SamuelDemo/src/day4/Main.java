package day4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter your id,name,age,gender:");
		int id = scanner.nextInt();
		String name = scanner.next();
		int age = scanner.nextInt();
		String gender = scanner.next();
				
		
		
		Student stu1 = new Student();
		
		stu1.setId(id);
		stu1.setName(name);
		stu1.setAge(age);
		stu1.setGender(gender);		//"male" ✅     gender is "male",❌
		
		
		stu1.study();
		stu1.selfIntroduce();
		
		System.out.println("the id of first student is:"+stu1.getId());
		
		
//		System.out.println();
//		
//		Student stu2 = new Student();
//		
//		stu2.setId(1002);
//		stu2.setName("Lucy");
//		stu2.setAge(22);
//		stu2.setGender("female");
//		
//		stu2.study();
//		stu2.selfIntroduce();
		
	}

}
