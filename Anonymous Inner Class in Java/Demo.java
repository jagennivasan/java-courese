class A {
    public void show() {
        System.out.println("in A show");
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("in new  anonymus ");
            }
        };

        obj.show();
    }
}
