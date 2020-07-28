package unsw.enrolment;

import java.util.ArrayList;

public class AverageMark implements CompositeMark {
    private String name;
    private ArrayList<CompositeMark> AssMark;

    public AverageMark(String name) {
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
    public int getMark() {
        // DONE Auto-generated method stub
        int average = 0;
        for (CompositeMark mark : AssMark) {
            average = average + mark.getMark();
        }
        average = average / AssMark.size();
        return average;
    }

    @Override
    public String getAssName() {
        // DONE Auto-generated method stub
        return name;
    }

    
}