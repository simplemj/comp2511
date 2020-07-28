package unsw.enrolment;

import java.time.LocalDate;
import java.time.LocalTime;
import java.io.*;

public class Observer {
    
    private String AssName;
    private int AssMark;

    public void setName(String name) {
        this.AssName = name;
    }

    public void setMark(int mark) {
        this.AssMark = mark;
    }

    public void update(Enrolment enrolment) {
        String header = enrolment.getCourseCode() + " " + enrolment.getTerm() + " " + enrolment.getZid() + "txt";
        File new_file = new File(header);
        String content = "AssName: " + AssName + "\t\t" + "Marks: " + AssMark + "\t\t" + "Date: " + LocalDate.now() + "\t\t" + "Time: " + LocalTime.now() + "\n";
        if (new_file.exists()) {
            WriteFile(new_file, content);
        } else {
            try {
                new_file.createNewFile();
                WriteFile(new_file, content);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void WriteFile(File file, String content) {
        try {
            FileOutputStream fs = new FileOutputStream(file, true);
            fs.write(content.getBytes());
            fs.flush();
            fs.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}