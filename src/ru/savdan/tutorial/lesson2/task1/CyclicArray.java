package ru.savdan.tutorial.lesson2.task1;

import java.util.Scanner;

public class CyclicArray {

    public static void main(String[] args) {

          System.out.println("Введите число, а я передвину массив: ");
          Scanner in = new Scanner(System.in);
          int shift = in.nextInt();



        int array[] = new int[5];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        for (int i = 0; i < array.length + shift >> 1; i++) {
            System.out.println(array[i]);
        }

    }
}

