package s7;
import java.util.*;

public class StringSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(">>");
            String s = sc.nextLine();
            if (s.equals("그만")) {
                break;
            }
            String[] sp = s.split(" ");
            System.out.println("어절 개수는 " + sp.length);
        }
        System.out.println("종료합니다...");
    }
}
