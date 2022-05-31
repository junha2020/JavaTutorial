import java.util.*;

class StudentS {
    String major, number, score;

    public StudentS(String major, String number, String score) {
        this.major = major;
        this.number = number;
        this.score = score;
    }
    public String getMajor() {
        return major;
    }
    public String getNumber() {
        return number;
    }
    public String getScore() {
        return score;
    }
}

public class Student2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, StudentS> h = new HashMap<>();
        System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요");
        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s, ",");
            String name = st.nextToken().trim();
            String major = st.nextToken().trim();
            String number = st.nextToken().trim();
            String score = st.nextToken().trim();
            h.put(name, new StudentS(major, number, score));
        }

        Set<String> keys = h.keySet();
        Iterator<String> it = keys.iterator();
        String[] names = new String[4];
        int k = 0;

        while(it.hasNext()) {
            System.out.println("-------------------------");
            String name = it.next();
            String major = h.get(name).getMajor();
            String number = h.get(name).getNumber();
            String score = h.get(name).getScore();
            System.out.println("이름:" + name);
            System.out.println("학과:" + major);
            System.out.println("학번:" + number);
            System.out.println("학점평균:" + score);
            names[k] = name;
            k++;
        }
        System.out.println("-------------------------");

        while (true) {
            System.out.print("학생 이름 >> ");
            String name = sc.nextLine();
            if (name.equals("그만")) {
                break;
            }
            for (int i = 0; i < 4; i++) {
                if (name.equals(names[i])) {
                    System.out.println(name + ", " + h.get(name).getMajor() + ", " + h.get(name).getNumber() + ", " + h.get(name).getScore());
                }
            }
        }
    }
}
