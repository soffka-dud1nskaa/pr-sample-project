package ru.lab.task2;
public class FloatingPoint {
    public void run() {
        System.out.println("\n=== Задание №2: Вещественная арифметика ===");

        floatingPointError();
        compareWithOne();
        compareWithEpsilon();
        specialValues();
        rounding();
        floatAndDouble();
    }

    // 1. Почему 0.1 + 0.2 не равно точно 0.3
    private void floatingPointError() {
        System.out.println("\n1. Особенности вещес-ной арифметики:");

        double a = 0.1;
        double b = 0.2;
        double result = a + b;

        System.out.println("0.1 + 0.2 = " + result);
        System.out.println("0.3 = " + 0.3);


    }

    // 2. Сложение 0.1 десять раз
    private void compareWithOne() {
        System.out.println("\n2. Сложение 0.1 десять раз:");

        double value = 0.0;

        for (int i = 0; i < 10; i++) {
            value += 0.1;
        }

        System.out.println("Результат = " + value);
        System.out.println("Результат == 1.0: " + (value == 1.0));


    }

    // 3. Сравнение double с заданной точностью
    private void compareWithEpsilon() {
        System.out.println("\n3. Сравнение double с epsilon:");

        double a = 0.1 + 0.2;
        double b = 0.3;
        double epsilon = 0.000001;

        boolean equal = Math.abs(a - b) < epsilon;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("epsilon = " + epsilon);
        System.out.println("Числа считаются равными: " + equal);


    }

    // 4. Infinity, -Infinity и NaN
    private void specialValues() {
        System.out.println("\n4. Специальные значения:");

        double positiveInfinity = 1.0 / 0.0;
        double negativeInfinity = -1.0 / 0.0;
        double nan = 0.0 / 0.0;

        System.out.println("Infinity = " + positiveInfinity);
        System.out.println("-Infinity = " + negativeInfinity);
        System.out.println("NaN = " + nan);

        System.out.println("NaN == NaN: " + (nan == nan));

    }

    // 5. Сравнение int, round, floor и ceil
    private void rounding() {
        System.out.println("\n5. Округление:");

        double positive = 2.7;
        double negative = -2.7;

        System.out.println("Для 2.7:");
        System.out.println("(int) 2.7 = " + (int) positive);
        System.out.println("Math.round(2.7) = " + Math.round(positive));
        System.out.println("Math.floor(2.7) = " + Math.floor(positive));
        System.out.println("Math.ceil(2.7) = " + Math.ceil(positive));

        System.out.println("\nДля -2.7:");
        System.out.println("(int) -2.7 = " + (int) negative);
        System.out.println("Math.round(-2.7) = " + Math.round(negative));
        System.out.println("Math.floor(-2.7) = " + Math.floor(negative));
        System.out.println("Math.ceil(-2.7) = " + Math.ceil(negative));


    }

    // 6. Сравнение точности float и double
    private void floatAndDouble() {
        System.out.println("\n6. Сравнение float и double:");

        float floatValue = 1.0f / 3.0f;
        double doubleValue = 1.0 / 3.0;

        System.out.println("float:  " + floatValue);
        System.out.println("double: " + doubleValue);


    }

}
