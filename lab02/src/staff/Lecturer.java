package staff;

import java.time.LocalDate;

public class Lecturer extends StaffMember{
    // attribute: school,academic status
    private String school;
    private char academicstatus;
   
    /** constructor for StaffMember object
	 * 
	 * @param name		the name of staffmember
	 * @param salary	the salary of staffmember
     * @param hire_date the hire date of staffmember
     * @param end_date the end date of staffmember
     * @param school  (e.g. CSE)
     * @para academic status A for an Associate Lecturer, B  for a Lecturer, and C for a Senior Lecturer
	 */
    public Lecturer(String name,double salary,LocalDate hire_date,LocalDate end_date,String school,char academicstatus){
        super(name,salary,hire_date,end_date);
        this.school = school;
        this.academicstatus = academicstatus;
    }
    /**
	 * @return the school of the Lecturer object
	 */
    public String getschool(){
        return school;
    }
    /**
     * @param school
	 * setter the school of the Lecturer object
	 */
    public void setschool(String school){
        this.school = school;
    }
    /**
	 * @return the academic status of the Lecturer object
	 */
    public char getacademicstatus(){
        return academicstatus;
    }
    /** 
     * @param academicstatus
	 * setter the academic status of the Lecturer object
	 */
    public void setacademicstatus(char academicstatus){
        this.academicstatus = academicstatus;
    }

	@Override
	public String toString() {
        return super.toString() + "Lecturer [academicstatus=" + getacademicstatus() + ", school=" + getschool() + "]";
	}

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Lecturer other = (Lecturer) obj;
        if (academicstatus != other.academicstatus)
            return false;
        if (school == null) {
            if (other.school != null)
                return false;
        } else if (!school.equals(other.school))
            return false;
        return true;
    }

    
    

}