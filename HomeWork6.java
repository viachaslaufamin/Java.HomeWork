package homeWork;

import java.util.Random;

public class HomeWork6 {
    public static void main(String[] args) {
        Random random = new Random();
        int s = random.nextInt(28801);
        System.out.println("Осталось секунд: " + s);
        int h = s / 3600;
        if (h > 1) {
            System.out.println("Осталось " + h + " часов");
        } else if (h == 1) {
            System.out.println("Остался 1 час");
        } else {
            System.out.println("Осталось менее часа");
        }


    }

}


