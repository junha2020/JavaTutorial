import java.io.*;
import java.util.*;

public class FileComp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("전체 경로명이 아닌 파일 이름만 입ㅈ력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        System.out.println("첫번째 파일 이름을 입력하세요>>");
        String f1 = sc.nextLine();
        System.out.println("두번째 파일 이름을 입력하세요>>");
        String f2 = sc.nextLine();
        System.out.println(f1 + "와 " + f2 + "를 비교합니다.");

        try {
            FileInputStream fr1 = new FileInputStream(f1);
            FileInputStream fr2 = new FileInputStream(f2);
            byte[] buf1 = new byte[1024];
            byte[] buf2 = new byte[1024];

            while(true) {
                int l1 = fr1.read(buf1, 0, buf1.length);
                int l2 = fr1.read(buf2, 0, buf2.length);
                if (l1 != l2) {
                    System.out.println("파일이 다릅니다.");
                }
                if (l1 == -1) {
                    break;
                }
                for (int i = 0; i < l1; i++) {
                    if (buf1[i] != buf2[i]) {
                        System.out.println("파일이 다릅니다.");
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("파일이 없습니다.");
        }
    }
}
