package homeWork;

import java.util.Scanner;

public class Box {
        public double width;

        public double height;

        public double longs;

        public Box(double width, double height, double longs) {
                Scanner sc = new Scanner(System.in);
                width = width;
                height = height;
                longs = longs;

                System.out.println("width = " + width);
                System.out.println("height = " + height);
                System.out.println("long = " + longs);

                System.out.println("Объема бокса:");
                double rezultat = width * height * longs;
                System.out.println(rezultat + " m3");

                System.out.println("Введите значения ширины: ");
                Double w = sc.nextDouble();
                System.out.println("Введите значения высоты: ");
                double h = sc.nextDouble();
                System.out.println("Введите значения длинны: ");
                double l = sc.nextDouble();
                double rezultat2 = w * h * l;
                System.out.println(rezultat2 + " m3");




        }
}
