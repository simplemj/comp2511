package unsw.enrolment;

public class Mark implements CompositeMark {
    private String AssName;
    private int mark;
    private int max;

    public Mark(String name, int mark, int max) {
        this.AssName = name;
        this.mark = mark;
        this.max = max;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getMax() {
        return max;
    }

    @Override
    public void addMark(CompositeMark mark) {
        // DONE Auto-generated method stub

    }

    @Override
    public void deleteMark(CompositeMark mark) {
        // DONE Auto-generated method stub

    }

    @Override
    public int getMark() {
        // DONE Auto-generated method stub
        return mark;
    }

    @Override
    public String getAssName() {
        // DONE Auto-generated method stub
        return AssName;
    }

    

    
}