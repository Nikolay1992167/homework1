package homework8;

public class Atm {
    public static void main(String[] args) {
        System.out.println("Welcome! We are glad to see you at our ATM!");
        try {
            Service service = new Service();
            service.selectionCard();
            service.checkPIN();
            service.getOperation();
        } catch (ServiceException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
