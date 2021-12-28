package Task1.apply;

import Task1.figures.Figure;

public class Apply {

    public double countAllPerimeters(Figure[] figures) {
        double summ = 0;
        for (int i = 0; i < figures.length; i++) {
            summ += figures[i].countPerimeter();
        }
        return summ;
    }
}
