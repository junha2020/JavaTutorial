import java.util.Scanner;

public class season {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("달을 입력하세요(1~12)>>");
        int a = sc.nextInt();
        if (a == 3 || a == 4 || a == 5) {
            System.out.println("봄");
        }
        else if (a == 6 || a == 7 || a == 8) {
            System.out.println("여름");
        }
        else if (a == 9 || a == 10 || a == 11) {
            System.out.println("가을");
        }
        else if (a == 12 || a == 1 || a == 2) {
            System.out.println("겨울");
        }
    }
}
