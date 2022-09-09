package homework2;

public class Main {
    public static void main(String[] args) {
      numberLuckyTickets(1,999999);
    }
    private static void printResult(String message) {
        System.out.println(message);
    }
    private static void numberLuckyTickets(int numberFirstTicket, int numberLastTicket){
        int numberLuckyTickets = 0;
        for (int i=numberFirstTicket; i<=numberLastTicket; i++){
            int numberOfFirstThreeDigits = i/1000;
            int sumFirstThreeNumbers = getDigitsSumFromNumber(numberOfFirstThreeDigits);
            int numberOfLastThreeDigits = i%1000;
            int sumLastThreeNumbers = getDigitsSumFromNumber(numberOfLastThreeDigits);
            if (sumFirstThreeNumbers == sumLastThreeNumbers){
                numberLuckyTickets = numberLuckyTickets+1;
            }
        }
        printResult("Number of lucky tickets: "+numberLuckyTickets);
    }
    private static int getDigitsSumFromNumber(int number) {
        int summa = 0;
        while (number > 0) {
            summa = summa + number % 10;
            number = number / 10;
        }
        return summa;
    }
}
