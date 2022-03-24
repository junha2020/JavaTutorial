import java.util.Scanner;

public class tenone {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("2자리수 정수 입력(10~99)>>");
        int a = sc.nextInt();
        if (a/10 == a%10) {
            System.out.print("Yes! 10의 자리와 1의 자리가 같습니다.");
        }
    }
}
