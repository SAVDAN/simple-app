package ru.savdan.tutorial.lesson2.task2;

import java.util.Scanner;


public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Введите число, а я выведу все простые числа: ");
        Scanner in = new Scanner(System.in);
        int numb = in.nextInt();
        boolean b = true;
        for (int а = 2; а <= numb; а++) {
            for (int i = 2; i < а; i++) {
                if (а % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.println(а);          // Вот эта часть у меня не получалась, подсмотрел в инете
            else b = true;                         // Не понимал, почему выводит , не то что нужно
                                                   // Чёт у меня не коммитит(Намудрил
                                                   //  НАмудрил, лол
        }
    }
}
