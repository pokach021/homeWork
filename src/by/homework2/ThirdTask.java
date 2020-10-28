package by.homework2;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer;
        int count = 4;
        do {
            System.out.println("Чему равняется выражение 2+2*2 ?");
            System.out.println("Выбереите правильный вариант ответа.");
            System.out.println("У вас осталось " + count + " попытки.");
            System.out.println("1) 6; 2) 5; 3) 8; 4) Сдаться");
            answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    System.out.println("Вы ответили правильно!");
                    break;
                case 2:
                case 3:
                    System.out.println("Вы ответили неправильно!");
                    break;
                case 4:
                    System.out.println("Вы сдались!");
                    break;
                default:
                    System.out.println("Вы ввели некорректный вариант!");

            }
            count--;
            if (count == 0) {
                System.out.println("У вас закончились попытки!");
            }
        }
        while (answer != 1 && answer != 4 && count != 0);
    }
}
