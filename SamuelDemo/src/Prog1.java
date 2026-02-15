
public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School school = new School();
		
		//prepare lecture halls
		LectureHall hall1 = new LectureHall("ENGR 101");
		LectureHall hall2 = new LectureHall("ENGR 102");
		LectureHall hall3 = new LectureHall("ENGR 302");
		school.addHall(hall1);
		school.addHall(hall2);
		school.addHall(hall3);
				
		//prepare instructors
		Instructor in1 = new Instructor("Yang", "A101");
		Instructor in2 = new Instructor("Mr Hang", "A102");
		Instructor in3 = new Instructor("Li", "B203");
		school.hire(in1);
		school.hire(in2);
		school.hire(in3);
		
		//courses
		Course cou1 = new Course("Java", "Thuesday 9:00am"); 
		Course cou2 = new Course("HTML", "Thursday 4:00pm");
		Course cou3 = new Course("SQL", "Monday 3:00pm");
		school.addCourse(cou1);
		school.addCourse(cou2);
		school.addCourse(cou3);
		
		//students
		Student stu1 = new Student("Lucy", "1001");
		Student stu2 = new Student("Jack", "1002");
		Student stu3 = new Student("Linda", "1003");
		school.admit(stu1);
		school.admit(stu2);
		school.admit(stu3);
		
		//set hall for course
		school.setHall(cou1,hall1);
		school.setHall(cou2,hall2);
		school.setHall(cou3,hall2);
		
		//set instructor for course
		school.setInstr(cou1, in3);
		school.setInstr(cou2, in3);
		school.setInstr(cou3, in2);
		
		System.out.println(hall1.getScheduleText());
		System.out.println(in3.getScheduleText());
		
		
		
	}

}
