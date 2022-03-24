import java.util.Scanner;

public class way4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연산>>");
        int a = sc.nextInt();
        String b = sc.next();
        int c = sc.nextInt();
        int d;

        if (b.equals("+")) {
            d = a + c;
            System.out.println(a + b + c + "의 계산 결과는 " + d);
        }
        else if (b.equals("-")) {
            d = a - c;
            System.out.println(a + b + c + "의 계산 결과는 " + d);
        }
        else if (b.equals("*")) {
            d = a * c;
            System.out.println(a + b + c + "의 계산 결과는 " + d);
        }
        else if (b.equals("/")) {
            d = a / c;
            System.out.println(a + b + c + "의 계산 결과는 " + d);
        }
    }
}
