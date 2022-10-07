package homework4;

public class Main {

    public static void main(String[] args) {
        String stringBeingСhecked = " My name's David. We're in a small village near Chicago. My name's David. ";
        calculationUniqueNumberWords(stringBeingСhecked);
    }

    private static void printResult(String message) {
        System.out.println(message);
    }

    private static int calculationUniqueNumberWords(String text) {
        String[] arrayWords = text.trim().replaceAll("[^a-zA-Z0-9 ]", "").split(" +");
        int calculation = 0;
        for (int i = 0; i < arrayWords.length; i++) {
            boolean uniqueness = true;
            for (int j = i + 1; j < arrayWords.length; j++) {
                if (arrayWords[i].equalsIgnoreCase(arrayWords[j])) {
                    uniqueness = false;
                    break;
                }
            }
            if (uniqueness) {
                calculation = calculation + 1;
            }
        }
        printResult("Unique number of words in the text: " + calculation);
        return calculation;
    }
}
