package homework10;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Atm atm = new Atm();

        try {
            Atm.showGreetings();
            atm.dataProcessing();
        } catch (ServiceException var3) {
            System.out.println(var3.getMessage());
        }

    }
}
