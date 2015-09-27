package com.brothers.app.Golovach.core.proc.loop;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Admin on 27.09.2015.
 */
public class RandArr {

    /**
     * ����� ������ ������ �������� �����, ��������� �� ��������� ����� (int) � �������� ��������� ���������.
     * � ������� ��������� ������ �� �����
     * @param dimension - ����������� ������������ �������, ���� = 0, �� ����������� ����� ������ ��������� ������� �� 5 �� 15;
     * @param minValue - ����������� ���������� �������� ��� ��������� �������;
     * @param maxValue - ����������� ���������� �������� ��� ��������� �������;
     * @return ��������� ������ ���� int[];
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
