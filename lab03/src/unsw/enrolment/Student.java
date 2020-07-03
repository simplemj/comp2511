package unsw.enrolment;
import java.util.ArrayList;

public class Student {

    private String zid;
    private ArrayList<Enrolment> enrolments;
    private ArrayList<Course> passedCourse;

	public Student(String zid) {
        this.zid = zid;
        this.enrolments = new ArrayList<Enrolment>();
        this.passedCourse = new ArrayList<>();
    }

	public String getZID() {
		return zid;
    }
    
    public ArrayList<Enrolment> getenrolments() {
        return enrolments;
    }
    
    public ArrayList<Course> getpassedCourse() {
        return passedCourse;
    }
    
    public void setenrolments(Enrolment enrolment) {
        this.enrolments.add(enrolment);
    }

    public void setPassedCourse(Course course) {
        this.passedCourse.add(course);    
    }
}
