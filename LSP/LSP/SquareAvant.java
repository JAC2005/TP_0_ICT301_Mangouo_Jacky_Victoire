public class SquareAvant extends RectangleAvant {
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width); // Problème : modifie la hauteur !
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height); // Problème : modifie la largeur !
    }
}
