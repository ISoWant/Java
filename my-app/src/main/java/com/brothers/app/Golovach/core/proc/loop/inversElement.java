package com.brothers.app.Golovach.core.proc.loop;


import java.util.Arrays;
import java.util.Random;

/**
 * Created by EvstifeevAS on 21.09.15.
 * Берёт по два элемента массива и меняет их местами, если первый больше второго
 */
public class inversElement {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[random.nextInt(20)];

        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt(500);
        }

        System.out.println(Arrays.toString(array));

        inversion(array);

        System.out.println(Arrays.toString(array));

    }

    private static void inversion(int[] array) {
        int tmp, nextIndex;
        for (int index = 0; index < array.length - 1; index += 2) {
            nextIndex = index + 1;

            if (array[index] > array[nextIndex]) {
                tmp = array[index];
                array[index] = array[nextIndex];
                array[nextIndex] = tmp;
            }
        }
    }
}
