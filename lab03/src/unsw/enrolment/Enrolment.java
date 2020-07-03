package unsw.enrolment;

public class Enrolment {

    private CourseOffering offering;
    private Grade grade;
    private Student student;

    public Enrolment(CourseOffering offering, Student student) {
        this.offering = offering;
        this.student = student;
    }
    public String getstudent() {
        return student.getZID();
    }
    public Course getCourse() {
        return offering.getCourse();
    }

    public String getTerm() {
        return offering.getTerm();
    }

    public String getgrade() {
        return grade.getgrade();
    }

    public void setgrade(Grade grade) {
        this.grade = grade;
    } 

    
}
