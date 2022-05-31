import java.util.Scanner;

class Day {
    private String work;
    public void set(String work) { this.work = work; }
    public String get() { return work; }
    public void show() {
        if (work == null) System.out.println("없습니다.");
        else System.out.println(work + "입니다.");
    }
}

public class MonthSchedule {
    private Scanner sc;
    private Day[] days;
    MonthSchedule(int day) {
        this.days = new Day[day];
        for (int i = 0; i < days.length; i++) {
            days[i] = new Day();
        }
        sc = new Scanner(System.in);
    }
    private void input() {
        System.out.print("날짜(1~30)?");
        int d = sc.nextInt();
        if (d > days.length) {
            System.out.println("다시 입력하십시오.");
            return;
        }
        System.out.print("할일(빈칸없이입력)?");
        String w = sc.next();
        days[d-1].set(w);

    }
    private void view() {
        System.out.print("날짜(1~30)?");
        int d = sc.nextInt();
        System.out.println(d + "일에 할 일은 " + days[d-1].get() + "입니다.");
    }
    private void finish() {
        System.out.println("프로그램을 종료합니다.");
    }
    private void run() {
        System.out.println("이번달 스케쥴 관리 프로그램.");
        while (true) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    input();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    finish();
                    return;
            }
        }
    }
    public static void main(String[] args) {
        MonthSchedule april = new MonthSchedule(30);
        april.run();
    }
}
