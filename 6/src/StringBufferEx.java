import java.util.*;

public class StringBufferEx {
    public static void main(String[] args) {
        System.out.print(">>");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while (true) {
            System.out.print("명령: ");
            String s2 = sc.next();
            if (s2.equals("그만")) {
                System.out.println("종료합니다");
                break;
            }
            String[] s3 = s2.split("!");
            if (s3[0].equals("") || s3[1].equals("")) {
                System.out.println("잘못된 명령입니다!");
            }
            else if (!s.contains(s3[0])) {
                System.out.println("찾을 수 없습니다!");
            }
            else {
                StringBuffer sb2 = new StringBuffer(s);
                int start = sb2.indexOf(s3[0]);
                sb2 = sb2.replace(start, start + s3[0].length(), s3[1]);
                s = sb2.toString();
                System.out.println(s);
            }
        }
    }
}
