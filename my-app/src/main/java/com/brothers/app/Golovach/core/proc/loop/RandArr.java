package com.brothers.app.Golovach.core.proc.loop;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Admin on 27.09.2015.
 */
public class RandArr {

    /**
     * Метод создаёт массив заданной длины, состоящий из случайных чисел (int) в пределах заданного диапазона.
     * и выводит созданный массив на экран
     * @param dimension - размерность создаваемого массива, если = 0, то размерность будет задана случайным образом от 5 до 15;
     * @param minValue - минимальное допустимое значение для элементов массива;
     * @param maxValue - максимально допустимое значение для элементов массива;
     * @return Созданный массив типа int[];
     */
    public static int[] RandomArray(int dimension, int minValue, int maxValue) {
        Random random = new Random(System.currentTimeMillis());

        if (dimension == 0) {
            dimension = random.nextInt(10) + 5;
        }

        int[] array = new int [dimension];

        for (int index = 0; index < dimension; index++) {
            array[index] = random.nextInt(maxValue - minValue) + minValue;
        }

        System.out.println(Arrays.toString(array));

        return array;
    }
}
