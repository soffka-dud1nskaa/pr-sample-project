package ru.lab.task5;
import java.util.Arrays;
public class OneDimensionalArrays {
    public void run() {
        System.out.println("\n=== Задание №5: Одномерные массивы ===");

        createAndPrintArray();
        findMinMax();
        calculateAverage();
        reverseArray();
        sortArray();
        removeDuplicates();
    }

    // 1. Создание и вывод массива
    private void createAndPrintArray() {
        System.out.println("\n1. Создание и вывод массива:");

        int[] numbers = {5, 2, 8, 1, 9, 3};

        System.out.println("Массив: " + Arrays.toString(numbers));
    }

    // 2. Поиск минимального и максимального элементов
    private void findMinMax() {
        System.out.println("\n2. Минимальный и максимальный элементы:");

        int[] numbers = {5, 2, 8, 1, 9, 3};

        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }

        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
    }

    // 3. Среднее арифметическое
    private void calculateAverage() {
        System.out.println("\n3. Среднее арифметическое:");

        int[] numbers = {5, 2, 8, 1, 9, 3};

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Сумма: " + sum);
        System.out.println("Количество элементов: " + numbers.length);
        System.out.println("Среднее: " + average);
    }

    // 4. Разворот массива
    private void reverseArray() {
        System.out.println("\n4. Разворот массива:");

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("До разворота: " + Arrays.toString(numbers));

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            left++;
            right--;
        }

        System.out.println("После разворота: " + Arrays.toString(numbers));
    }

    // 5. Сортировка массива
    private void sortArray() {
        System.out.println("\n5. Сортировка массива:");

        int[] numbers = {7, 2, 9, 1, 5, 3};

        System.out.println("До сортировки: " + Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("После сортировки: " + Arrays.toString(numbers));
    }

    // 6. Удаление повторяющихся элементов
    private void removeDuplicates() {
        System.out.println("\n6. Удаление повторяющихся элементов:");

        int[] numbers = {1, 2, 2, 3, 4, 4, 5};

        System.out.println("Исходный массив: " + Arrays.toString(numbers));

        int uniqueCount = 0;

        for (int i = 0; i < numbers.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (numbers[i] == numbers[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                numbers[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }

        int[] result = Arrays.copyOf(numbers, uniqueCount);

        System.out.println("Без повторов: " + Arrays.toString(result));
    }

}