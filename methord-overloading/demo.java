class Calculate {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public double add(int n1, double n2, int n3) {
        return n1 + n2 + n3;
    }
}






public class demo {

    public static void main(String[] args) {

        Calculate obj = new Calculate();
        int result2 = obj.add(23, 33);
        double result = obj.add(2, 2.2, 3);
        System.out.println(result);
        System.out.println(result2);

    }
}