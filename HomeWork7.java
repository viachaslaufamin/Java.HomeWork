package homeWork;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int i = sc.nextInt();
        if (i % 2 == 0 )
            System.out.println("Число " + i + " четное");
        else
            System.out.println("Число " + i + " не четное");
        sc.close();
    }
}
