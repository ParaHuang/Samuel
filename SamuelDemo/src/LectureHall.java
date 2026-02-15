import java.util.ArrayList;
import java.util.List;

/**
 * Represents a lecture hall location that can be assigned to courses.
 */
public class LectureHall {

    /** Location string (for example, "ENGR 101"). */
    public String location;

    /** Courses scheduled in this lecture hall. */
    public List<Course> courses = new ArrayList<>();

    /**
     * Creates a lecture hall.
     *
     * @param location location
     */
    public LectureHall(String location) {
        this.location = location;
    }

    /**
     * Produces a simple schedule string for the lecture hall.
     * Each course line includes: course name, time, and instructor (or "-" if unset).
     *
     * @return schedule text
     */
    public String getScheduleText() {
        StringBuilder b = new StringBuilder();
        b.append(location).append('\n');

        for (Course course : courses) {
            b.append(course.name).append(' ')
             .append(course.time).append(' ')
             .append(course.instructor == null ? "-" : course.instructor.name)
             .append('\n');
        }
        return b.toString();
    }
}
