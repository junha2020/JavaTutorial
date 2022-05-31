import java.util.*;

class Word {
    String word, mean;

    public Word(String a, String b) {
        this.word = a;
        this.mean = b;
    }

    public String showWord() {
        return word;
    }
    public String showMena() {
        return mean;
    }
}
class Test {
    Scanner sc = new Scanner(System.in);
    Vector<Word> v;

    public Test() {
        v = new Vector<Word>();
        v.add(new Word("eye", "눈"));
        v.add(new Word("emotion", "감정"));
        v.add(new Word("deal", "거래"));
        v.add(new Word("painting", "그림"));
        v.add(new Word("animal", "동물"));
        v.add(new Word("love", "사랑"));
        v.add(new Word("society", "사회"));
        v.add(new Word("lover", "애인"));
        v.add(new Word("fault", "오류"));
        v.add(new Word("human", "인간"));
        v.add(new Word("statue", "조각상"));
        v.add(new Word("apple", "사과"));
        v.add(new Word("galaxy", "은하"));
        v.add(new Word("bear", "곰"));
        v.add(new Word("baby", "아기"));
        v.add(new Word("book", "책"));
        v.add(new Word("today", "오늘"));
    }
    public void run() {
        System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3>> ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                test();
                break;
            case 2:
                input();
                break;
            case 3:
                return;
        }
    }
    public void test() {
        System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다.");
        for (int i = 0; i < v.size(); i++) {
            String word[] = new String[v.size()];
            word[i] = v.get(i);
        }
        Random r1 = new Random();
        Random r2 = new Random();
        Random r3 = new Random();
        Random r4 = new Random();
        while (true) {
            System.out.println(r1. + "?");
            System.out.println("(1)" + mean[r1.nextInt(h.size())]);
        }
    }

    public void input() {

    }
}

public class EWordTest {
    public static void main(String[] args) {
        System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다. ****");
        Test t = new Test();
        t.run();
    }
}
