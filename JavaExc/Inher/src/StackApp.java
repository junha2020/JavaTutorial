import java.util.Scanner;

interface Stack {
    int length();
    int capacity();
    String pop();
    boolean push(String val);
}
class StringStack implements Stack {
    private int top = 0;
    private String arr[];
    public StringStack(int size) {
        arr = new String[size];
    }
    @Override
    public int length() {
        return top;
    }
    @Override
    public int capacity() {
        return arr.length;
    }
    @Override
    public String pop() {
        String val;
        if (top == 0) {
            val = "0";
        }
        else {
            top--;
            val = arr[top];
        }
        return val;
    }
    @Override
    public boolean push(String val) {
        if (top == arr.length) {
            return false;
        }
        else {
            arr[top] = val;
            top++;
            return true;
        }
    }
}

public class StackApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int n = sc.nextInt();
        StringStack ss = new StringStack(n);
        while(true) {
            System.out.print("문자열 입력 >> ");
            String str = sc.next();
            if (str.equals("그만")) {
                break;
            }
            else {
                boolean bool = ss.push(str);
                if (bool == false) {
                    System.out.println("스택이 꽉 차서 푸시 불가!");
                }
            }
        }
        System.out.print("스택에 저장된 모든 문자열 팝 : ");
        for (int i = 0; i < n; i++) {
            String str = ss.pop();
            if (str.equals("0")) {
                System.out.println();
                break;
            }
            else {
                System.out.print(str + " ");
            }
        }
    }
}
