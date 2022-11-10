package homework10;

public class Atm1 implements Runnable {
    private final Service service;

    public Atm1(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                service.reduceBalance(5);
                Thread.sleep(400);
            } catch (IllegalArgumentException ex) {
                System.out.println("Thread stop atm2!");
                Thread.currentThread().interrupt();
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                ex.printStackTrace();
            }
        }
    }
}


