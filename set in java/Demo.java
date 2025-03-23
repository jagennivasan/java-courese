import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        // Set<Integer> nums = new HashSet<Integer>();
        // nums.add(73);
        // nums.add(43);
        // nums.add(3);

        // for(int n : nums){
        //     System.out.println(n);
        // }
    
        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(73);
        nums.add(43);
        nums.add(3);

        Iterator valus = nums.iterator();

        while (valus.hasNext()) {
            System.out.println(valus.next());
        }

        for(int n : nums){
            System.out.println(n);
        }
    
    
    }
}
