

 class A {
public void show(){
    System.out.println("in show A");
}
public void config(){
    System.out.println("in config");
}
}
class B extends A{
    public void show(){
        System.out.println("in show B" );
    }
}

 class methordOW {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
    }
}
