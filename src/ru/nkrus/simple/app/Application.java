package ru.nkrus.simple.app;

import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.*;

public class Application {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int day;
        int month;
        int year;

        System.out.println("Здравствуйте, я могу посчитать сколько дней прошло с вашего дня рождения ");

        System.out.println("Введите пожалуйста дату вашего дня рождения: ");

        System.out.println("День: ");

        day = myScanner.nextInt();

        System.out.println("Месяц: ");

        month = myScanner.nextInt();

        System.out.println("Год: ");

        year = myScanner.nextInt();

        System.out.println("Ваш день рождения  : " + day + "." + month + "." + year );
        System.out.println("Дней прошло : " );

        //Теперь проблема в другом, полазия по форумам, я понял, что к чему.

        String date1 = "18.10.2018";
        String date2 = "23.4.1996"; // Тут хотел сделать , чтобы принимало значение day и т.д (но не работает)

        SimpleDateFormat format = new  SimpleDateFormat("dd.MM.yyyy");

        Date dateToday = null;
        Date dateHB = null;

        try {
            dateToday = format.parse(date1);
            dateHB = format.parse(date2);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        long difference = dateToday.getTime() - dateHB.getTime();

        int days =  (int)(difference / (24 * 60 * 60 * 1000));

        System.out.println(days + " дн.");




    }
}
