import java.util.ArrayList;
import java.util.List;

/**
 * Represents a course offering with a name, meeting time, optional instructor,
 * optional lecture hall, enrollments, and prerequisites.
 */
public class Course {

    /** Course name or code. */
    public String name;

    /** Meeting time or time slot string (for example, "MWF 10:00"). */
    public String time;

    /** Assigned lecture hall (nullable). */
    public LectureHall lectureHall;

    /** Assigned instructor (nullable). */
    public Instructor instructor;

    /** Enrollments for this course. */
    public List<Enrollment> enrollments = new ArrayList<>();

    /** Prerequisite courses. */
    public List<Course> prerequisites = new ArrayList<>();

    /**
     * Creates a course with a name and meeting time.
     *
     * @param name course name or code
     * @param time meeting time string
     */
    public Course(String name, String time) {
        this.name = name;
        this.time = time;
    }

    /**
     * Adds a prerequisite course if it is not already listed.
     *
     * @param course prerequisite course
     * @return true if added; false if already present or null
     */
    public boolean addPrerequisite(Course course) {
        if (course == null) return false;
        //this course already exists in prerequisites
        if (prerequisites.contains(course)) return false;//return false means you didn't add it
        
        //this course is new, so add it into prerequisites,
        return prerequisites.add(course);//the result of this code is true, so you return true at here
    }

    /**
     * Removes a prerequisite course.
     *
     * @param course prerequisite course
     * @return true if removed; false if not present or null
     */
    public boolean removePrerequisite(Course course) {
        if (course == null) return false;
        //remove directly, for remove method, when you remove an object, if this object exists,you will remove successfully and the result is true,
        //otherwise nothing removed, and the result is false
        return prerequisites.remove(course);
    }

    /**
     * Returns prerequisites formatted for the course catalog.
     *
     * @return "-" if there are no prerequisites; otherwise a comma-separated list
     *         of prerequisite course names
     */
    public String getPrerequisiteSummary() {
        if (prerequisites.isEmpty()) return "-";
        StringBuilder b = new StringBuilder();
        for (int index = 0; index < prerequisites.size(); index++) {
            if (index > 0) b.append(",");
            b.append(prerequisites.get(index).name);
        }
        return b.toString();
    }
}
