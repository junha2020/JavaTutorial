package s7;
import java.util.*;

public class StringTokenizerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(">>");
            String s = sc.nextLine();
            if (s.equals("그만")) {
                break;
            }
            StringTokenizer st = new StringTokenizer(s, " ");
            System.out.println("어절 개수는 " + st.countTokens());
        }
        System.out.println("종료합니다...");
    }
}
