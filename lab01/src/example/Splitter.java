package example;
import java.util.Scanner;

public class Splitter {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a sentence specified by spaces only: ");
        String []message = s.nextLine().split(" ");
        for(int i = 0;i < message.length;i++) {
            System.out.println(message[i]);
        }
        s.close();
    }
}
