import java.util.Scanner;

public class rsp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = {"가위", "바위", "보"};
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        while (true) {
            System.out.print("가위 바위 보!>>");
            String you = sc.next();
            int n = (int)(Math.random()*3);
            if (str[n].equals(you)) {
                System.out.println("사용자 = " + you + " , 컴퓨터 = " + str[n] + ", 비겼습니다.");
            }
            else if (you.equals("가위")) {
                if (n == 1) {
                    System.out.println("사용자 = " + you + " , 컴퓨터 = " + str[n] + ", 사용자가 졌습니다.");
                }
                else if (n == 2) {
                    System.out.println("사용자 = " + you + " , 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
                }
            }
            else if (you.equals("바위")) {
                if (n == 0) {
                    System.out.println("사용자 = " + you + " , 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
                }
                else if (n == 2) {
                    System.out.println("사용자 = " + you + " , 컴퓨터 = " + str[n] + ", 사용자가 졌습니다.");
                }
            }
            else if (you.equals("보")) {
                if (n == 0) {
                    System.out.println("사용자 = " + you + " , 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
                }
                else if (n == 1) {
                    System.out.println("사용자 = " + you + " , 컴퓨터 = " + str[n] + ", 사용자가 졌습니다.");
                }
            }
            else if (you.equals("그만")) {
                System.out.println("게임을 종료합니다...");
                break;
            }
            else {
                System.out.println("다시 입력하십시오.");
            }
        }
    }
}
