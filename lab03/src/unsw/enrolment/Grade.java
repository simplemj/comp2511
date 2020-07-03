package unsw.enrolment;

public class Grade {
    private int mark;
    private String grade;

    public Grade(int mark,String grade) {
        this.mark = mark;
        this.grade = grade;
    }
    public int getmark() {
        return mark;
    }

    public void setmark(int mark) {
        this.mark = mark;
    }

    public String getgrade() {
        return grade;
    }
    public void setgrade(String grade) {
        this.grade = grade;
    }
    
}
