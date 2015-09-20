package com.brothers.app.Golovach.core.proc.loop;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Admin on 20.09.2015.
 */
public class InvertMassive {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int [random.nextInt(10)];

        for (int column = 0; column < array.length; column++) {
            array[column] = random.nextInt(100);
            System.out.printf("%4d", array[column]);
        }
        System.out.println();

        invertMassive(array);


    }

    public static void invertMassive(int[] array) {
        int tmp;

        for (int column = 0; column < array.length / 2; column++) {
            tmp = array[column];
            array[column] = array[(array.length - 1) - column];
            array[(array.length - 1) - column] = tmp;
        }

        System.out.println(Arrays.toString(array));
    }
}
