class A {
    public void show() {
        System.out.println("hello A");
    }

    class B {
        public void inBShow() {
            System.out.println("hello b");
        }

    }

}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj1 = obj.new B();
        obj1.inBShow();
    }
}

// class A {
// public void show() {
// System.out.println("hello A");
// }

// static class B {
// public void inBShow() {
// System.out.println("hello b");
// }

// }

// }

// public class Demo {
// public static void main(String[] args) {
// A obj = new A();
// obj.show();

// A.B obj1 = new A.B();
// obj1.inBShow();
// }
// }
