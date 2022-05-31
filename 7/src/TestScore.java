import java.util.*;

public class TestScore {
    public static void main(String[] args) {
        System.out.print("6개의 학점을 빈 칸으로 분립 입력(A/B/C/D/F)>>");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            String s = sc.next();
            a.add(s);
        }
        String s;
        double aa, sum = 0;
        for (int i = 0; i < 6; i++) {
            s = a.get(i);
            switch (s) {
                case "A":
                    aa = 4;
                    sum += aa;
                    break;
                case "B":
                    aa = 3;
                    sum += aa;
                    break;
                case "C":
                    aa = 2;
                    sum += aa;
                    break;
                case "D":
                    aa = 1;
                    sum += aa;
                    break;
                case "F":
                    aa = 0;
                    sum += aa;
                    break;
            }
        }
        System.out.println(sum/6);
    }
}
