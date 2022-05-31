import java.util.Scanner;

public class wondoller {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원화를 입력하세요(단위 원)>>");
        int a = sc.nextInt();
        double b = a/1100;
        System.out.print(a + "원은 $" + b + "입니다.");
    }
}
