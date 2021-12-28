package Task1.figures;

public class Circle implements Figure {

    int radius;
    String nameFig;

    public Circle(int radius, String nameFig) {
        this.radius = radius;
        this.nameFig = nameFig;
    }

    @Override
    public String nameFigure() {
        return nameFig;
    }

    @Override
    public double countPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double countSquare() {
        return Math.PI * radius * radius;
    }
}
