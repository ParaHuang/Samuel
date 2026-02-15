import java.util.ArrayList;
import java.util.List;

/**
 * Represents a student with a name and ID who can enroll in courses,
 * view schedules, and view a report card.
 */
public class Student {

    /** Student name. */
    public String name;

    /** Student ID. */
    public String id;

    /** Enrollments for this student. */
    public List<Enrollment> enrollments = new ArrayList<>();

    /**
     * Creates a student.
     *
     * @param name name
     * @param id   student ID
     */
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    /**
     * Enrolls the student in a course.
     *
     * @param course course
     * @return true if added; false if already enrolled
     */
    public boolean enrollInCourse(Course course) {
    	//to check if this student already took the course
        for (Enrollment enrollment : enrollments) 
        	if (enrollment.course == course)   
        		return false;	//can't take anymore

        //proves this student haven't took this course yet
        //create a new enrollment
        Enrollment enrollment = new Enrollment(this, course);
        enrollments.add(enrollment);		//add this new enrollment into the enrollments of this student
        course.enrollments.add(enrollment); //add this new enrollment into the enrollments of that class
        return true;
    }

    /**
     * Drops the student from a course.
     *
     * @param course course
     * @return true if removed; false if not enrolled
     */
    public boolean dropCourse(Course course) {
    	//check all the enrollments to see if the student have this course 
        for (int index = 0; index < enrollments.size(); index++) {
            Enrollment enrollment = enrollments.get(index);//get every enrollment of this student
            if (enrollment.course == course) {//if any enrollment has this class
                enrollments.remove(index);	//remove current enrollment from enrollments
                course.enrollments.remove(enrollment);//remove current enrollment from the enrollments of this course
                return true;		//remove successfully
            }
        }
        
        //this student never took this course, return false means remove failed
        return false;
    }

    /**
     * Produces a simple schedule string for the student.
     * Each course line includes: course name, time, hall, instructor.
     *
     * @return schedule text
     */
    public String getScheduleText() {
        StringBuilder b = new StringBuilder();
        b.append(name).append(' ').append(id).append('\n');

        for (Enrollment enrollment : enrollments) {
            Course course = enrollment.course;	//get the course from enrollment
            b.append(course.name).append(' ')
             .append(course.time).append(' ')
             .append(course.lectureHall == null ? "-" : course.lectureHall.location).append(' ')
             .append(course.instructor == null ? "-" : course.instructor.name)
             .append('\n');
        }
        return b.toString();
    }
    /*
     Jack 1001
     Java for beginners Thursday 3rd building 2rd floor 203 Miss Yang
     database Tuesday - -
     html Monday - Mr Sun
     
     
     */

    /**
     * Produces a simple report card string for the student.
     * Each course line includes: course name, grade (or "-" if ungraded).
     *
     * @return report card text
     */
    public String getReportCardText() {
        StringBuilder b = new StringBuilder();
        b.append(name).append(' ').append(id).append('\n');

        for (Enrollment enrollment : enrollments) {
            b.append(enrollment.course.name).append(' ')
             .append(enrollment.grade == null ? "-" : enrollment.grade)
             .append('\n');
        }
        return b.toString();
    }
    /*
    Jack 1001
    Java 98
    database 65
    html -
      
    */
}
