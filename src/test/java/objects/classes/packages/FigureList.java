package objects.classes.packages;

import java.util.Arrays;

public class FigureList {
    static Figure[] list = new Figure[100];
    static int i = 0;

        public static void addFigureToList(Figure f) {
            list[i++] = f;
    }

    public static void printArea() {
            for(Figure t : list) {
                if(t != null) {
                    System.out.format(t.getName() + " %.2f%n ", t.getArea());
                }
            }
    }

    public static void sortArea() {
        Arrays.sort(list, new FigureComparator());
    }
}
