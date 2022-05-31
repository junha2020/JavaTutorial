import java.util.*;

public class StringSpin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
        String s = sc.nextLine();
        String t, h;
        for (int i = 0; i < s.length(); i++) {
            t = s.substring(0, 1);
            h = s.substring(1);
            s = h + t;
            System.out.println(s);
        }
    }
}
