import java.util.Scanner;

public class way42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연산>>");
        int a = sc.nextInt();
        String b = sc.next();
        int c = sc.nextInt();
        int d;

        switch (b) {
            case "+" -> {
                d = a + c;
                System.out.println(a + b + c + "의 계산 결과는 " + d);
            }
            case "-" -> {
                d = a - c;
                System.out.println(a + b + c + "의 계산 결과는 " + d);
            }
            case "*" -> {
                d = a * c;
                System.out.println(a + b + c + "의 계산 결과는 " + d);
            }
            case "/" -> {
                d = a / c;
                System.out.println(a + b + c + "의 계산 결과는 " + d);
            }
        }
    }
}
