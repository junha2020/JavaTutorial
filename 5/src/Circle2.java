interface Shape2 {
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw() {
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}

class Circle3 implements Shape2 {
    private int rad;
    public void draw() {
        System.out.println("반지름이 " + rad + "인 원입니다.");
    }
    public double getArea() {
        return rad * rad * PI;
    }
    public Circle3(int rad) {
        this.rad = rad;
        draw();
    }
}

public class Circle2 {
    public static void main(String[] args) {
        Shape2 donut = new Circle3(10);
        donut.redraw();
        System.out.println("면적은 " + donut.getArea());
    }
}
