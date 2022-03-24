class Person2 { }
class Student2 extends Person2 { }
class Researcher extends Person2 { }
class Professor extends Researcher { }

public class InstanceOfEx {
    static void print(Person2 p2) {
        if(p2 instanceof Person2)
            System.out.print("Person ");
        if(p2 instanceof Student2)
            System.out.print("Student ");
        if(p2 instanceof Researcher)
            System.out.print("Researcher ");
        if(p2 instanceof Professor)
            System.out.print("Professor ");
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.print("new Student() ->\t"); print(new Student2());
        System.out.print("new Researcher() ->\t"); print(new Researcher());
        System.out.print("new Professor() ->\t"); print(new Professor());
    }
}
