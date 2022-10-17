package homework10;

import java.util.Scanner;

public class Atm {
    private final Service service = new Service();
    Scanner input;

    public Atm() {
        this.input = new Scanner(System.in);
    }

    public static void showGreetings() {
        printMessage("Welcome! We are glad to see you at our ATM!");
    }

    public void dataProcessing() {
        printMessage("Enter the name of the card: ");
        String cardName = this.input.next();
        Service var10000 = this.service;
        if (Service.selectionCard(cardName)) {
            printMessage("You have chosen a " + cardName + " card! Enter the PIN code(4 digits): ");
        } else {
            printMessage("Incorrect input! Repeat!");
            this.dataProcessing();
        }

        var10000 = this.service;
        if (Service.checkPIN(getInput())) {
            printMessage("PIN OK! Select an operation: 1 - balance, 2 - top up your account, 3 - withdraw from the account, 4 - exit");
        } else {
            printMessage("Invalid pincode! Repeat the input!");
            var10000 = this.service;
            Service.checkPIN(getInput());
        }

        this.getOperation();
        this.input.close();
    }

    public void getOperation() {
        printMessage("Enter the operation number: ");
        int numberOperation = getInput();
        if (numberOperation == 1) {
            printMessage(String.valueOf(Service.checkBalance()));
            this.getOperation();
        } else {
            Service var10000;
            if (numberOperation == 2) {
                var10000 = this.service;
                Service.replenishBalance(getTransactionAmount());
                this.getOperation();
            } else if (numberOperation == 3) {
                var10000 = this.service;
                Service.reduceBalance(getTransactionAmount());
                this.getOperation();
            } else if (numberOperation == 4) {
                printMessage("Goodbye!");
                return;
            }
        }

    }

    private static void printMessage(String message) {
        System.out.println(message);
    }

    private static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print(": ");
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Input error! Repeat the input!");
            return getInput();
        }
    }

    private static int getTransactionAmount() {
        printMessage("Enter the transaction amount: ");
        int transactionAmount = getInput();
        return transactionAmount;
    }
}