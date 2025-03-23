
class A {
    public A() {
        super();
        System.out.println("in A");
    }

    public A(int a) {
        this();
        System.out.println("in  A para");
    }
}

class B extends A {
    public B() {
        super(44);
        System.out.println("in B");
    }

    public B(int a) {
        this();
        System.out.println("in b pra");
    }
}

class Demo {
    public static void main(String[] args) {
        B obj = new B(54);
    }
}
