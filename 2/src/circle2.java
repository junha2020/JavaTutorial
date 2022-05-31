import java.util.Scanner;

public class circle2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double z1 = sc.nextDouble();
        System.out.print("두번째 원의 중심과 반지름 입력>>");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double z2 = sc.nextDouble();
        if (x1+z1 > x2-z2 && y1+z1 > y2-z2) {
            System.out.println("두 원은 서로 겹친다.");
        }
        else if (x1-z1 < x2-z2 && y1-z1 > y2-z2) {
            System.out.println("두 원은 서로 겹친다.");
        }
    }
}
