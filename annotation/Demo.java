class Jagan
 {
    
    
    public void shows(){
        System.out.println("showdd");
    }
    

}class Nivasan extends Jagan
{

    @Override
    public void shows() {
        // TODO Auto-generated method stub
        super.shows();
    }
  
}

public class Demo {
 public static void main(String[] args) {
    Nivasan obj =new Nivasan();
    obj.shows();
 }   
}
