package Task1.figures;

public class Triangle implements Figure {

    int side1;//сторона 1
    int side2;//сторона 2
    int side3;//основание треугольника
    int high;
    String nameFig;


    public Triangle(int side1, int side2, int side3, int high, String nameFig) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.high = high;
        this.nameFig = nameFig;
    }

    @Override
    public String nameFigure() {
        return nameFig;
    }

    @Override
    public double countPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double countSquare() {
        return 0.5 * high * side3;
    }
}
