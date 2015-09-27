package com.brothers.app.Golovach.core.proc.loop.Merger;

import com.brothers.app.Golovach.core.proc.loop.RandArr;
import com.brothers.app.Golovach.core.proc.loop.insertionSort.insertionSort;

import java.util.Arrays;

/**
 * Created by Admin on 26.09.2015.
 */
public class Merger {
    public static void main(String[] args) {

        int aDimension = 15;
        int bDimension = 10;

        int[] aArray = new int[aDimension];
        System.arraycopy(RandArr.RandomArray(aDimension, 10, 100), 0, aArray, 0, aDimension);
        int[] bArray = new int[bDimension];
        System.arraycopy(RandArr.RandomArray(bDimension, 10, 20), 0, bArray, 0, bDimension);

        insertionSort.insertion(aArray);
        insertionSort.insertion(bArray);

        System.out.println("Отсортированные массивы");
        System.out.println(Arrays.toString(aArray));
        System.out.println(Arrays.toString(bArray));

        System.out.println("Массив полученный слиянием:");
        System.out.println(Arrays.toString(merger(aArray, bArray)));

    }

    /**
     * Слияние двух отсортированных массивов
     * @param aArray - первый массив
     * @param bArray - второй массив
     * @return - отсортированный массив полученный слиянием массивов aArray и bArray
     */
    public static int[] merger(int[] aArray, int[] bArray) {
        int[] result = new int[aArray.length + bArray.length];
        int aIndex = 0;
        int bIndex = 0;

        if (aArray.length == 0 || bArray.length == 0) {                         //Если один из массивов нулевой длины, то
            System.arraycopy(aArray, 0, result, 0, aArray.length);              //в result копируется второй массив
            System.arraycopy(bArray, 0, result, 0, bArray.length);
        } else if (aArray[0] >= bArray[bArray.length - 1]) {
            System.arraycopy(bArray, 0, result, 0, bArray.length);
            System.arraycopy(aArray, 0, result, bArray.length, aArray.length);
        } else if (bArray[0] >= aArray[aArray.length - 1]) {
            System.arraycopy(aArray, 0, result, 0, aArray.length);
            System.arraycopy(bArray, 0, result, aArray.length, bArray.length);
        } else {
            while (aIndex + bIndex != result.length) {
                if (aArray[aIndex] <= bArray[bIndex]) {
                    result[aIndex + bIndex] = aArray[aIndex++];
                } else {
                    result[aIndex + bIndex] = bArray[bIndex++];
                }

                if (aIndex == aArray.length) {
                    System.arraycopy(bArray, bIndex, result, aIndex + bIndex, bArray.length - bIndex);
                    bIndex = bArray.length;
                } else if (bIndex == bArray.length) {
                    System.arraycopy(aArray, aIndex, result, aIndex + bIndex, aArray.length - aIndex);
                    aIndex = aArray.length;
                }

            }
        }

        return result;
    }


}
