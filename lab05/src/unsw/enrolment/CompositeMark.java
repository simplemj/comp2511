package unsw.enrolment;

public interface CompositeMark {
    public int getMark();
    public String getAssName();
    public void addMark(CompositeMark mark);
    public void deleteMark(CompositeMark mark);
}