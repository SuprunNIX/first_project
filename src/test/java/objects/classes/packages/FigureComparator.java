package objects.classes.packages;

import java.util.Comparator;

public class FigureComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Figure f1 = (Figure) o1;
        Figure f2 = (Figure) o2;

        while (f1 != null && f2 != null) {
        if (f1.getArea() > f2.getArea()) {
            return 1;
        } else if (f1.getArea() < f2.getArea()) {
            return -1;
        }else if (f1.getArea() == f2.getArea()) {
            return 0;
        }
        }
        return 0;
    }
}
