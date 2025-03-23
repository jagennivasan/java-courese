// enum Status {
//     Hello, Hi, Wick,wickanago
// }

// public class Demo {
//     public static void main(String[] args) {

//     //     Status[] ss = Status.values();

//     //    for(Status s :ss){
//     //     System.out.println(s + " " + ": " + s.ordinal());
//     //    }

// Status s= Status.wickanago;

//         switch (s) {
//             case Hello:
//                 System.out.println("helllo");
//                 break;
//                 case Hi:
//                 System.out.println("hi");
//                 break;
//                 case Wick:
//                 System.out.println("wick");
//                 break;
//                 case wickanago:
//                 System.out.println("wickanago");
//                 break;

//             default:
//             System.out.println("ok");

//                 break;
//         }

//     }
// }

enum Laptop {
    makbook(234),lenovo(2344),amd,intel(23423);

private int price;
    



private Laptop() {
    price = 345;
}

    private Laptop(int price){
        this.price = price;
        System.out.println("in Laptop " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    

    
}




public class Demo {
public static void main(String[] args) {
    // Laptop lap = Laptop.lenovo;
    // System.out.println(lap + " : " + lap.getPrice());

for(Laptop lap : Laptop.values()){
System.out.println(lap + " : " + lap.getPrice());
}


}
    
}