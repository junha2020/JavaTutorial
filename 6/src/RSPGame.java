import java.util.*;

public class RSPGame {
    public static void main(String[] args) {
        while (true) {
            System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
            Scanner sc = new Scanner(System.in);
            String[] RSP = {"가위", "바위", "보"};
            int pn = sc.nextInt();
            if (pn == 4) {
                break;
            }
            int cn = (int)(Math.random()*4+1);
            System.out.println("철수(" + RSP[pn-1] + ") : 컴퓨터(" + RSP[cn-1] + ")");
            if (pn == cn) {
                System.out.println("비겼습니다.");
            }
            else if (pn == 1) {
                if (cn == 2) {
                    System.out.println("컴퓨터가 이겼습니다.");
                }
                if (cn == 3) {
                    System.out.println("철수가 이겼습니다.");
                }
            }
            else if (pn == 2) {
                if (cn == 3) {
                    System.out.println("컴퓨터가 이겼습니다.");
                }
                if (cn == 1) {
                    System.out.println("철수가 이겼습니다.");
                }
            }
            else {
                if (cn == 1) {
                    System.out.println("컴퓨터가 이겼습니다.");
                }
                if (cn == 2) {
                    System.out.println("철수가 이겼습니다.");
                }
            }
        }
    }
}
