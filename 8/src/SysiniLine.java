import java.io.*;
import java.util.*;

public class SysiniLine {
    public static void main(String[] args) {
        try {
            Scanner fsc = new Scanner(new FileReader("c:\\windows\\system.ini"));
            int linecount = 1;
            while (fsc.hasNext()) {
                String line = fsc.nextLine();
                System.out.printf("%4d" + ": " + line, linecount);
                System.out.println();
                linecount++;
            }
            fsc.close();

        } catch (IOException e) {
            System.out.println("오류");
        }
    }
}