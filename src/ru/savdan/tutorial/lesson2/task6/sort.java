package ru.savdan.tutorial.lesson2.task6;

public class sort {
    public static void main(String[] args) {
        int[] array = {1, -20, 12, 3, 6, -2, -99, 122};

        int a, b, c;
        int size;

        size = 8;

        System.out.println(" Исходный массив");
        for (int i = 0; i < size; i++)
            System.out.println(" " + array[i]);
        System.out.println();

        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (array[b - 1] > array[b]) {

                    c = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = c;
                }
            }

        System.out.println(" Отсортированный массив : ");
        for (int i = 0; i < size; i++)
            System.out.println(" " + array[i]);
    }
}




