import java.util.*;

interface Shape3 {
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw() {
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}

class Circlec implements Shape3 {
    private int rad;
    public void draw() {
        System.out.println("반지름이 " + rad + "인 원입니다.");
    }
    public double getArea() {
        return rad * rad * PI;
    }
    public Circlec(int rad) {
        this.rad = rad;
        draw();
    }
}
class Oval implements Shape3 {
    private int i, j;
    public void draw() {
        System.out.println(i + "x" + j + "에 내접하는 타원입니다.");
    }
    public double getArea() {
        return i * j * PI;
    }
    public Oval(int i, int j) {
        this.i = i;
        this.j = j;
        draw();
    }
}
class Rectc implements Shape3 {
    private int i, j;
    public void draw() {
        System.out.println(i + "x" + j + "크기의 사각형 입니다.");
    }
    public double getArea() {
        return i * j;
    }
    public Rectc(int i, int j) {
        this.i = i;
        this.j = j;
        draw();
    }
}

public class ShapeS {
    static public void main(String[] args) {
        Shape3 [] list = new Shape3[3];
        list[0] = new Circlec(10);
        list[1] = new Oval(20, 30);
        list[2] = new Rectc(10, 40);

        for (int i = 0; i < list.length; i++) {
            list[i].redraw();
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println("면적은 " + list[i].getArea());
        }
    }
}
