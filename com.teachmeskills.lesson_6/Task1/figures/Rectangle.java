package Task1.figures;

public class Rectangle implements Figure {

    int width;
    int length;
    String nameFig;

    public Rectangle(int width, int length, String nameFig) {
        this.width = width;
        this.length = length;
        this.nameFig = nameFig;
    }

    @Override
    public String nameFigure() {
        return nameFig;
    }

    @Override
    public double countPerimeter() {
        return ((width + length) * 2);
    }

    @Override
    public double countSquare() {
        return width * length;
    }
}
