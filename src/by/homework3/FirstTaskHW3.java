package by.homework3;

import java.util.Random;

public class FirstTaskHW3 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int numbers1 = random.nextInt(1000);
            String str = String.valueOf(numbers1);
            System.out.print(str + " ");
        }
        System.out.println();
        //StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            int numbers2 = random.nextInt(1000);
            stringBuilder.append(numbers2).append(" ");
        }
        System.out.print(stringBuilder);
    }
}
