class Shape3 {
    public Shape3 next;
    public Shape3() { next = null; };

    public void draw() {
        System.out.println("Shape");
    }
}

class Line extends Shape3 {
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape3 {
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape3 {
    public void draw() {
        System.out.println("Circle");
    }
}

public class MethodOverridingEx {
    static void paint(Shape3 p) {
        p.draw();
    }
    public static void main(String[] args) {
        Line line = new Line();

        paint(line);
        paint(new Shape3());
        paint(new Line());
        paint(new Rect());
        paint(new Circle());
    }
}
