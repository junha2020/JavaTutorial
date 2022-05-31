import java.util.*;
class People {
    Scanner sc = new Scanner(System.in);
    String name;
    int[] num3 = new int[3];
    People (String name) {
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

public class Gambling2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("갬블링 게임에 참여할 선수 숫자>>");
        int num = sc.nextInt();
        People[] p = new People[num];
        for (int i = 0; i < num; i++) {
            System.out.print((i+1) + "번째 선수 이름>>");
            p[i] = new People(sc.next());
        }
        int a = 1;
        while (a == 1) {
            for (int i = 0; i < num; i++) {
                p[i].play();
                if (p[i].end()) {
                    System.out.println(p[i].name + "님이 이겼습니다!");
                    a = 0;
                    break;
                } else {
                    System.out.println("아쉽군요!");
                }
            }
        }
    }
}
