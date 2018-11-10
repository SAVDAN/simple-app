package ru.savdan.tutorial.lesson2.task3;


public class arrayminmax {
    public static void main(String[] args) {

        int array[] = new int[6];

        int min;
        int max;
        int sum = 0;   // Тут мне айдиа предложила прировнять к нулю и тогда заработало. Тут не понял

        array[0] = 2;
        array[1] = 4;
        array[2] = 5;
        array[3] = 6;
        array[4] = 7;
        array[5] = 100;

        min = max = array[0];

        for (int i = 0; i < 6 ; i++) {
            if(array[i] < min) min = array[i];
            if(array[i] > max) min = array[i];

            sum = (min + max) / 2;

        }



        System.out.println(" Среднее арифметическое " + sum);



        }
    }
