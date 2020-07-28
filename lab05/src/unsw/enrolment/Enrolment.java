package unsw.enrolment;

import java.util.ArrayList;
import java.util.List;

public class Enrolment {

    private CourseOffering offering;
    private Grade grade;
    private Student student;
    private List<Session> sessions;
    private List<CompositeMark> AssList;
    private Observer observer;

    public Enrolment(CourseOffering offering, Student student, Session... sessions) {
        this.offering = offering;
        this.student = student;
        this.grade = null; // Student has not completed course yet.
        this.AssList = new ArrayList<CompositeMark>();
        student.addEnrolment(this);
        offering.addEnrolment(this);
        this.sessions = new ArrayList<>();
        for (Session session : sessions) {
            this.sessions.add(session);
        }
    }
    public String getZid() {
        return student.getZID();
    }

    public Course getCourse() {
        return offering.getCourse();
    }

    public String getCourseCode() {
        return getCourse().getCourseCode();
    }

    public String getTerm() {
        return offering.getTerm();
    }

    public boolean hasPassed() {
        return grade != null && grade.isPassing();
    }

    public void addMark(Mark mark) {
        AssList.add(mark);
        setGrade();
        observer.setName(mark.getAssName());
        observer.setMark(mark.getMark());
        observer.update(this);
    }

    public int getMark() {
        int sum = 0;
        for(CompositeMark mark: AssList) {
            sum = sum + mark.getMark();
        }
        return sum;
    }

    public void deleteMark(String name) {
        for(CompositeMark mark: AssList) {
            if(mark.getAssName().equals(name)) 
                AssList.remove(mark);
        }
    }

    public void CalculateAverage(String assessment,String...submarks) {
        AverageMark average = new AverageMark(assessment);
        for(String name: submarks) {
            int i = 0;
            while(i < AssList.size()) {
                if(AssList.get(i).getAssName().equals(name)) {
                    average.addMark(AssList.get(i));
                    AssList.remove(i);
                    deleteMark(name);
                }
                i++;
            }
            
        }
        AssList.add(average);
        setGrade();
    }

    public void setGrade() {
        int mark = getMark()/AssList.size();
        grade = new Grade(mark);
    }

    public void CalculateSum(String assessment,String...submarks) {
        SumMark sum = new SumMark(assessment);
        for(String name: submarks) {
            int i = 0;
            while(i < AssList.size()) {
                if(AssList.get(i).getAssName().equals(name)) {
                    sum.addMark(AssList.get(i));
                    AssList.remove(i);
                    deleteMark(name);
                }
                i++;
            }
        }
        AssList.add(sum);
        observer.setName(assessment);
        observer.setMark(sum.getMark());
        observer.update(this);
        setGrade();
    }
    public void attach(Observer o) {
        this.observer = o;
    }


//    Whole course marks can no longer be assigned this way.
//    public void assignMark(int mark) {
//        grade = new Grade(mark);
//    }

}
