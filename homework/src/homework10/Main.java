package homework10;

public class Main {
    public static void main(String[] args) {
        Card debit = new Card(1234, 20, "Debet");
        Service service = new Service(debit);
        Thread atm1 = new Thread(new Atm(service));
        Thread atm2 = new Thread(new Atm1(service));

        atm1.start();
        atm2.start();

    }
}
