class A {
    public void show() throws ClassNotFoundException {
        Class.forName("emo");
    }
}

public class Demo {

    static {
        System.out.println("class loaded");
    }

    public static void main(String[] args) {

        A obj = new A();

        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
