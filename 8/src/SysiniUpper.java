import java.io.*;

public class SysiniUpper {
    public static void main(String[] args) {
        int c;
        try {
            FileReader fr = new FileReader("c:\\Windows\\system.ini");
            while ((c = fr.read()) != -1) {
                c = Character.toUpperCase(c);
                System.out.print((char)c);
            }
        } catch (IOException e) {
            System.out.println("오류");
        }
    }
}
