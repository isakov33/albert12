package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] array = {1.1, -2.3, 5.4, 9.5, -3.6, 1.7, 1.8, -4.8, 2.4, 4.5, 3.2, 7.6, 6.5, -1.2, 1.2, -3.2};
        double sum = 0;
        int counter = 0;
        for (int i = 3; i < array.length; i++) {
            if (array[i] > 0) {
                sum = sum + array[i];
                counter++;
            }
        }
        System.out.print("колво чисел после первого отрицательного" + counter);
        System.out.println("среднее значение положительных чисел =" + sum / counter);


            int[] aray = new int[]{2, -3, 6, 5, -1, 8};
            Arrays.sort(aray);
            System.out.println(Arrays.toString(aray));

        }
    }






