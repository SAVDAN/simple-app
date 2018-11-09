package ru.nkrus.simple.app;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int day1;
        int month1;
        int year1;

        int day2;
        int month2;
        int year2;

        System.out.println("Здравствуйте, я могу посчитать сколько дней прошло с вашего дня рождения ");

        System.out.println("Введите пожалуйста дату вашего дня рождения: ");

        System.out.println("День: ");

        day1 = myScanner.nextInt();

        System.out.println("Месяц: ");

        month1 = myScanner.nextInt();

        System.out.println("Год: ");

        year1 = myScanner.nextInt();

        System.out.println("Введите пожалуйста текущую дату: ");

        System.out.println("День: ");

        day2 = myScanner.nextInt();

        System.out.println("Месяц: ");

        month2 = myScanner.nextInt();

        System.out.println("Год: ");

        year2 = myScanner.nextInt();

        System.out.println("Ваш день рождения  : " + day1 + "." + month1 + "." + year1 );
        System.out.println("Текущая дата  : " + day2 + "." + month2 + "." + year2 );

        int total = (day1 * 24) * 60;
        int total2 = (day2 * 24) * 60;
        int delta = total2 - total;
        int deltaDays = (delta / 60) / 24;



        System.out.println(deltaDays);







    }
}
