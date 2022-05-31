import java.util.*;
import java.io.*;

public class PhonebookWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("전화번호 입력 프로그램입니다.");
        try {
            FileWriter fw = new FileWriter("c:\\Temp\\phone.txt");
            while (true) {
                System.out.print("이름 전화번호 >> ");
                String s = sc.nextLine();
                if (s.equals("그만")) {
                    break;
                }
                fw.write(s, 0, s.length());
                fw.write("\r\n");
            }
            System.out.println("phone.txt에 저장했습니다.");
            sc.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("파일 저장 오류");
        }
    }
}
