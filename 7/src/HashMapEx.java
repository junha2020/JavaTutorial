import java.util.*;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> nations = new HashMap<>();
        System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("나라 이름, 인구 >> ");
            String n = sc.next();
            if (n.equals("그만")) {
                break;
            }
            int p = sc.nextInt();
            nations.put(n, p);
        }
        while (true) {
            System.out.print("인구 검색 >> ");
            String n = sc.next();
            if (n.equals("그만")) {
                break;
            }
            if (nations.get(n) == null) {
                System.out.println(n + " 나라는 없습니다.");
            }
            else {
                System.out.println(n + "의 인구는 " + nations.get(n));
            }
        }
    }
}
