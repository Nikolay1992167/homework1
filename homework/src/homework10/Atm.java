package homework10;

public class Atm implements Runnable {
    private final Service service;

    public Atm(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                service.replenishBalance(3);
                Thread.sleep(400);
            } catch (IllegalArgumentException ex) {
                System.out.println("Thread stop atm1!");
                Thread.currentThread().interrupt();
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                ex.printStackTrace();
            }
        }
    }
}
