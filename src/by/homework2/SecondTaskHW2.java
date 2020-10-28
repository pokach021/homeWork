package by.homework2;

import java.util.Scanner;

public class SecondTaskHW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthNumber;
        while (true) {
            System.out.println("Enter month number");
            monthNumber = scanner.nextInt();
            if (monthNumber > 0 && monthNumber <= 12) {
                break;
            }
            System.out.println("No month with this number");
        }
        System.out.println("Enter day number");
        int dayNumber = scanner.nextInt();
        int size = 30;
        if (monthNumber % 2 != 0 && monthNumber <= 7) {
            size = 31;
        } else if (monthNumber == 2) {
            size = 28;
        } else if (monthNumber % 2 == 0 && monthNumber > 7) {
            size = 31;
        }
        int[] month = new int[size];
        int count = 0;
        for (int i = 0; i < month.length; i++) {
            month[i] = i + 1;
            count++;
            if (month[i] == dayNumber) {
                System.out.println("There is this day this month");
                break;
            } else if (count == month.length) {
                System.out.println("There is not this day this month");
            }
        }
    }
}
