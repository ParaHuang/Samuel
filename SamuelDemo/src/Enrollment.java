/**
 * Represents a student's enrollment in a course and an optional grade.
 * This links a {@link Student} and a {@link Course} together.
 */
public class Enrollment {

    /** Enrolled student. */
    public Student student;

    /** Enrolled course. */
    public Course course;

    /** Grade for the course (nullable until assigned). */
    public String grade;

    /**
     * Creates a new enrollment for the given student and course.
     *
     * @param student student
     * @param course  course
     */
    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }
}
