class A {
    public int pubVar;
    protected int protVar;
    private int privVar;

    A(int a, int b, int c) {
        pubVar = a;
        protVar = b;
        privVar = c;
    }
}

class B extends A {
    B() {
        super(10, 20, 30);
    }

    void display() {
        System.out.println("From B (Inheritance):");
        System.out.println("Public: " + pubVar);
        System.out.println("Protected: " + protVar);
    }
}

class C {
    void display() {
        A obj = new A(1, 2, 3);

        System.out.println("From C (Object Creation):");
        System.out.println("Public: " + obj.pubVar);
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();

        b.display();
        c.display();

        System.out.println("maitri chauhan. 250393107003");
    }
}