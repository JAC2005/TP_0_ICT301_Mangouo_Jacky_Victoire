public class AreaCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof RectangleAvant) {
            RectangleAvant r = (RectangleAvant) shape;
            return r.getWidth() * r.getHeight();
        } else if (shape instanceof CircleAvant) {
            CircleAvant c = (CircleAvant) shape;
            return Math.PI * c.getRadius() * c.getRadius();
        }
        throw new IllegalArgumentException("Forme inconnue");
    }
}
