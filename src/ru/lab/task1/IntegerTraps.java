package ru.lab.task1;
public class IntegerTraps {
    public void run() {
        System.out.println("=== Задание №1: Целочисленные ловушки ===");

        minMaxValues();
        integerOverflow();
        multiplicationOverflow();
        integerDivision();
        longToInt();
        charArithmetic();
        checkAdditionOverflow();
    }

    // 1. Мин и макс значения целочисл-ых типов
    private void minMaxValues() {
        System.out.println("\n1. Минимальные и максимальные значения:");

        System.out.println("byte:  min = " + Byte.MIN_VALUE
                + ", max = " + Byte.MAX_VALUE);

        System.out.println("short: min = " + Short.MIN_VALUE
                + ", max = " + Short.MAX_VALUE);

        System.out.println("int:   min = " + Integer.MIN_VALUE
                + ", max = " + Integer.MAX_VALUE);

        System.out.println("long:  min = " + Long.MIN_VALUE
                + ", max = " + Long.MAX_VALUE);

    }

    // 2. Прибавление 1 к Integer.MAX_VALUE
    private void integerOverflow() {
        System.out.println("\n2. Переполнение int:");

        int value = Integer.MAX_VALUE;
        int result = value + 1;

        System.out.println("Integer.MAX_VALUE = " + value);
        System.out.println("Integer.MAX_VALUE + 1 = " + result);

    }

    // 3. Integer.MAX_VALUE * 2 в int и long
    private void multiplicationOverflow() {
        System.out.println("\n3. Умножение Integer.MAX_VALUE на 2:");

        int intResult = Integer.MAX_VALUE * 2;
        long longResult = (long) Integer.MAX_VALUE * 2;

        System.out.println("В int:  " + intResult);
        System.out.println("В long: " + longResult);


    }

    // 4. Целочисленное деление и остаток
    private void integerDivision() {
        System.out.println("\n4. Деление и остаток:");

        System.out.println("5 / 2 = " + (5 / 2));
        System.out.println("-5 / 2 = " + (-5 / 2));
        System.out.println("5 % 2 = " + (5 % 2));
        System.out.println("-5 % 2 = " + (-5 % 2));


    }

    // 5. Приведение большого long к int
    private void longToInt() {
        System.out.println("\n5. Приведение long к int:");

        long bigValue = (long) Integer.MAX_VALUE + 1;
        int result = (int) bigValue;

        System.out.println("long-значение = " + bigValue);
        System.out.println("После приведения к int = " + result);


    }

    // 6. Арифметика над char
    private void charArithmetic() {
        System.out.println("\n6. Арифметика над char:");

        char first = 'A';
        char next = (char) (first + 1);

        char firstSymbol = 'A';
        char secondSymbol = 'B';

        int sum = firstSymbol + secondSymbol;

        System.out.println("'A' + 1 = " + next);
        System.out.println("'A' + 'B' как число = " + sum);
        System.out.println("'A' + 'B' как символ = " + (char) sum);


    }

    // 7. Проверка переполнения при сложении двух int
    private void checkAdditionOverflow() {
        System.out.println("\n7. Проверка переполнения при сложении:");

        int a = Integer.MAX_VALUE;
        int b = 1;

        System.out.println(a + " + " + b + " -> переполнение: "
                + additionOverflows(a, b));

        a = 100;
        b = 200;

        System.out.println(a + " + " + b + " -> переполнение: "
                + additionOverflows(a, b));


    }

    private boolean additionOverflows(int a, int b) {
        long sum = (long) a + b;

        return sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE;
    }
}
