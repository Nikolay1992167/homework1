package homework6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Tire<String> summer = new Tire(2);
        summer.setCatalogValue(0, "Belka");
        summer.setCatalogValue(1, "Nokian");
        summer.first();
        summer.last();
        summer.swap(1, 0);
        summer.replaceFirst("Tiger");
        summer.replaceLast("Mischlen");
        System.out.println(Arrays.toString(summer.getCatalog()));
    }
}
