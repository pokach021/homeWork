package by.homework2;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        System.out.println("Enter your number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        int numberComputer;
        do {
            numberComputer = (int) (Math.random() * 101);
            count++;
        } while (number != numberComputer);
        System.out.println("You entered the number: " + numberComputer + ".");
        System.out.println("Number of attempts: " + count + ".");
    }
}
