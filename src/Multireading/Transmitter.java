package Multireading;

public class Transmitter implements Runnable {
    private Packet packet;
    private String[] data;

    public Transmitter(Packet packet) {
        this.packet = packet;
        data = new String[]{
                "Hi",
                "How are you",
                "I'm fine",
                "-EOP"
        };
    }

    @Override
    public void run() {
        for (String d : data) {
            packet.transmit(d);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
