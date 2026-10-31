import com.google.gson.Gson; import com.google.gson.reflect.TypeToken;
import java.io.IOException; import java.io.Reader; import java.nio.charset.StandardCharsets; import java.nio.file.Files; import java.nio.file.Path; import java.util.List; import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Path path = Path.of("src/main/resources/books.json");

        try (Reader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            List<Book> books = gson.fromJson(
                    reader, new TypeToken<List<Book>>() {}.getType());

            List<Visitor> visitors = List.of(
                    new Visitor("Anna", "Ivanova", "+79001111111",
                            List.of(books.get(0), books.get(1), books.get(2)), true),
                    new Visitor("Petr", "Petrov", "+79002222222",
                            List.of(books.get(2)), true),
                    new Visitor("Maria", "Sidorova", "+79003333333",
                            List.of(books.get(0), books.get(3)), false),
                    new Visitor("Ivan", "Smirnov", "+79004444444",
                            List.of(books.get(1), books.get(2), books.get(4), books.get(5)), true),
                    new Visitor("Olga", "Kuznetsova", "+79005555555",
                            List.of(books.get(3), books.get(4)), true)
            );

            // Задание 1. Вывод посетителей и их количества
            System.out.println("=== Задание 1 ===");
            visitors.stream().forEach(System.out::println);
            System.out.println("Количество посетителей: " + visitors.stream().count());

            // Задание 2. Список книг без повторений
            List<Book> uniqueBooks = visitors.stream()
                    .flatMap(visitor -> visitor.getFavoriteBooks().stream())
                    .distinct()
                    .collect(Collectors.toList());

            System.out.println("\n=== Задание 2 ===");
            uniqueBooks.forEach(System.out::println);
            System.out.println("Количество уникальных книг: " + uniqueBooks.size());

            // Задание 3. Сортировка по году издания
            System.out.println("\n=== Задание 3 ===");
            uniqueBooks.stream()
                    .sorted((a, b) -> Integer.compare(
                            a.getPublishingYear(), b.getPublishingYear()))
                    .forEach(System.out::println);

            // Задание 4. Проверка наличия книг Jane Austen
            boolean hasJaneAusten = visitors.stream()
                    .flatMap(visitor -> visitor.getFavoriteBooks().stream())
                    .anyMatch(book -> "Jane Austen".equalsIgnoreCase(book.getAuthor()));

            System.out.println("\n=== Задание 4 ===");
            System.out.println("Есть книги Jane Austen: " + hasJaneAusten);

            // Задание 5. Максимальное количество книг у посетителя
            int maxBooks = visitors.stream()
                    .mapToInt(visitor -> visitor.getFavoriteBooks().size())
                    .max()
                    .orElse(0);

            System.out.println("\n=== Задание 5 ===");
            System.out.println("Максимальное количество книг: " + maxBooks);

            // Задание 6. SMS для подписчиков
            double average = visitors.stream()
                    .mapToInt(visitor -> visitor.getFavoriteBooks().size())
                    .average()
                    .orElse(0);

            List<SmsMessage> messages = visitors.stream()
                    .filter(Visitor::isSubscribed)
                    .map(visitor -> {
                        int count = visitor.getFavoriteBooks().size();
                        String message;

                        if (count > average) {
                            message = "you are a bookworm";
                        } else if (count < average) {
                            message = "read more";
                        } else {
                            message = "fine";
                        }

                        return new SmsMessage(visitor.getPhone(), message);
                    })
                    .collect(Collectors.toList());

            System.out.println("\n=== Задание 6 ===");
            System.out.println("Среднее количество книг: " + average);
            messages.forEach(System.out::println);

        } catch (IOException e) {
            System.err.println("Ошибка чтения books.json: " + e.getMessage());
        }
    }
}