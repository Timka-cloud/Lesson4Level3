package HomeWork;

public class Main {
    volatile int status = 0;
    public static void main(String[] args) {
        Main shut = new Main();
        Thread t1 = new Thread(new ThreeThread("A", shut,1));

        Thread t2 = new Thread(new ThreeThread("B", shut,2));

        Thread t3 = new Thread(new ThreeThread("C", shut,3));

        t1.start();
        t2.start();
        t3.start();
    }
}
