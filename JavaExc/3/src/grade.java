import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int score[] = {95, 88, 76, 62, 55};

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("과목 이름>>");
            String l = sc.next();
            if (l.equals("그만")) {
                break;
            }
            for (int i = 0; i < course.length; i++) {
                if (course[i].equals(l)) {
                    System.out.println(course[i] + "의 점수는 " + score[i]);
                    break;
                }
                if (i == 4) {
                    System.out.println("없는 과목입니다.");
                }
            }
        }
    }
}