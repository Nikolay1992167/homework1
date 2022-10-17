package homework8;

import java.util.Scanner;

public class Service {
    Card result = null;

    public Card selectionCard() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the card: ");
        String cardName = input.next();
        if (cardName.equals("debit")) {
            result = new Debitcard(1234, 50000, "Debet");
            System.out.println("You have chosen a debit card! Enter the PIN code(4 digits): ");

        } else if (cardName.equals("over")) {
            result = new Overcard(6549, 20000, "Over");
            System.out.println("You have chosen a over card! Enter the PIN code (4 digits): ");

        } else {
            System.out.println("Incorrect input! Repeat!");
            selectionCard();
        }
        return result;
    }

    public void checkPIN() {
        int pincode = getInput();
        if (pincode == result.getPassword()) {
            System.out.println("PIN OK! Select an operation: 1 - balance, 2 - top up your account, 3 - withdraw from the account, 4 - exit");
        } else {
            System.out.println("Invalid pincode! Repeat the input!");
            checkPIN();
        }
    }

    public void getOperation() {
        System.out.println("Enter the operation number: ");
        int numberOperation = getInput();
        if (numberOperation == 1) {
            System.out.println(result.getSummoney());
            getOperation();
        } else if (numberOperation == 2) {
            System.out.println("Enter the transaction amount: ");
            int transactionAmount = getInput();
            result.increaseTheBalance(transactionAmount);
            getOperation();
        } else if (numberOperation == 3) {
            System.out.println("Enter the transaction amount: ");
            int transactionAmount = getInput();
            result.reduceTheBalance(transactionAmount);
            getOperation();
        } else if (numberOperation == 4) {
            System.out.println("Goodbye!");
            return;
        } else {
            System.out.println("You didn't enter a number! Repeat the input!");
            getInput();
        }
    }

    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print(": ");
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Input error! Repeat the input!");
            return getInput();
        }
    }
}
