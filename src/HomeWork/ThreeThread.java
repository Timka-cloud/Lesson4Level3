package HomeWork;

public class ThreeThread implements Runnable {
    private String letter;
    private final Main shut;
    private int a;

    public ThreeThread(String text, Main obj, int a) {
        letter = text;
        this.shut = obj;
        this.a = a;
    }

    @Override
    public void run() {

        while(shut.status < 13) {
            synchronized (shut) {

                while(!((shut.status % 3) == 0) && a == 1){
                    try {
                        Thread.sleep(500);
                        shut.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                while(!((shut.status % 3) == 1) && a == 2){
                    try {
                        Thread.sleep(500);
                        shut.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                while(!((shut.status % 3) == 2) && a == 3){
                    try {
                        Thread.sleep(500);
                        shut.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(letter);
                shut.status++;
                if ((shut.status % 3) == 0) System.out.print("");
                shut.notifyAll();
            }
        }
    }
}
