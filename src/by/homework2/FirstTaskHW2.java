package by.homework2;

import java.util.Scanner;

public class FirstTaskHW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pyramid size:");
        int size = scanner.nextInt();
        int[][] pyramid = new int[size][size];
        int step = 0;
        if (size % 2 != 0) {
            while (step <= size / 2) {
                for (int i = step; i < pyramid.length - step; i++) {
                    for (int j = step; j < pyramid.length - step; j++) {
                        pyramid[i][j] = step + 1;
                    }
                }
                step++;
            }
        } else {
            while (step < size / 2) {
                for (int i = step; i < pyramid.length - step; i++) {
                    for (int j = step; j < pyramid.length - step; j++) {
                        pyramid[i][j] = step + 1;
                    }
                }
                step++;
            }
        }
        for (int i = 0; i < pyramid.length; i++) {
            System.out.println();
            for (int j = 0; j < pyramid[i].length; j++) {
                System.out.print(pyramid[i][j] + "\t");
            }
        }
    }
}
