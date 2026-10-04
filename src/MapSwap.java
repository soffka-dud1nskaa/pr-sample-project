import java.util.*;

public class MapSwap {

    public static <K, V> Map<V, K> swapMap(Map<K, V> map) {

        Map<V, K> result = new HashMap<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }

        return result;
    }

    public static void main(String[] args) {

        Map<String, Integer> original = new HashMap<>();

        original.put("Apple", 1);
        original.put("Banana", 2);
        original.put("Orange", 3);

        System.out.println("Исходная Map:");
        System.out.println(original);

        Map<Integer, String> swapped = swapMap(original);

        System.out.println("\nMap после обмена ключей и значений:");
        System.out.println(swapped);
    }
}


