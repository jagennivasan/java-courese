
@FunctionalInterface
interface Nivas {
    void show();
    
}


// class Jagan implements Nivas
// {
// public void show(){
//     System.out.println("in show");
// }    
// }


public class Demo {
public static void main(String[] args) {
    Nivas obj = new Nivas()
    {
        public void show(){
            System.out.println("in new show");
        }
    };
    obj.show();
}    
}
