
// public class Demo {
//     public static void main(String[] args) {

// final int num = 7;
//       num=8;  
//         System.out.println(num);
//     }
// }

// final

//  final class  Calc
// {
//  public void show(){
//     System.out.println("hello show final");
//  }
//  public double add(int n1 ,double n2){
// return n1 + n2;
// }

// }
//  class InnerDemo extends Calc {

// }

// public class Demo {
//     public static void main(String[] args) {

//         Calc objadd = new Calc();
//        double r1 =  objadd.add(44, 4.4);
// System.out.println(r1);
//     }
// }

class Calc {
    public final void show() {
        System.out.println("hello show final");
    }

    public double add(int n1, double n2) {
        return n1 + n2;
    }

}

class Advcal extends Calc {
    public void show() {
        System.out.println("hello show Adv");
    }

}

public class Demo {
    public static void main(String[] args) {

        Advcal objadd = new Advcal();
        double r1 = objadd.add(44, 4.4);
        System.out.println(r1);

        objadd.show();
    }
}