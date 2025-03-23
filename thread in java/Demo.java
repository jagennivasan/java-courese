class A extends Thread
{
public void run(){
    for (int i = 0; i <= 10 ; i++) {
        System.out.println("hello");

        try {
            Thread.sleep(10);

        } catch (InterruptedException e) {
        e.printStackTrace();    
        }
    }
}
}

class B   extends Thread 
{
    public void run(){
        for (int i = 0; i <= 10 ; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
    
            } catch (InterruptedException e) {
            e.printStackTrace();    
            }
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        try {
            Thread.sleep(5);

        } catch (InterruptedException e) {
        e.printStackTrace();    
        }
        obj2.start();

    }
}
