package com.brothers.app.Golovach.core.proc.loop.selectionSort;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by EvstifeevAS on 21.09.15.
 * Реализуется сортировка выборкой
 */
public class selectionSort {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[random.nextInt(30)];

        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt(1000);
        }

        System.out.println(Arrays.toString(array));
        System.out.println();

        selection(array);
    }

    private static void selection(int[] array) {
        int tmp, min;

        for (int barrier = 0; barrier < array.length; barrier++) {
            min = array[barrier];
            tmp = barrier;

            for (int index = barrier + 1; index < array.length; index++) {
                if (min > array[index]) {
                    min = array[index];
                    tmp = index;
                }
            }

            array[tmp] = array[barrier];
            array[barrier] = min;

            System.out.println(Arrays.toString(array));
        }

    }
}
