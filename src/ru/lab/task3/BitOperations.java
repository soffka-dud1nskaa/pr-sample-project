package ru.lab.task3;
public class BitOperations {
    public void run() {
        System.out.println("\n=== Задание №3: Побитовые операции ===");

        basicBitOperations();
        shiftOperations();
        checkEven();
        checkPowerOfTwo();
        countBits();
        swapWithoutTemporary();
    }

    // 1. Основные побитовые операции
    private void basicBitOperations() {
        System.out.println("\n1. Основные побитовые операции:");

        int a = 12; // 1100
        int b = 10; // 1010

        System.out.println("a = " + a + " (1100)");
        System.out.println("b = " + b + " (1010)");

        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
        System.out.println("a >>> 1 = " + (a >>> 1));


    }

    // 2. Разница между >> и >>> на отрицательном числе
    private void shiftOperations() {
        System.out.println("\n2. Разница между >> и >>>:");

        int negative = -8;

        System.out.println("Исходное число: " + negative);
        System.out.println("negative >> 1 = " + (negative >> 1));
        System.out.println("negative >>> 1 = " + (negative >>> 1));


    }

    // 3. Проверка четности
    private void checkEven() {
        System.out.println("\n3. Проверка четности:");

        int number1 = 14;
        int number2 = 15;

        System.out.println(number1 + " четное: " + isEven(number1));
        System.out.println(number2 + " четное: " + isEven(number2));


    }

    private boolean isEven(int number) {
        return (number & 1) == 0;
    }

    // 4. Проверка, является ли число степенью двойки
    private void checkPowerOfTwo() {
        System.out.println("\n4. Проверка степени двойки:");

        int number1 = 16;
        int number2 = 18;

        System.out.println(number1 + " является степенью двойки: "
                + isPowerOfTwo(number1));

        System.out.println(number2 + " является степенью двойки: "
                + isPowerOfTwo(number2));


    }

    private boolean isPowerOfTwo(int number) {
        return number > 0 && (number & (number - 1)) == 0;
    }

    // 5. Подсчет количества единичных битов
    private void countBits() {
        System.out.println("\n5. Количество единичных битов:");

        int number = 13;

        System.out.println("Число: " + number);
        System.out.println("Двоичное представление: " + Integer.toBinaryString(number));
        System.out.println("Количество единичных битов: " + countOneBits(number));


    }

    private int countOneBits(int number) {
        int count = 0;

        while (number != 0) {
            count += number & 1;
            number >>>= 1;
        }

        return count;
    }

    // 6. Обмен значениями через XOR
    private void swapWithoutTemporary() {
        System.out.println("\n6. Обмен двух переменных через XOR:");

        int a = 5;
        int b = 9;

        System.out.println("До обмена: a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("После обмена: a = " + a + ", b = " + b);


    }

}
