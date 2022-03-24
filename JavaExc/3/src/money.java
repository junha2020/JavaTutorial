import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하시오>>");
        int a = sc.nextInt();
        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        for (int i = 0; i < unit.length; i++) {
            int n = a / unit[i];
            if(n != 0) {
                System.out.println(unit[i] + "원 짜리 : " + n + "개");
            }
            a -= unit[i] * n;
        }
    }
}
