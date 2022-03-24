import java.util.Scanner;

class Circle2 {
    private double x, y;
    private int radius;
    public Circle2(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void show() {
        System.out.println("(" + x + "," + y + ")" + radius);
    }
    public double area() {
        return Math.PI*radius*radius;
    }
    public void bigShow() {
        System.out.println("가장 면적이 큰 원은 (" + x + "," + y + ")" + radius);
    }
}
public class CircleManager2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle2 c [] = new Circle2[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("x, y, radius >>");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int radius = sc.nextInt();
            c[i] = new Circle2(x, y, radius);
        }
        if (c[0].area() < c[1].area()) {
            if (c[1].area() > c[2].area()) {
                c[1].bigShow();
            }
            else if (c[1].area() < c[2].area()) {
                c[2].bigShow();
            }
        }
        else if (c[0].area() > c[1].area()) {
            if (c[0].area() > c[2].area()) {
                c[0].bigShow();
            }
        }
    }
}
