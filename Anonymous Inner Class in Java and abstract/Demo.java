abstract class A{
    public abstract void drive();
    public abstract void car();
}



public class Demo {
    public static void main(String[] args) {
        A obj = new A(){
            public void drive(){
                System.out.println("this is the methord to use abstract with anonymos inner class");
            }
            public void car(){
                System.out.println("this is the methord to use abstract with multi anonymos inner class");
            }
        };
    obj.drive();
    obj.car();
    }
}
