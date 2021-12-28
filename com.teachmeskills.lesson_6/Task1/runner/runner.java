package Task1.runner;

import Task1.figures.Figure;
import Task1.figures.Circle;
import Task1.figures.Rectangle;
import Task1.figures.Triangle;
import Task1.apply.Apply;


public class runner {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(5, 5, 6, 4, "Треугольник");

        Rectangle rectangle = new Rectangle(9, 9, "Прямоугольник");

        Circle circle1 = new Circle(8, "Круг1");

        Circle circle2 = new Circle(4, "Круг2");

        Circle circle3 = new Circle(5, "Круг3");

        Figure[] arrayFigure = new Figure[]{triangle, rectangle, circle1, circle2, circle3};

        for (Figure h : arrayFigure) {
            System.out.println("Площадь фигуры - " + h.nameFigure() + " = " + h.countSquare());
            System.out.println("Периметр фигуры - " + h.nameFigure() + " = " + h.countPerimeter());
        }

        Apply apply = new Apply();
        System.out.println("Сумма периметров всех фигур = " + apply.countAllPerimeters(arrayFigure));

    }
}
