import java.util.ArrayList;
import java.util.List;

/**
 * Represents a school that owns courses, lecture halls, instructors, and students.
 * Provides helper methods to manage assignments and produce a catalog.
 */
public class School {

    /** All courses offered by the school. */
    public List<Course> courses = new ArrayList<>();

    /** All lecture halls managed by the school. */
    public List<LectureHall> lectureHalls = new ArrayList<>();

    /** All instructors employed by the school. */
    public List<Instructor> instructors = new ArrayList<>();

    /** All students enrolled at the school. */
    public List<Student> students = new ArrayList<>();

    /** Creates an empty school. */
    public School() {}

    /**
     * Creates and adds a course.
     *
     * @param name name
     * @param time times
     * @return the new course
     */
//    public Course addCourse(String name, String time) {
//        Course course = new Course(name, time);
//        courses.add(course);
//        return course;
//    }
    
    public Course addCourse(Course course) {
        courses.add(course);
        return course;
    }

    /**
     * Deletes a course, removing all enrollments and unassigning its hall/instructor.
     *
     * @param course course
     * @return true if removed from the school
     */
    public boolean delCourse(Course course) {
    	//cut off all the connections of this course
    	//course-student,whoever chose this course should drop it now
        while (!course.enrollments.isEmpty()) 	//when enrollments is not empty
        	course.enrollments.get(0).student.dropCourse(course);		//the student of this enrollment remove this enrollment
        //course-lectureHall
        if (course.lectureHall != null) course.lectureHall.courses.remove(course);
        //course-instructor
        if (course.instructor != null) course.instructor.courses.remove(course);

        //remove this course from school
        return courses.remove(course);
    }

    /**
     * Creates and adds a lecture hall.
     *
     * @param location location
     * @return the new lecture hall
     */
//    public LectureHall addHall(String location) {
//        LectureHall hall = new LectureHall(location);
//        lectureHalls.add(hall);
//        return hall;
//    }
    public LectureHall addHall(LectureHall hall) {
        lectureHalls.add(hall);
        return hall;
    }

    /**
     * Deletes a lecture hall and unassigns it from all courses.
     *
     * @param hall hall
     * @return true if removed from the school
     */
    public boolean delHall(LectureHall hall) {
    	//cut off the connections between this hall and all the courses use this hall
        while (!hall.courses.isEmpty()) {
            hall.courses.get(0).lectureHall = null;
            hall.courses.remove(0);
        }
        //remove this hall from school
        return lectureHalls.remove(hall);
    }

    /**
     * Hires an instructor.
     *
     * @param instructor instructor
     * @return true if added
     */
    public boolean hire(Instructor instructor) {
        return instructors.add(instructor);
    }

    /**
     * Fires an instructor and unassigns them from all courses.
     *
     * @param instructor instructor
     * @return true if removed
     */
    public boolean fire(Instructor instructor) {
    	//cut off the connections between this instructor and all the courses that is given by this instructor
        while (!instructor.courses.isEmpty()) {
            instructor.courses.get(0).instructor = null;
            instructor.courses.remove(0);
        }
        //remove this instructor from school
        return instructors.remove(instructor);
    }

    /**
     * Admits a student.
     *
     * @param student student
     * @return true if added
     */
    public boolean admit(Student student) {
        return students.add(student);
    }

    /**
     * Releases a student and drops all their enrollments.
     *
     * @param student student
     * @return true if removed
     */
    public boolean release(Student student) {
        while (!student.enrollments.isEmpty()) student.dropCourse(student.enrollments.get(0).course);
        return students.remove(student);
    }

    /**
     * Assigns a lecture hall to a course. Passing null clears the assignment.
     *
     * @param course course
     * @param hall   hall (nullable)
     */
    public void setHall(Course course, LectureHall hall) {
    	//if there is old connection between course and hall, remove it
        if (course.lectureHall != null) course.lectureHall.courses.remove(course);
        
        //build new connection
        //set the lectureHall of course as hall
        course.lectureHall = hall;
        //add this course into the coourses of this hall
        if (hall != null) hall.courses.add(course);
    }

    /**
     * Assigns an instructor to a course. Passing null clears the assignment.
     *
     * @param course     course
     * @param instructor instructor (nullable)
     */
    public void setInstr(Course course, Instructor instructor) {
        if (course.instructor != null) course.instructor.courses.remove(course);
        course.instructor = instructor;
        if (instructor != null) instructor.courses.add(course);
    }

    /**
     * Produces a pipe-delimited catalog.
     * Each line includes: name | prerequisites | time | hall | instructor.
     *
     * @return course catalog text
     */
    public String catalog() {
        StringBuilder b = new StringBuilder();

        for (Course course : courses) {
            b.append(course.name).append('|')
             .append(course.getPrerequisiteSummary()).append('|')
             .append(course.time).append('|')
             .append(course.lectureHall == null ? "-" : course.lectureHall.location).append('|')
             .append(course.instructor == null ? "-" : course.instructor.name)
             .append('\n');
        }
        return b.toString();
    }
}
