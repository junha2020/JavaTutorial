import java.util.*;

class Grun {
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> h = new HashMap<>();
    Iterator<String> it = h.keySet().iterator();

    public Grun() {
        h.put("그리스", "아테네");
        h.put("프랑스", "파리");
        h.put("스위스", "베른");
        h.put("영국", "런던");
        h.put("독일", "베를린");
        h.put("멕시코", "멕시코시티");
        h.put("미국", "워싱턴");
        h.put("일본", "도쿄");
        h.put("중국", "베이징");
    }

    public void run() {
        while (true) {
            System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    input();
                    break;
                case 2:
                    quiz();
                    break;
                case 3:
                    System.out.println("게임을 종료합니다.");
                    return;
            }
        }
    }
    public void input() {
        System.out.println("현재 " + h.size() + "개 나라와 수도가 입력되어 있습니다.");
        while (true) {
            System.out.print("나라와 수도 입력" + (h.size()+1) + ">> ");
            String nation = sc.next();
            if (nation.equals("그만")) {
                break;
            }
            String capital = sc.next();
            if (h.containsKey(nation)) {
                System.out.println(nation + "는 이미 있습니다!");
            }
            h.put(nation, capital);
        }
    }
    public void quiz() {
        while (true) {
            Random rd = new Random();
            int random = rd.nextInt(h.size());
            Set<String> keys = h.keySet();
            String[] arr = keys.toArray(new String[h.size()]);
            String nr = arr[random];
            System.out.print(nr + "의 수도는? ");
            String answer = sc.next();
            if (answer.equals("그만")) {
                break;
            }
            if (h.get(nr).equals(answer)) {
                System.out.println("정답!!");
            }
            else {
                System.out.println("아닙니다!!");
            }
        }
    }
}

public class CGame {
    public static void main(String[] args) {
        System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
        Grun r = new Grun();
        r.run();
    }
}
