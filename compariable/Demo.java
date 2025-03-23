import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    }

}

public class Demo {

    public static void main(String[] args) {

        Comparator<Student> com =   (i,j) ->   i.age > j.age ? 1 : -1;

        List<Student> nums = new ArrayList<>();
        nums.add(new Student(27, "jagan"));
        nums.add(new Student(26, "jaga56n"));
        nums.add(new Student(25, "jagansdf"));
        nums.add(new Student(24, "jagansdf"));

        Collections.sort(nums, com);
        for (Student s : nums) {
            System.out.println(s);

        }

    }
}