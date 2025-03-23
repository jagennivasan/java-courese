import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<String, Integer> studence = new Hashtable<>();
        studence.put("hello", 25);
        studence.put("thor", 32);
        studence.put("stark", 42);
        studence.put("toni", 22);

        // System.out.println(studence.get("hello"));
        
        
        
        
        for (String name : studence.keySet()) {
            System.out.println(name + "-" + studence.get(name));
        }

    }
}
