package by.homework3;

import java.util.Random;

public class FirstTaskHW3 {
    public static void main(String[] args) {
        Random random = new Random();
        String str = "";
        for (int i = 0; i < 100; i++) {
            int numbers1 = random.nextInt(1000);
            str += numbers1 + " ";

        }
        System.out.print(str + " ");
        System.out.println();
        String regex = "\\b\\d{2}\\b";
        System.out.println(str.replaceAll(regex, "-1") + " ");
        //StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            int numbers2 = random.nextInt(1000);
            stringBuilder.append(numbers2).append(" ");
        }
        System.out.print(stringBuilder);
    }
}
