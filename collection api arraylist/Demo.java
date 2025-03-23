import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
       
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(8);
        nums.add(6);
        nums.add(6);
        
        System.out.println(nums.get(0));
        System.out.println(nums.indexOf(6));
        // for(int n : num){
        //     System.out.println(n * 2);
        // }
    }

}