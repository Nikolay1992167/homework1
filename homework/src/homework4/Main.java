package homework4;

public class Main {

    public static void main(String[] args) {
        String stringBeingСhecked = " Listen to the news from today and read the text at the same time. Listen to the news from today without reading the text. ";
        calculationUniqueNumberWords(stringBeingСhecked);
    }

    private static int calculationUniqueNumberWords(String text) {
        String[] arrayWords = text.trim().split("[^a-zA-Z0-9]");
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
        System.out.println(calculation);
        return calculation;
    }
}
