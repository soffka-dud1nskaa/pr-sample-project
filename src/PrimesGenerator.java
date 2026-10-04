import java.util.*;

public class PrimesGenerator implements Iterator<Integer> {

    private int current = 2;

    // Проверка, является ли число простым
    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Проверяем, есть ли следующее простое число
    @Override
    public boolean hasNext() {
        return true;
    }

    // Возвращаем следующее простое число
    @Override
    public Integer next() {
        while (!isPrime(current)) {
            current++;
        }

        return current++;
    }

    public static void main(String[] args) {

        PrimesGenerator generator = new PrimesGenerator();

        List<Integer> primes = new ArrayList<>();

        // Получаем первые 10 простых чисел
        for (int i = 0; i < 10; i++) {
            primes.add(generator.next());
        }

        System.out.println("Простые числа по возрастанию:");
        System.out.println(primes);

        System.out.println("Простые числа по убыванию:");

        Collections.reverse(primes);
        System.out.println(primes);
    }
}