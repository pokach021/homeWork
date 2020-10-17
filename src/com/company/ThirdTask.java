package com.company;

public class ThirdTask {
    public static void main(String[] args) {
        int a = 21;
        int b = 15;
        int c = 11;
        if (a > b) {
            if (a > c) {
                System.out.println("Максимальное число " + a);
            } else {
                System.out.println("Максимальное число " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Максимальное число " + b);
            } else {
                System.out.println("Максимальное число " + c);
            }
        }
        if (a < b) {
            if (a < c) {
                System.out.println("Минимальное число " + a);
            } else {
                System.out.println("Минимальное число " + c);
            }
        } else {
            if (b < c) {
                System.out.println("Минимальное число " + b);
            } else {
                System.out.println("Минимальное число " + c);
            }
        }
        double srA;
        srA = (double) (a + b + c) / 3;
        System.out.println("Среднее арифметичесое всех чисел " + srA);
    }

}
