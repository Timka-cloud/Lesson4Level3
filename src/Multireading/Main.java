package Multireading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Packet packet = new Packet();
        Transmitter transmitter = new Transmitter(packet);
        Receiver receiver = new Receiver(packet);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(transmitter);
        executorService.submit(receiver);
        executorService.shutdown();

    }
}
