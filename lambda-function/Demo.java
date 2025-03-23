
// @FunctionalInterface
// interface Nivas {
//     void show(int i);
    
// }





// public class Demo {
// public static void main(String[] args) {
// //     Nivas obj = (i) -> System.out.println("in lamda function");

// //     obj.show(456);
// // }    
// Nivas obj = i -> System.out.println("in lamda function " + i);

// obj.show(456);
// }  

// }


@FunctionalInterface
interface Nivas {
    int show(int i,int j);
    
}





public class Demo {
public static void main(String[] args) {
   
Nivas obj = (i,j) -> i + j;

int result = obj.show(3, 30);
System.out.println(result);


}  

}
