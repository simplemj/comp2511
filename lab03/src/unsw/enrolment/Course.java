package unsw.enrolment;
import java.util.ArrayList;
import java.util.List;

/**
 * A course in the enrolment system.
 * @author Robert Clifton-Everest
 *
 */
public class Course {

    private String courseCode;
    private String title;
    private int uoc;
    private List<Course> prereqs;
    private List<CourseOffering> courseOfferings;


    public Course(String courseCode, String title,int uoc) {
        this.courseCode = courseCode;
        this.prereqs = new ArrayList<Course>();
        this.title = title;
        this.uoc = uoc;
        this.courseOfferings = new ArrayList<CourseOffering>();
    }


    public void addPrereq(Course course) {
        prereqs.add(course);
    }

    public void addOffering(CourseOffering offering) {
        courseOfferings.add(offering);
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getUOC() {
        return uoc;
    }

    public String gettitle() {
        return title;
    }

    public List<Course> getprereqs() {
        return prereqs;
    }

    public List<CourseOffering> getcourseOfferings() {
        return courseOfferings;
    }

}
