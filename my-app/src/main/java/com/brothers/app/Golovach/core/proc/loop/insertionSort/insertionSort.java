package com.brothers.app.Golovach.core.proc.loop.insertionSort;

/**
 * Created by Admin on 21.09.2015.
 * Реализуется сортировка вставкой
 */
import java.util.Arrays;
import java.util.Random;

public class insertionSort {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[random.nextInt(10)];

        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));
        System.out.println();

        insertion(array);

        System.out.println(Arrays.toString(array));
    }

    public static void insertion(int[] array) {
        int newElem, tmp;

        for (int barrier = 1; barrier < array.length; barrier++) {
            newElem = array[barrier];

            if (newElem < array[barrier - 1]) {
                tmp = Arrays.binarySearch(array, 0, barrier, newElem);

                if (tmp < 0) {
                    tmp = (-tmp) - 1;
                }

                System.arraycopy(array, tmp, array, tmp + 1, barrier - tmp);
                array[tmp] = newElem;
            }
        }
    }
}
