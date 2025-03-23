// public class Demo {
//     public static void main(String[] args) {
//         int i = 4;
//         int j = 2;
// String str  = null;
//         int num[] = new int[5];



//         try {
//             j = 18/i;   
//             System.out.println(num[1]);
//             System.out.println(num[4]);
//             System.out.println(str.length());
//         } catch (ArithmeticException e) {
//             System.out.println(" ArithmeticException");
//         }
//         catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println(" ArrayIndexOutOfBoundsException");
//         }
//         catch (Exception e) {
//             System.out.println(" Exception error " + e);
//         }

        
//         System.out.println(j);
//         System.out.println("good ");

// }
// }


 class MyException extends Exception  
{
public MyException(String string){
super(string);
}
    
}

public class Demo {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
 


        try {
            j = 18/i;   
            if (j==0) {
                throw new MyException("the expesion is created by jagan");
            }

        } catch ( MyException e) {
            System.out.println(" ArithmeticException" + e);
        }
        
        
        System.out.println(j);
        System.out.println("good ");

}
}