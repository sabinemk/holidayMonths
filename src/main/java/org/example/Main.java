package org.example;

//month, date, the holiday itself
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("hi, please choose the country");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine().toLowerCase().trim();

        List<Holiday> holidays = new ArrayList<>();

        holidays.add(new Holiday(LocalDate.of(2023, Month.JANUARY, 1), "New Year's Day"));
        holidays.add(new Holiday(LocalDate.of(2023, Month.MARCH, 30), "Good Friday"));
        holidays.add(new Holiday(LocalDate.of(2023, Month.APRIL, 2), "Easter Sunday"));
        holidays.add(new Holiday(LocalDate.of(2023, Month.APRIL, 3), "Easter Monday"));
        holidays.add(new Holiday(LocalDate.of(2023, Month.MAY, 1), "Labour Day"));
        holidays.add(new Holiday(LocalDate.of(2023, Month.MAY, 4), "Declaration of Independence Day"));
        holidays.add(new Holiday(LocalDate.of(2023, Month.JUNE, 24), "Midsummer Eve"));
        holidays.add(new Holiday(LocalDate.of(2023, Month.JUNE, 23), "Midsummer Day"));
        holidays.add(new Holiday(LocalDate.of(2023, Month.NOVEMBER, 18), "Latvian National Day"));
        holidays.add(new Holiday(LocalDate.of(2023, Month.DECEMBER, 24), "Christmas Eve"));
        holidays.add(new Holiday(LocalDate.of(2023, Month.DECEMBER, 25), "Christmas Day"));
        holidays.add(new Holiday(LocalDate.of(2023, Month.DECEMBER, 26), "Second Day of Christmas"));

        if (choice.equals("latvia")) {
            System.out.println("please choose the month");
            String choiceMonth = scanner.nextLine();

            Month month = Month.valueOf(choiceMonth.toUpperCase());

            List<Holiday> chosenHoliday = new ArrayList<>();

            for (Holiday currentHoliday: holidays){
                if (currentHoliday.getDate().getMonth() == month){
                    chosenHoliday.add(currentHoliday);
                }

            }
            System.out.println(chosenHoliday);


        } else if (choice.equals("lithuania")) {


        } else {
            System.out.println("sorry, you can only choose Baltic language countries :)");
        }




    }
}