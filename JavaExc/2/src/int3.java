import java.util.Scanner;

public class int3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 3개 입력>>");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a > b && a < c) || (a > c && a < b)) {
            System.out.println("중간 값은 " + a);
        }
        if ((b > a && b < c) || (b > c && b < a)) {
            System.out.println("중간 값은 " + b);
        }
        if ((c > a && c < b) || (c > b && c < a)) {
            System.out.println("중간 값은 " + c);
        }
    }
}
