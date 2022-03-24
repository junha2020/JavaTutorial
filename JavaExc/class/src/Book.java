import java.util.Scanner;

class Seat {
    String seats[];
    public Seat() {
        seats = new String[10];
        for (int i = 0; i < 10; i++) {
            seats[i] = "---";
        }
    }
    public void show() {
        for (int i = 0; i < 10; i++) {
            System.out.print(seats[i] + " ");
        }
        System.out.println();
    }
    public void set(String name, int n) {
        seats[n-1] = name;
    }
    public boolean clean(String name) {
        for (int i = 0; i < 10; i++) {
            if (seats[i].equals(name)) {
                seats[i] = "---";
                return true;
            }
        }
        return false;
    }
}
class Sys {
    Scanner sc = new Scanner(System.in);
    Seat arr[];
    String SAB[] = {"S", "A", "B"};
    public Sys() {
        arr = new Seat[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = new Seat();
        }
    }
    public void reserve() {
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        int n = sc.nextInt();
        System.out.print(SAB[n-1] + ">> ");
        arr[n-1].show();
        System.out.print("이름>>");
        String name = sc.next();
        System.out.print("번호>>");
        int sn = sc.nextInt();
        arr[n-1].set(name, sn);
    }
    public void look() {
        for (int i = 0; i < 3; i++) {
            System.out.print(SAB[i] + ">>");
            arr[i].show();
        }
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }
    public void delete() {
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        int n = sc.nextInt();
        arr[n-1].show();
        System.out.print("이름>>");
        String name = sc.next();
        arr[n-1].clean(name);
    }
    public void run() {
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        while (true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            int n = sc.nextInt();
            switch (n) {
                case 1: {
                    reserve();
                    break;
                }
                case 2: {
                    look();
                    break;
                }
                case 3: {
                    delete();
                    break;
                }
                case 4:
                    return;
            }
        }
    }
}

public class Book {
    public static void main(String[] args) {
        Sys sy = new Sys();
        sy.run();
    }
}
