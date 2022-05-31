import java.util.*;

public class Point {
    public static void main(String[] args) {
        System.out.println("** 포인트 관리 프로그램입니다 **");
        HashMap<String, Integer> h = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("이름과 포인트 입력>> ");
            String s = sc.nextLine();
            if (s.equals("그만")) {
                break;
            }
            StringTokenizer st = new StringTokenizer(s, " ");
            String name = st.nextToken().trim();
            int score = Integer.parseInt(st.nextToken().trim());
            if (h.containsKey(name)) {
                int sco = h.get(name);
                sco += score;
                h.put(name, sco);
            }
            else {
                h.put(name, score);
            }
            Iterator<String> it = h.keySet().iterator();
            while(it.hasNext()) {
                String n = it.next();
                System.out.print("(" + n + "," + h.get(n) + ")");
            }
            System.out.println();
        }
    }
}
