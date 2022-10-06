package homework7;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] array = createGenericArray(String.class, 10);
        array[0] = "cati";
        array[1] = "dog";
        array[2] = "cat";
        array[3] = "lion";
        array[4] = "dog";
        array[5] = "dogi";
        array[6] = "dogi";
        array[7] = "dog";
        array[8] = "dog";
        array[9] = "lion";
        arrayToMap(array);
    }

    public static <K> K[] createGenericArray(Class<K> clazz, int capacity) {
        return (K[]) Array.newInstance(clazz, capacity);
    }

    public static <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> map = new HashMap<>();
        int numberOfOccurrences = 0;
        for (int i = 0; i < ks.length; i++) {
            for (int j = 0; j < ks.length; j++) {
                if (ks[i].equals(ks[j])) {
                    numberOfOccurrences = numberOfOccurrences + 1;
                }
            }
            map.put(ks[i], numberOfOccurrences);
            numberOfOccurrences = 0;
        }
        System.out.println(map);
        return map;
    }
}
