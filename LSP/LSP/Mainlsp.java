public class Mainlsp {
    public static void main(String[] args) {
        RectangleAvant r = new SquareAvant();
        r.setWidth(5);
        r.setHeight(4);
        // On s'attend à une aire de 20, mais on obtient 16 !
        System.out.println("Aire = " + r.getArea()); // → 16 (incorrect)
    }
}
