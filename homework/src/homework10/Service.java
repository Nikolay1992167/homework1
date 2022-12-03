package homework10;

public class Service {
    private final Card card;

    public Service(Card card) {
        this.card = card;
    }

    public synchronized void replenishBalance(int transactionAmount) {
        if (card.getSummoney() < 0) {
            throw new IllegalArgumentException();
        } else if (card.getSummoney() >= 0) {
            int count = card.getSummoney();
            card.setSummoney(count + transactionAmount);
            System.out.println(count);
        }

    }

    public synchronized void reduceBalance(int transactionAmount) {
        if (card.getSummoney() < 0) {
            throw new IllegalArgumentException();
        } else if (card.getSummoney() >= 0) {
            int count = card.getSummoney();
            card.setSummoney(count - transactionAmount);
            System.err.println(count);
        }
    }
}
