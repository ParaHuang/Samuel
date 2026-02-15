import java.util.ArrayList;
import java.util.List;

/**
 * Represents an instructor with a name and ID who can be assigned to courses
 * and issue grades for enrolled students.
 */
public class Instructor {

    /** Instructor name. */
    public String name;

    /** Instructor ID. */
    public String id;

    /** Courses this instructor is assigned to teach. */
    public List<Course> courses = new ArrayList<>();

    /**
     * Creates an instructor.
     *
     * @param name name
     * @param id   instructor ID
     */
    public Instructor(String name, String id) {
        this.name = name;
        this.id = id;
    }

    /**
     * Assigns a grade to a student for a specific course.
     *
     * @param student student
     * @param course  course
     * @param grade   grade string (for example, "A" or "B+")
     * @return true if the student is enrolled in the course; false otherwise
     */
    public boolean grade(Student student, Course course, String grade) {
    	//check all the enrollments of this course
        for (Enrollment enrollment : course.enrollments) {
        	//if the student of this enrollment is the one in parameter
            if (enrollment.student == student) {
            	//then score it
                enrollment.grade = grade;
                return true;		//give a grade successfully
            }
        }
        //this student didn't take this course
        return false;
    }
    //Miss Yang->Java (student: A B F U)
    //grade(F, Java, 89) 	-> true
    //grade(M, Java, 50) 	-> false

    /**
     * Produces a simple schedule string for the instructor.
     * Each course line includes: course name, time, and lecture hall (or "-" if unset).
     *
     * @return schedule text
     */
    public String getScheduleText() {
        StringBuilder b = new StringBuilder();
        b.append(name).append(' ').append(id).append('\n');

        for (Course course : courses) {
            b.append(course.name).append(' ')
             .append(course.time).append(' ')
             .append(course.lectureHall == null ? "-" : course.lectureHall.location)
             .append('\n');
        }
        return b.toString();
    }
}
