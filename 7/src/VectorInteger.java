import java.util.*;

public class VectorInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        System.out.print("정수(-1이 입력될 때 까지)>> ");
        while (true) {
            int k = sc.nextInt();
            if (k == -1) {
               break;
            }
            else {
                v.add(k);
            }
        }
        int a, b, big = 0;
        for (int i = 0; i < v.size(); i++) {
            for (int j = 1; j < v.size(); j++) {
                a = v.get(i);
                b = v.get(j);
                if (a < b) {
                    big = b;
                }
            }
        }
        System.out.println("가장 큰 수는 " + big);
    }
}
