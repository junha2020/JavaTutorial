import java.io.*;

public class PhoneBookReader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("c:\\Temp\\phone.txt");
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            System.out.println("파일이 없습니다!");
        }
    }
}
