import java.util.*;

abstract class Shape {
    private Shape next;
    public Shape() { next = null; }
    public void setNext(Shape obj) { next = obj; }
    public Shape getNext() { return next; }
    public abstract String draw();
}

class Line extends Shape {
    public String draw() {
        return "Line";
    }
}

class Rect extends Shape {
    public String draw() {
        return "Rect";
    }
}

class Circle extends Shape {
    public String draw() {
        return "Circle";
    }
}

class run {
    Shape head, tail;
    int count = 0;

    public void insert(int num) {
        Shape s = null;
        switch(num) {
            case 1:
                s = new Line();
                break;
            case 2:
                s = new Rect();
                break;
            case 3:
                s = new Circle();
                break;
        }
        if (head == null) {
            head = s;
            tail = s;
        }
        else {
            tail.setNext(s);
            tail = s;
        }
        count++;
    }
    public void delete(int num) {
        Shape temp = head;
        Shape x = null;

        for (int i = 0; i < num - 1; i++) {
            if (i == num-2) {
                x = temp;
            }
            temp = temp.getNext();
        }
        if (num == 1) {
            if (head == tail) {
                head = tail = null;
            }
            else {
                head = head.getNext();
            }
        }
        else if (temp == null) {
            System.out.println("삭제할 수 없습니다.");
        }
        else if (temp == tail) {
            tail = x;
            x.setNext(null);
        }
        else {
            x.setNext(temp.getNext());
        }
    }
    public void show() {
        Shape temp = head;
        if (temp == null) {
            System.out.println("출력할 도형이 없습니다.");
        }
        else {
            while(true) {
                System.out.print(temp.draw());
                if (temp == tail)
                    break;
                temp = temp.getNext();
                System.out.println();
            }
            System.out.println();
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
                    System.out.print("Line(1), Rect(2), Circle(3)>>");
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