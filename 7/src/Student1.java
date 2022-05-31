import java.util.*;

class Student {
    private String name, major, number, score;
    public Student(String name, String major, String number, String score) {
        this.name = name;
        this.major = major;
        this.number = number;
        this.score = score;
    }
    public String getName() {
        return name;
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
    public String find() {
        return name + ", " + major + ", " + number + ", " + score;
    }
}

public class Student1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> a = new ArrayList<>();
        System.out.println("학생이름.");
        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s, ",");
            String name = st.nextToken().trim();
            String major = st.nextToken().trim();
            String number = st.nextToken().trim();
            String score = st.nextToken().trim();
            a.add(new Student(name, major, number, score));
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("-------------------------");
            System.out.println(a.get(i).getName());
            System.out.println(a.get(i).getMajor());
            System.out.println(a.get(i).getNumber());
            System.out.println(a.get(i).getScore());
        }
        System.out.println("-------------------------");
        while (true) {
            System.out.print("학생 이름 >> ");
            String s = sc.nextLine();
            if (s.equals("그만")) {
                break;
            }
            for (int i = 0; i < 4; i++) {
                if (a.get(i).getName().equals(s)) {
                    System.out.print(a.get(i).find());
                    break;
                }
            }
        }
    }
}
