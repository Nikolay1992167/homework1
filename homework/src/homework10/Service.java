package homework10;

public class Service {
    private final Card card;

    public Service(Card card) {
        this.card = card;
    }

    public synchronized void replenishBalance(int transactionAmount) {
        int count = card.getSummoney();
        card.setSummoney(count + transactionAmount);
        System.out.println(count);
    }

    public synchronized void reduceBalance(int transactionAmount) {
        int count = card.getSummoney();
        card.setSummoney(count-transactionAmount);
        System.err.println(count);
    }
}
