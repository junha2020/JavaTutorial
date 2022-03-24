import java.util.Scanner;

public class coin {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하시오>>");
        int a = sc.nextInt();
        if (a / 50000 != 0) {
            System.out.println("오만원권 " + a / 50000 + "매");
        }
        a %= 50000;
        if (a / 10000 != 0) {
            System.out.println("만원권 " + a / 10000 + "매");
        }
        a %= 10000;
        if (a / 1000 != 0) {
            System.out.println("천원권 " + a / 1000 + "매");
        }
        a %= 1000;
        if (a / 100 != 0) {
            System.out.println("백원 " + a / 100 + "매");
        }
        a %= 100;
        if (a / 50 != 0) {
            System.out.println("오십원 " + a / 50 + "매");
        }
        a %= 50;
        if (a / 10 != 0) {
            System.out.println("십원 " + a / 10 + "매");
        }
        a %= 10;
        if (a != 0) {
            System.out.println("일원 " + a + "매");
        }
    }
}
