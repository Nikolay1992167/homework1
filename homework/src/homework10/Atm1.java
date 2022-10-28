package homework10;

public class Atm1 implements Runnable {

    private final Service service;

    public Atm1(Service service) {
        this.service = service;
    }


    @Override
    public void run() {
        System.out.println("Start one!");
        try {
            while (!Thread.currentThread().isInterrupted()) {
                service.reduceBalance(5);
            }
        } catch (NullPointerException ex) {
            Thread.currentThread().interrupt();
            System.out.println("stop one!");
        }
    }
}


