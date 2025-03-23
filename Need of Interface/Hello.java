interface A {

    int num = 798;
    String str = "jagan";

    void show();

    void confic();

}

 interface X 
 {
void hellojv();
    
}

interface Y extends X 
{
        
    }
 class B implements A,Y {

    public void show(){
        System.out.println("in show");
    }
    public void confic(){
        System.out.println("in confic");
    }
    public void hellojv(){
        System.out.println("in cosdesnfic");
    }
}


public class Hello {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.confic();
        obj.show();
        X obj1 = new B();
        obj1.hellojv();
        System.out.println(A.num);
        System.out.println(A.str);
    }
}
