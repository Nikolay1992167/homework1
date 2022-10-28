package homework10;

public class Atm implements Runnable {
    private final Service service;

    public Atm(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        System.out.println("start two!");
        try {
            while (!Thread.currentThread().isInterrupted()) {
                service.replenishBalance(3);
            }
        } catch (NullPointerException ex) {
            Thread.currentThread().interrupt();
            System.out.println("stop two!");
        }
    }
}
