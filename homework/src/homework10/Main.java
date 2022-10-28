package homework10;

public class Main {
    public static void main(String[] args)  {
        Card debit = new Card(1234, 50, "Debet");
        Service service = new Service(debit);
        Thread atm1 = new Thread(new Atm(service));
        Thread atm2 = new Thread(new Atm1(service));

        if (debit.getSummoney() > 0) {
            atm1.start();
            atm2.start();
        } else {
                atm1.interrupt();
                atm2.interrupt();
        }
    }
}
