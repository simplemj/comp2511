package staff.test;

import java.time.LocalDate;
import staff.Lecturer;
import staff.StaffMember;

public class StaffTest{
    public void printStaffDetails(StaffMember staff) {
		System.out.println(staff.toString());
    }
    
    public static void main(String[] args){
        LocalDate d1 = LocalDate.of(2019,03,04);
		LocalDate d2 = LocalDate.of(2020,06,11);
		StaffMember s1 = new StaffMember("ABC", 10000, d1, d2);
		StaffMember s2 = new StaffMember("Jason", 3000, d1, d2);
		StaffMember s3 = new StaffMember("Jason", 3000, d1, d2);
		Lecturer l1 = new Lecturer("Jason", 10000, d1, d2, "CSE", 'B');
		Lecturer l2 = new Lecturer("Andy", 10000, d1, d2, "CSE", 'B');
		
		StaffTest test = new StaffTest();
		System.out.println("===========Staff information==========");
		test.printStaffDetails(s1);
		test.printStaffDetails(s2);
		test.printStaffDetails(l1);
		test.printStaffDetails(l2);

		System.out.println("===========Equals Method=============");
		System.out.println("===========test case 1===============");
		if (s2.equals(s3)) System.out.println("s2 is equals to s3");
		else System.out.println("s2 is NOT equals to s3");
		System.out.println("===========test case 2===============");
		if (s1.equals(s2)) System.out.println("s1 is equals to s2");
		else System.out.println("s1 is NOT equals to s2");
		System.out.println("===========test case 3===============");
		if (s1.equals(l1)) System.out.println("s1 is equals to l1");
		else System.out.println("s1 is NOT equals to l1");
		System.out.println("===========test case 4===============");
		if (l1.equals(l2)) System.out.println("l1 is equals to l2");
		else System.out.println("l1 is NOT equals to l2");
		System.out.println("===========test case 5===============");
		if (l1.equals(l1)) System.out.println("l1 is equals to l1");
		else System.out.println("l1 is NOT equals to l1");
		System.out.println("===========test case 6===============");
		if (l1.equals(null)) System.out.println("l1 is equals to null");
		else System.out.println("l1 is NOT equals to null");
    }
}
