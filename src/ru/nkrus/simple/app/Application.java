package ru.nkrus.simple.app;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int day;
        int month;
        int year;

        System.out.println("Здравствуйте, я могу посчитать сколько дней прошло с вашего дня рождения ");
        // Тут хотелось бы чтобы просто Enter нажать и перешло дальше
        // Но могу сделать да или нет :)

        System.out.println("Введите пожалуйста дату вашего дня рождения: ");

        System.out.println("День: ");

        day = myScanner.nextInt();

        System.out.println("Месяц: ");

        month = myScanner.nextInt();

        System.out.println("Год: ");

        year = myScanner.nextInt();

        System.out.println("Ваш день рождения  : " + day + "." + month + "." + year );
        System.out.println("Дней прошло : " );
        // Никак не пойму как написать, чтобы считались прошедшие дни от определённой даты, в гугл лесть не хочу
        // А как посчитать через калькулятор ,хз

    }
}
