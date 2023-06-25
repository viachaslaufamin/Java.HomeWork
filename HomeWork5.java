package homeWork;

public class HomeWork5 {
    public static void main(String[] args) {
        int d1 = 24;
        int d2 = 28;
        int caloris = 40;
        int rezultat = HomeWork5(d1, d2, caloris);
        System.out.println(rezultat);


    }
    public static int HomeWork5(int d1, int d2, int coloris) {
        double r1 = d1 / 2;
        double r2 = d2 / 2;
        double s1 = Math.PI * Math.pow(r1, 2);
        double s2 = Math.PI * Math.pow(r2, 2);
        int coloris1 =(int) s1 * coloris;
        int coloris2 =(int) s2 * coloris;

        int rezultat = coloris2 - coloris1;
        return rezultat;




    }
}


