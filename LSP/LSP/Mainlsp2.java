public class Mainlsp2 {
    public static void main(String[] args) {
        Shape r1 = new Rectangle(5, 4);
        Shape r2 = new Square(5);

        System.out.println("Aire Rectangle = " + r1.getArea()); // 20
        System.out.println("Aire Square = " + r2.getArea());     // 25
    }
}
