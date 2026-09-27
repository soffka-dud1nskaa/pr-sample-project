package ru.lab.task7;
public class MethodsArguments {
    public void run() {
        System.out.println("\n=== Задание №7: Методы и аргументы ===");

        calculateSum();
        findMaximum();
        changePrimitive();
        changeArray();
        useVarargs();
    }

    // 1. Метод с двумя параметрами
    private void calculateSum() {
        System.out.println("\n1. Метод с параметрами:");

        int a = 10;
        int b = 20;

        int result = sum(a, b);

        System.out.println(a + " + " + b + " = " + result);
    }

    private int sum(int a, int b) {
        return a + b;
    }

    // 2. Метод поиска максимума
    private void findMaximum() {
        System.out.println("\n2. Поиск максимального:");

        int a = 15;
        int b = 7;
        int c = 23;

        int maximum = max(a, b, c);

        System.out.println(
                "Максимум из " + a + ", " + b + ", " + c + " = " + maximum
        );
    }

    private int max(int a, int b, int c) {
        int result = a;

        if (b > result) {
            result = b;
        }

        if (c > result) {
            result = c;
        }

        return result;
    }

    // 3. Передача примитива в метод
    private void changePrimitive() {
        System.out.println("\n3. Передача примитива:");

        int number = 10;

        System.out.println("До вызова метода: " + number);

        changeNumber(number);

        System.out.println("После вызова метода: " + number);


    }

    private void changeNumber(int number) {
        number = 100;
    }

    // 4. Передача массива в метод
    private void changeArray() {
        System.out.println("\n4. Передача массива:");

        int[] numbers = {1, 2, 3};

        System.out.println("До вызова метода:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        changeArrayElements(numbers);

        System.out.println("\nПосле вызова метода:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
    }

    private void changeArrayElements(int[] numbers) {
        numbers[0] = 100;
    }

    // 5. Переменное количество аргументов
    private void useVarargs() {
        System.out.println("\n5. Varargs:");

        int result1 = sumAll(1, 2, 3);
        int result2 = sumAll(10, 20, 30, 40);

        System.out.println("Сумма 1, 2, 3 = " + result1);
        System.out.println("Сумма 10, 20, 30, 40 = " + result2);
    }

    private int sumAll(int... numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

}