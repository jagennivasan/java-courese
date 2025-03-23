interface A {

    int num = 798;
    String str = "jagan";

    void show();

    void confic();

}




 class B implements A {

    public void show(){
        System.out.println("in show");
    }
    public void confic(){
        System.out.println("in confic");
    }
}


public class Demo {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.confic();
        obj.show();
        System.out.println(A.num);
        System.out.println(A.str);
    }
}
