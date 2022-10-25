package homework9;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "ProcessedText.txt";
        try {
            write(fileName);
            read(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void write(String fileName) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write("Writes text to a character-output stream, buffering characters so as to provide for the efficient writing of single characters, arrays, and strings.");
        }
    }
    //| есть ли здесь необходимость в PatternSyntaxException для regex
    private static String read(String nameFile) throws IOException {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(nameFile))) {
            while ((line = br.readLine()) != null) {
                getNumberWords(line);
                getNumberPunctuationMarks(line);
            }
        }
        return line;
    }
    private static void getNumberWords(String variable){
        List<String> arrayOfWords = List.of(variable.replaceAll("[^a-zA-Z0-9 ]", "").split(" +"));
        int numberOfWordsInTheText = arrayOfWords.size();
        printResult("Number of words in the text:" + numberOfWordsInTheText);
    }
    private static void getNumberPunctuationMarks(String variable){
        List<String> arrayOfPunctuationMarks = List.of(variable.split("([^a-zA-Z0-9 ])+"));
        printResult("Number of punctuation marks:" + arrayOfPunctuationMarks.size());
    }

    private static void printResult(String message) {
        System.out.println(message);
    }
}

