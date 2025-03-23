interface Computer {
    void code();

}

class Desktop implements Computer {
    public void code() {
        System.out.println("in desktom is sod good");
    }
}

class Laptop implements Computer {
    public void code() {
        System.out.println("in desktom is sod bad");
    }
}

class Developer {
    public void devcode(Computer lap) {
        lap.code();
    }
}

public class Demo {
    public static void main(String[] args) {
        Computer obj = new Desktop();
        Computer lap = new Laptop();
        Developer jagan = new Developer();
        jagan.devcode(obj);

    }
}
