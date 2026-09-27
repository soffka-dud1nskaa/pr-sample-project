package ru.lab.task8;
import java.util.Scanner;
import ru.lab.task1.IntegerTraps; import ru.lab.task2.FloatingPoint; import ru.lab.task3.BitOperations; import ru.lab.task4.TextProcessing; import ru.lab.task5.OneDimensionalArrays; import ru.lab.task6.MultidimensionalArrays; import ru.lab.task7.MethodsArguments;
public class ConsoleMenu {
    public void run() {

        Scanner scanner = new Scanner(System.in);

        int choice = -1;

        do {

            System.out.println("""
                
                ===========================
                       JAVA LABORATORY
                ===========================
                1. Целочисленные ловушки
                2. Вещественная арифметика
                3. Побитовые операции
                4. Обработка текста
                5. Одномерные массивы
                6. Многомерные массивы
                7. Методы и аргументы
                0. Выход
                ===========================
                """);

            System.out.print("Выберите задание: ");

            // Проверяем, что пользователь ввёл целое число
            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка: необходимо ввести число.");

                scanner.next();
                continue;
            }

            choice = scanner.nextInt();

            // Проверяем диапазон
            if (choice < 0 || choice > 7) {
                System.out.println(
                        "Ошибка: выберите число от 0 до 7."
                );
                continue;
            }

            switch (choice) {

                case 1 -> new IntegerTraps().run();

                case 2 -> new FloatingPoint().run();

                case 3 -> new BitOperations().run();

                case 4 -> new TextProcessing().run();

                case 5 -> new OneDimensionalArrays().run();

                case 6 -> new MultidimensionalArrays().run();

                case 7 -> new MethodsArguments().run();

                case 0 -> System.out.println(
                        "Программа завершена."
                );
            }

        } while (choice != 0);

        scanner.close();
    }

}
