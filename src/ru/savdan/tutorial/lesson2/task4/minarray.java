package ru.savdan.tutorial.lesson2.task4;

public class minarray {
    public static void main(String[] args) {

        int array[] = new int[6];

        int min;

        array[0] = 758;
        array[1] = 4;
        array[2] = 5;
        array[3] = 1;
        array[4] = 7;
        array[5] = 100;

        min = array[0];

        for (int i = 0; i < 6 ; i++) {
            if(array[i] < min) min = array[i];



        }



        System.out.println(" Минимальный элемент в массиве " + min);



    }
}
