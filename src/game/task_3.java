package game;

import java.util.Scanner;

public class task_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int numMonth = scanner.nextInt();
        int a = numMonth % 2;

        if(a > 0) {
            System.out.println("нечетное");
        } else{
            System.out.println("четное");
        }

    }
}
