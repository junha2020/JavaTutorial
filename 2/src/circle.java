import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원의 중심과 반지름 입력>>");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        System.out.print("점 입력>>");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (a > x-z && a < x+z) {
            if (b > y-z && b < y+z) {
                System.out.println("점 (" + a + "," + b + ")는 원 안에 있다.");
            }
        }
    }
}
