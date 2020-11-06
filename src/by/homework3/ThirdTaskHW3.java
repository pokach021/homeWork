package by.homework3;

import java.util.Date;
import java.util.Scanner;

public class ThirdTaskHW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your age");
        String age = scanner.nextLine();
        Date date = new Date();
        String message = String.format("Hello %1$s. Today is %2$tD. And u are %3$s years old",
                name,
                date,
                age);
        System.out.println(message);
    }
}
