import java.util.*;

public class WordCounter {

    public static void main(String[] args) {

        String text = "Java is great and Java is powerful";

        Map<String, Integer> wordCount = new HashMap<>();

        String[] words = text.toLowerCase().split("\\s+");

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Исходный текст:");
        System.out.println(text);

        System.out.println("\nКоличество вхождений слов:");
        System.out.println(wordCount);
    }
}