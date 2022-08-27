package main;

import classs.Dayses;
import enums.Days;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dayses dayses = new Dayses(
                Days.MONDAY,
                Days.TUESDAY,
                Days.WEDNESDAY,
                Days.THURSDAY,
                Days.FRIDAY,
                Days.SATURDAY,
                Days.SUNDAY
        );
        while (true) {
            System.out.println("Кунду жазыныз!");
            String word = sc.nextLine();
            switch (word.toUpperCase()) {
                case "monday" -> System.out.println(dayses.getMonday().name()+"\n"+dayses.getMonday());
                case "tuesday" -> System.out.println(dayses.getTuesday().name()+"\n"+dayses.getTuesday());
                case "wednesday" -> System.out.println(dayses.getWednesday().name()+"\n"+dayses.getWednesday());
                case "thursday" -> System.out.println(dayses.getThursday().name()+"\n"+dayses.getThursday());
                case "friday" -> System.out.println(dayses.getFriday().name()+"\n"+dayses.getFriday());
                case "saturday" -> System.out.println(dayses.getSaturday().name()+"\n"+dayses.getSaturday());
                case "sunday" -> System.out.println(dayses.getSunday().name()+"\n"+dayses.getSunday());
                default -> System.out.println("Мындай кун жок!");
            }
        }





















    }
}
