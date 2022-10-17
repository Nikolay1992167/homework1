package homework8;

public class Debitcard extends Card {

    public Debitcard(int password, int summoney, String name) {
        super(password, summoney, name);
    }

    public void reduceTheBalance(int money) {
        if (money < 0) {
            throw new ServiceException("Wrong summa money! Negative number");
        }
        else if (money < getSummoney()) {
            this.setSummoney(getSummoney() - money);
        } else {
            System.out.println("Insufficient funds!");
        }

    }


}
