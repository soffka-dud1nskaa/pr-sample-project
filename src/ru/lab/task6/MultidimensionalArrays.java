package ru.lab.task6;
import java.util.Arrays;
public class MultidimensionalArrays {
    public void run() {
        System.out.println("\n=== Задание №6: Многомерные массивы ===");

        createMatrix();
        calculateMatrixSum();
        findMatrixMax();
        transposeMatrix();
        printDiagonal();
    }

    // 1. Создание и вывод матрицы
    private void createMatrix() {
        System.out.println("\n1. Создание и вывод матрицы:");

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        printMatrix(matrix);
    }

    // 2. Сумма всех элементов
    private void calculateMatrixSum() {
        System.out.println("\n2. Сумма элементов матрицы:");

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println("Сумма = " + sum);
    }

    // 3. Поиск максимального элемента
    private void findMatrixMax() {
        System.out.println("\n3. Максимальный элемент:");

        int[][] matrix = {
                {1, 8, 3},
                {4, 5, 6},
                {7, 2, 9}
        };

        int max = matrix[0][0];

        for (int[] row : matrix) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }

        System.out.println("Максимум = " + max);
    }

    // 4. Транспонирование матрицы
    private void transposeMatrix() {
        System.out.println("\n4. Транспонирование матрицы:");

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("Исходная матрица:");
        printMatrix(matrix);

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transposed = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        System.out.println("Транспонированная матрица:");
        printMatrix(transposed);
    }

    // 5. Главная диагональ
    private void printDiagonal() {
        System.out.println("\n5. Главная диагональ:");

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.print("Главная диагональ: ");

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println();
    }

    private void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

}