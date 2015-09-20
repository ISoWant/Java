package com.brothers.app.Golovach.core.proc.loop;

import org.junit.Assert;
import org.junit.Test;

import java.io.OptionalDataException;
import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by Admin on 20.09.2015.
 */
public class InvertMassiveTest {

    @Test
    public void InvertMassiveTest() throws Exception {
        Random random = new Random();

        int[] first = {};
        InvertMassive.invertMassive(first);

        int[] second = {1};
        InvertMassive.invertMassive(second);

        int[] randomArray = new int[random.nextInt(10)];
        for (int column = 0; column < randomArray.length; column++) {
            randomArray[column] = random.nextInt(100);
        }

        System.out.printf(Arrays.toString(randomArray));


        System.out.println();

        InvertMassive.invertMassive(randomArray);


    }
}