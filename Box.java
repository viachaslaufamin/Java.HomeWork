package homeWork;
public class Box {
        public double width;

        public double height;

        public double longs;

        public Box(double width, double height, double longs) {
                width = width;
                height = height;
                longs = longs;

                System.out.println("width = " + width);
                System.out.println("height = " + height);
                System.out.println("long = " + longs);

                System.out.println("Объема бокса:");
                double rezultat = width * height * longs;
                System.out.println(rezultat + " m3");
        }
}
