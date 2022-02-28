package game;

import java.util.Scanner;

public class task_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        if (number % 2 == 1) {
            System.out.println("нечетное");
        } else {
            System.out.println("четное");
        }

    }
}
