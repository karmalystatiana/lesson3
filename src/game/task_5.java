package game;

import java.util.Scanner;

public class task_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер цвета в радуге");
        int color = scanner.nextInt();

        switch (color) {
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Ораневый");
                break;
            case 3:
                System.out.println("Желтый");
                break;
            case 4:
                System.out.println("Зеленый");
                break;
            case 5:
                System.out.println("Голубой");
                break;
            case 6:
                System.out.println("Синий");
                break;
            case 7:
                System.out.println("Фиолетовый");
                break;
            default:
                break;
        }
    }
}
