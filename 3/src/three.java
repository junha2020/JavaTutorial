import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("양의 정수 10개를 입력하시오>>");
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        System.out.print("3의 배수는 " );
        for (int i = 0; i < 10; i++) {
            if (arr[i] % 3 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
