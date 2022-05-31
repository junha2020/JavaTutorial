import java.util.Scanner;

public class season2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("달을 입력하세요(1~12)>>");
        int a = sc.nextInt();
        switch (a) {
            case 12, 1, 2:
                System.out.println("겨울");
            case 3, 4, 5:
                System.out.println("봄");
            case 6, 7, 8:
                System.out.println("여름");
            case 9, 10, 11:
                System.out.println("가을");
        }

    }
}
