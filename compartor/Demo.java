import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

Comparator<Integer> com = new Comparator<Integer>() {
    @Override
    public int compare(Integer arg0, Integer arg1) {
        
        if (arg0 %10 > arg1 %10) {
            return 1;
        }else{
            return -1;

        }
        
    }
};

        nums.add(11);
        nums.add(76);
        nums.add(65);
        nums.add(68);
        nums.add(80);

        Collections.sort(nums,com);
        System.out.println(nums);
    }
}
