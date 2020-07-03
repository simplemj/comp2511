package unsw.enrolment;

import java.util.ArrayList;

public class EnrolSystem {
    private ArrayList<Student> students; 
    private ArrayList<Course> courses;
    private ArrayList<Enrolment> enrolments;
    
    public EnrolSystem() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
        enrolments = new ArrayList<>(); 
    }

    public void addstudent(Student student) {
        students.add(student);
    }

    public void addcourses(Course course) {
        courses.add(course);
    }

    public void addenrolments(Enrolment enrol) {
        enrolments.add(enrol);
    }
    
    public void getEnrolments(Student s) {
		System.out.println(s.getZID()+" enrolment list: ");
		for(Enrolment enrolment : enrolments) {
            if(enrolment.getstudent() == s.getZID()) {
                System.out.println("Course: " + enrolment.getCourse().getCourseCode()+" "+ enrolment.getTerm());
            }
		}
    }
    
    public void getpassedCourse(Student s) {
		System.out.println(s.getZID()+" Passed Courses: ");
		for (Course c : s.getpassedCourse()) {	
			System.out.println(c.getCourseCode());
		}
	}

    public void checkprereqs(Student student,Course course) {
        if(!course.getprereqs().isEmpty() && student.getpassedCourse().isEmpty()) {
            System.out.println("Sorry,That course is not available for you!");
            System.out.print("That course need prerequst courses:");
            for(Course print: course.getprereqs()) {
                System.out.print(" "+print.getCourseCode()+" "+print.gettitle()+" ");
            }
            System.out.print("\n");
        }
        else if(!course.getprereqs().isEmpty() && !student.getpassedCourse().isEmpty()) {
            for(Course pre: course.getprereqs()) {
                for(Course passed: student.getpassedCourse()) {
                    if(pre != passed) {
                        System.out.println("Sorry,That course is not available for you!");
                        System.out.print("That course need prerequst courses:");
                        System.out.println(" "+pre.getCourseCode()+" "+pre.gettitle()+" ");
                    }
                    else System.out.println("You can enrol that course");
                }
            }
        }
        else if(course.getprereqs().isEmpty()) {
            System.out.println("You can enrol that course");
        }

    }

    public void setgrade(Student s,Course c,int mark,String grade) {
        Grade newGrade = new Grade(mark, grade);
        for(Enrolment enrol: enrolments) {
            if(enrol.getCourse() == c && enrol.getstudent() == s.getZID()) {
                enrol.setgrade(newGrade);
                if(mark >= 50) s.setPassedCourse(enrol.getCourse());
            }
        }
    }

    
    
}

    
    