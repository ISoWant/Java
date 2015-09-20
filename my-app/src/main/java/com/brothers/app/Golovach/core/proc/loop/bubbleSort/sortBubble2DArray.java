package com.brothers.app.Golovach.core.proc.loop.bubbleSort;

/**
 * Created by Admin on 20.09.2015.
 */

import java.util.Random;

public class sortBubble2DArray {
    public static void main(String[] args) {
        Random random = new Random();

        int countLine = random.nextInt(10);
        int countColumn = random.nextInt(10);
        int[][] matrix = new int[countLine][countColumn];

        System.out.printf("Заполним рандомными значениями массив размерностью matrix[%d][%d]\n\n", countLine, countColumn);

        for (int line = 0; line < countLine; line++) {
            for (int column = 0; column < countColumn ; column++) {
                matrix[line][column] = random.nextInt(100);
                System.out.printf("%4d", matrix[line][column]);
            }
            System.out.println();
        }

        System.out.println("Теперь отсортируем этот массив:");

        bubbleSort(matrix);


    }
/**
 * Реализую сортировку пузырьком двумерного массива
 * и вывожу на экран
 */
    public static void bubbleSort(int[][] matrix) {
        int tmp;
        int next;
        int border;

        if (matrix.length != 0 && matrix[0].length != 0) {
            border = matrix.length * matrix[0].length;
        }
        else {
            border = 0;
        }

        for (int barrier = border; barrier > 0; barrier--) {
            for (int line = 0; line < matrix.length; line++) {

                if (line != 0) {
                    if (matrix[line - 1][matrix[0].length - 1] > matrix[line][0]) {
                        tmp = matrix[line - 1][matrix[0].length - 1];
                        matrix[line - 1][matrix[0].length - 1] = matrix[line][0];
                        matrix[line][0] = tmp;
                    }
                }

                for (int column = 0; column < matrix[0].length - 1; column++) {
                    next = column + 1;

                    if (matrix[line][column] > matrix[line][next]) {
                        tmp = matrix[line][column];
                        matrix[line][column] = matrix[line][next];
                        matrix[line][next] = tmp;
                    }
                }
            }
        }

        for (int line = 0; line < matrix.length; line++) {
            for (int column = 0; column < matrix[0].length; column++) {
                System.out.printf("%4d", matrix[line][column]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
