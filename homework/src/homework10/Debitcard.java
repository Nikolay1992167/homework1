package homework10;

public class Debitcard extends Card {

    public Debitcard(int password, int summoney, String name) {
        super(password, summoney, name);
    }

    public void reduceTheBalance(int money) {
        if (money <= this.getSummoney()) {
            super.reduceTheBalance(money);
        } else {
            System.out.println("Insufficient funds!");
        }

    }
}
