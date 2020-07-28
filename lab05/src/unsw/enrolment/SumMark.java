package unsw.enrolment;

import java.util.ArrayList;

public class SumMark implements CompositeMark {
    private String name;
    private ArrayList<CompositeMark> AssMark;

    public SumMark(String name) {
        this.name = name;
        AssMark = new ArrayList<CompositeMark>();
    }

    @Override
    public void addMark(CompositeMark mark) {
        // DONE Auto-generated method stub
        AssMark.add(mark);
    }

    @Override
    public void deleteMark(CompositeMark mark) {
        // DONE Auto-generated method stub
        AssMark.remove(mark);
    }

    @Override
    public String getAssName() {
        // DONE Auto-generated method stub
        return name;
    }

    @Override
    public int getMark() {
        // DONE Auto-generated method stub
        int sum = 0;
        for(CompositeMark mark: AssMark) {
            sum = sum + mark.getMark();
        }

        return sum;
    }

    
}