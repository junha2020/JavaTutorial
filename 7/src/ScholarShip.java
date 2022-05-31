import java.util.*;

public class ScholarShip {
    public static void main(String[] args) {
        System.out.println("미래 장학금 관리 시스템입니다.");
        Scanner sc = new Scanner(System.in);
        HashMap<String, Double> h = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("이름과 학점>> ");
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            String name = st.nextToken().trim();
            double score = Double.parseDouble(st.nextToken().trim());
            h.put(name, score);
        }
        System.out.print("장학생 선발 학점 기준 입력>> ");
        double base = sc.nextDouble();

        Set<String> keys = h.keySet();
        Iterator<String> it = keys.iterator();
        int i = 0;
        String[] SStudnet = new String[5];

        while(it.hasNext()) {
            String name = it.next();
            double score = h.get(name);
            if (score >= base) {
                SStudnet[i] = name;
            }
            i++;
        }
        for (int w = 0; w < 5; w++) {
            if (SStudnet[w] == null) {
                System.out.print("");
            } else {
                System.out.print(SStudnet[w] + " ");
            }
        }
    }
}
