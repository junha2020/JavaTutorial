import java.util.*;

interface IStack<T> {
    T pop();
    boolean push(T ob);
}

class MyStack<T> implements IStack<T> {
    Vector<T> v;
    public MyStack() {
        v = new Vector<>();    }
    public boolean push(T ob) {
        v.add(ob);
        return true;
    }
    public T pop() {
        if (v.size() == 0) {
            return null;
        }
        else {
            return v.remove(v.size() - 1);
        }
    }
}

public class StackManager {
    public static void main(String[] args) {
        IStack<Integer> stack = new MyStack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        while (true) {
            Integer n = stack.pop();
            if (n == null) {
                break;
            }
            System.out.print(n + " ");
        }
    }
}
