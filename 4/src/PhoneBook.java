import java.util.Scanner;

class Phone {
    String name, tel;
    public Phone (String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
}

public class PhoneBook {
    private Scanner sc = new Scanner(System.in);
    private Phone[] Phone;
    int n;
    private String findName;

    public PhoneBook(int n) {
        this.n = n;
        Phone = new Phone[n];
    }
    public void input() {
        for (int i = 0; i < n; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name = sc.next();
            String tel = sc.next();
            Phone[i] = new Phone(name, tel);
        }
    }
    public void find() {
        while (true) {
            System.out.print("검색할 이름>>");
            findName = sc.next();
            for (int i = 0; i < n; i++) {
                if (Phone[i].name.equals(findName)) {
                    System.out.println(findName + "의 번호는 " + Phone[i].tel);
                    break;
                } else if (findName.equals("그만")) {
                    break;
                } else {
                    System.out.println(findName + " 이 없습니다.");
                    break;
                }
            }
        }
    }
    public void run() {
        input();
        find();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("인원수>>");
        int n = sc.nextInt();
        PhoneBook pb = new PhoneBook(n);
        pb.run();
    }
}