package unsw.enrolment.test;

import unsw.enrolment.*;
import java.time.DayOfWeek;
import java.time.LocalTime;


public class EnrolmentTest {

    public static void main(String[] args) {
        // Create courses
        Course comp1511 = new Course("COMP1511", "Programming Fundamentals",6);
        Course comp1531 = new Course("COMP1531", "Software Engineering Fundamentals",6);
        comp1531.addPrereq(comp1511);
        Course comp2521 = new Course("COMP2521", "Data Structures and Algorithms",6);
        comp2521.addPrereq(comp1511);
        
        EnrolSystem enrolSystem = new EnrolSystem();
        enrolSystem.addcourses(comp2521);
        enrolSystem.addcourses(comp1511);
        enrolSystem.addcourses(comp1531);

        CourseOffering comp1511Offering = new CourseOffering(comp1511, "19T1");
        CourseOffering comp1531Offering = new CourseOffering(comp1531, "19T1");
        CourseOffering comp2521Offering = new CourseOffering(comp2521, "19T2");
        
        //create sessions
        Session comp1511lab = new Lab("CSE LAB01", DayOfWeek.MONDAY, LocalTime.of(10,00), LocalTime.of(13, 00), "Andrew", "Macro");
        Session comp1511tut = new Tutorial("Main library", DayOfWeek.TUESDAY, LocalTime.of(16, 30), LocalTime.of(18, 30), "Andrew");
        comp1511Offering.addSession(comp1511lab);
        comp1511Offering.addSession(comp1511tut);
        Session comp1531lab = new Lab("CSE Lab02", DayOfWeek.THURSDAY, LocalTime.of(14, 00), LocalTime.of(16, 00), "A", "B");
        Session comp1531tut = new Tutorial("CSE K17", DayOfWeek.THURSDAY, LocalTime.of(13, 00), LocalTime.of(14, 00), "Jay");
        comp1531Offering.addSession(comp1531lab);
        comp1531Offering.addSession(comp1531tut);
        Session comp2521lec = new Lecture("Law library", DayOfWeek.WEDNESDAY, LocalTime.of(12, 00), LocalTime.of(14, 00), "Andrew");
        Session comp2521lab = new Lab("K17 304", DayOfWeek.THURSDAY, LocalTime.of(9, 00), LocalTime.of(12, 00), "A", "B");
        comp2521Offering.addSession(comp2521lab);
        comp2521Offering.addSession(comp2521lec);
       
        // create a new student
        Student Jason = new Student("z5173405");
        enrolSystem.addstudent(Jason);
        
        // check the pre_requisites can enrol comp1511
        enrolSystem.checkprereqs(Jason, comp1511);
        // create new enrol for Jason
        Enrolment Jason1511 = new Enrolment(comp1511Offering, Jason);
        enrolSystem.addenrolments(Jason1511);
        //display Jason enrolment
        enrolSystem.getEnrolments(Jason);
        // check the pre-requisites cannot enrol comp1531
        enrolSystem.checkprereqs(Jason, comp1531);
        // set grade for Jason and add comp1511 to passedcourse for Jason
        enrolSystem.setgrade(Jason, comp1511, 85,"HD");
        //display Jason Passed course
        enrolSystem.getpassedCourse(Jason);
        // check the pre-requisites comp2521 can enrol that course
        enrolSystem.checkprereqs(Jason, comp2521);
        // create new enrol for Jason
        Enrolment Jason2521 = new Enrolment(comp2521Offering, Jason);
        enrolSystem.addenrolments(Jason2521);
        enrolSystem.getEnrolments(Jason);
        enrolSystem.setgrade(Jason, comp2521, 85,"HD");
        // display all passed courses for Jason
        enrolSystem.getpassedCourse(Jason);
    }
}
