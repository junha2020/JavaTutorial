import java.util.*;

abstract class Shape {
    private Shape next;
    public Shape() { next = null; }
    public void setNext(Shape obj) { next = obj; }
    public Shape getNext() { return next; }
    public abstract void draw();
}

class Line extends Shape {
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape {
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Circle");
    }
}

class run {
    Vector<Shape> v = new Vector<>();
    public void insert(int num) {
        Shape s;
        switch(num) {
            case 1:
                s = new Line();
                v.add(s);
                break;
            case 2:
                s = new Rect();
                v.add(s);
                break;
            case 3:
                s = new Circle();
                v.add(s);
                break;
        }
    }
    public void delete(int num) {
        if (num < v.size()) {
            v.remove(num);
        }
        else {
            System.out.println("삭제할 수 없습니다.");
        }
    }
    public void show() {
        for (int i = 0; i < v.size(); i++) {
            v.get(i).draw();
        }
    }
}

public class GraphicEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("그래픽 에디터 beauty을 실행합니다.");
        run r = new run();
        int a;
        do {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            a = sc.nextInt();

            switch (a) {
                case 1:
                    System.out.print("Line(1), Rect(2), Circle(3)>>");
                    int b = sc.nextInt();
                    r.insert(b);
                    break;
                case 2:
                    System.out.print("삭제할 도형의 위치>>");
                    int c = sc.nextInt();
                    r.delete(c);
                    break;
                case 3:
                    r.show();
                    break;
                case 4:
                    System.out.println("beauty을 종료합니다.");
                    break;
            }
        }while(a != 4);
    }
}