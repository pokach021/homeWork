package com.company;

import java.util.Scanner;

public class FTask {
    public static void main(String[] args) {
        System.out.println("Введите первое число (a): ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Введите второе число (b): ");
        int b = scan.nextInt();
        if (a - (a * 0.1) <= b && b <= a + (a * 0.1)) {
            System.out.println("Число a близкое к числу b");
        } else {
            System.out.println("Число a не близкое к числу b");
        }
    }
}
