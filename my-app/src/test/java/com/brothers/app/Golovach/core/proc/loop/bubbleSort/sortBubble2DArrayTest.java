package com.brothers.app.Golovach.core.proc.loop.bubbleSort;

import com.brothers.app.Golovach.core.proc.loop.bubbleSort.sortBubble2DArray;
import org.junit.Assert;
import java.util.Random;

import static com.brothers.app.Golovach.core.proc.loop.bubbleSort.sortBubble2DArray.*;

/**
 * Created by Admin on 20.09.2015.
 */
public class sortBubble2DArrayTest {

    @org.junit.Test
    public void BubbleSortTest() throws Exception {
        int[][] nullArray = {{}};
        int[][] equal = {{}};
        bubbleSort(nullArray);
        Assert.assertArrayEquals(equal, nullArray);

        int[][] array1Element = {{1}};
        int[][] equal1 = {{1}};
        bubbleSort(array1Element);
        Assert.assertArrayEquals(equal1, array1Element);


        int[][] array2Elements = {{20},{3}};
        int[][] equal2 = {{3},{20}};
        bubbleSort(array2Elements);
        Assert.assertArrayEquals(equal2, array2Elements);
    }

    @org.junit.Test
    public void BubbleSortRandomTest() throws Exception {
        Random random = new Random();

        for (int coutn = 0; coutn < 4; coutn++) {
            int[][] randomArray = new int[random.nextInt(10)][random.nextInt(10)];
            for (int line = 0; line < randomArray.length; line++) {
                for (int column = 0; column < randomArray[0].length; column++) {
                    randomArray[line][column] = random.nextInt(100);
                }
            }
            bubbleSort(randomArray);
        }
    }
}