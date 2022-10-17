package homework10;

public class Service {
    private static Card result = null;

    public Service() {
    }

    public static boolean selectionCard(String cardName) {
        boolean selection = true;
        if (cardName.equals("debit")) {
            result = new Debitcard(1234, 50000, "Debet");
        } else if (cardName.equals("over")) {
            result = new Overcard(6549, 20000, "Over");
        } else {
            selection = false;
        }

        return selection;
    }

    public static boolean checkPIN(int pincode) {
        boolean accordance = true;
        return pincode == result.getPassword() ? accordance : false;
    }

    public static int checkBalance() {
        return result.getSummoney();
    }

    public static void replenishBalance(int transactionAmount) {
        result.increaseTheBalance(transactionAmount);
    }

    public static void reduceBalance(int transactionAmount) {
        result.reduceTheBalance(transactionAmount);
    }
}
