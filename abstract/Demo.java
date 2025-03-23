abstract class Car {
    public abstract void fly();

    public abstract void drive();

    public void playmusic() {
        System.out.println("music playing");
    }
}

abstract class Omni extends Car {
    public void drive() {
        System.out.println("omini driving");
    }

}

class FlightCar extends Omni {
    public void fly() {
        System.out.println("car is flinge");
    }

}

public class Demo {
    public static void main(String[] args) {
        Car obj = new FlightCar();
        obj.drive();
        obj.playmusic();
        obj.fly();
    }

}