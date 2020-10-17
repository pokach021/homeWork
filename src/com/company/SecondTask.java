package com.company;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = 1;
        int c = 10;
        char infinity = '\u221e';
        if (a <= 1) {
            System.out.println("число а относится к диапазону (-" + infinity + ":" + b + "]");
        } else if (a > 1 && a < 10) {
            System.out.println("число а относится к диапазону (" + b + ":" + c + ")");
        } else {
            System.out.println("число а относится к диапазону [" + c + ":+" + infinity + ")");
        }
    }
}
