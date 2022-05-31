import java.util.*;
class Person {
    Scanner sc = new Scanner(System.in);
    String name;
    int[] num3 = new int[3];
    Person (String name) {
        this.name = name;
    }
    void play() {
        System.out.print("[" + name + "]:<Enter>");
        sc.nextLine();
        for (int i = 0; i < num3.length; i++) {
            int num = (int)((Math.random()) * 3 + 1);
            num3[i] = num;
        }
        System.out.print("          ");
        for (int i = 0; i < num3.length; i++) {
            System.out.print(num3[i] + "   ");
        }
    }
    boolean end() {
        if (num3[0] == num3[1] && num3[1] == num3[2]) {
            return true;
        }
        else {
            return false;
        }
    }
}

public class Gambling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1번째 선수 이름>>");
        Person p1 = new Person(sc.next());
        System.out.print("2번째 선수 이름>>");
        Person p2 = new Person(sc.next());
        while (true) {
            p1.play();
            if (p1.end()) {
                System.out.println(p1.name + "님이 이겼습니다!");
                break;
            }
            else {
                System.out.println("아쉽군요!");
                p2.play();
                if (p2.end()) {
                    System.out.println(p2.name + "님이 이겼습니다!");
                    break;
                }
                else {
                    System.out.println("아쉽군요!");
                }
            }
        }
    }
}
