import java.util.*;

public class PrimesGeneratorTest {

    public static void main(String[] args) {

        PrimesGenerator generator = new PrimesGenerator();

        List<Integer> primes = new ArrayList<>();

        // Получаем 10 простых чисел
        for (int i = 0; i < 10; i++) {
            primes.add(generator.next());
        }

        System.out.println("Простые числа по возрастанию:");
        System.out.println(primes);

        System.out.println("Простые числа в обратном порядке:");

        Collections.reverse(primes);

        System.out.println(primes);
    }
}