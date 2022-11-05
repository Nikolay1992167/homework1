package homework11;

import java.util.*;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");

        List<String> result = myList.stream()
                .filter((s) -> !s.contains("3"))
                .sorted(Comparator.comparing(s -> s.replaceAll("\\D", "")))
                .sorted(Comparator.comparing(s -> s.replaceAll("\\d", ""))).sorted(Comparator.reverseOrder())
                .skip(1)
                .map((s) -> s.replaceAll("1", "9"))
                .map((s) -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(result.stream().collect(Collectors.joining(";")));

    }
}
