package game;

import java.util.Scanner;

public class task_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int numMonth = scanner.nextInt();

        if (numMonth < 3) {
            System.out.println("Зима");
        } else if (numMonth < 6) {
            System.out.println("Весна");
        } else if ( numMonth < 9) {
            System.out.println("Лето");
        } else if ( numMonth < 12) {
            System.out.println("Осень");
        } else {
            System.out.println("Зима");
        }
    }
}