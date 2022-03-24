import java.util.Scanner;

public class game369 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하시오>>");
        int a = sc.nextInt();
        if (a % 3 == 0 && (a / 30 == 1 || a / 30 == 2 || a / 30 == 3)) {
            System.out.println("박수짝짝");
        }
        else if (a % 3 == 0 || (a / 30 == 1 || a / 30 == 2 || a / 30 == 3)) {
            System.out.println("박수짝");
        }
    }
}
