package staff;

import java.time.LocalDate;
import java.time.format.FormatStyle;
import java.time.format.DateTimeFormatter;

/**
 * A staff member
 * @author JIE MEI
 *
 */
public class StaffMember {
    // attribute: name, salary, hire_date, end_date
    protected String name;
    protected double salary;
    LocalDate hire_date;
    LocalDate end_date;

    /** 
     * <p> This is a StaffMember constructor 
     * <img src="https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pngwave.com%2Fpng-clip-art-trblb&psig=AOvVaw2HXOjGGUFIXr3gXU1ZC_RQ&ust=1591944818399000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCPjaqOKW-ekCFQAAAAAdAAAAABAO" alt= "A Staff">
     * </p>
	 * @param name		the name of staffmember
	 * @param salary	the salary of staffmember
     * @param hire_date the hire date of staffmember
     * @param end_date the end date of staffmember
	 */

    public StaffMember(String name,double salary,LocalDate hire_date,LocalDate end_date){
        this.name = name;
        this.salary = salary;
        this.hire_date = hire_date;
        this.end_date = end_date;
    }
    /** 
	 * @return the name of the Staff object
	 */
    public String getname(){
        return name;
    }
    /**
	 * @param name 
     * setter the name of the Staff object
	 */
    public void setname(String name){
        this.name = name;
    }
    /** 
	 * @return the salary of the Staff object
	 */
    public double getsalary(){
        return salary;
    }
    /**
     * @param salary
	 * setter the salary of the Staff object
	 */
    public void setsalary(double salary){
        this.salary = salary;
    }
    /**  
	 * @return the hire date of the Staff object
     * medium style like dd mm yy
	 */
    public String gethire_date(){
        return DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(hire_date);
    }
    /** 
     * @param hire_date
	 * setter the hire date of the Staff object
	 */
    public void sethire_date(LocalDate hire_date){
        this.hire_date = hire_date;
    }
    /** 
	 * @return the end date of the Staff object
     * medium style like dd mm yy
	 */
    public String getend_date(){
        return DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(end_date);
    }
    /**  
     * @param end_date
	 * setter the end date of the Staff object
	 */
    public void setend_date(LocalDate end_date){
        this.end_date = end_date;
    }

	@Override
	public String toString() {
		return "StaffMember [name=" + getname() + ", salary=" + getsalary() + ", hire_date=" + gethire_date() + ", end_date="
				+ getend_date() + "]";
	}

	@Override	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StaffMember other = (StaffMember) obj;
		if (end_date == null) {
			if (other.end_date != null)
				return false;
		} else if (!end_date.equals(other.end_date))
			return false;
		if (hire_date == null) {
			if (other.hire_date != null)
				return false;
		} else if (!hire_date.equals(other.hire_date))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

    
    
}
