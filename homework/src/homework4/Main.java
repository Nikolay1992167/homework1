package homework4;

public class Main {

    public static void main(String[] args) {
        String stringBeingСhecked = " Listen to the news from today and read the text at the same time. Listen to the news from today without reading the text. ";
        uniqueNumberWords(stringBeingСhecked);


    }

    private static int uniqueNumberWords(String text) {
        String[] arrayWords = text.trim().split("[\\s+.+]");
        int totalNumberOfWords = arrayWords.length;
        int availability = 0;
        for (int i = 0; i < arrayWords.length; i++) {
            for (int j = 0; j < arrayWords.length; j++) {
                if (arrayWords[i] == arrayWords[j]) {
                    availability = availability + 1;
                }

            }
        }
        return 0;
    }
}
