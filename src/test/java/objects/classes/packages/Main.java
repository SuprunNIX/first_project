package objects.classes.packages;

import java.util.*;

public abstract class Main extends Figure {

    public static void main(String[] args) {
        Figure[] figure = new Figure[10];
        figure[0] = new Triangle(randomNumberGenerator(),
                randomNumberGenerator(),
                randomNumberGenerator());
        figure[1] = new Circle(randomNumberGenerator());
        figure[2] = new Square(randomNumberGenerator());
        figure[3] = new Triangle(randomNumberGenerator(),
                randomNumberGenerator(),
                randomNumberGenerator());
        figure[4] = new Circle(randomNumberGenerator());
        figure[5] = new Square(randomNumberGenerator());
        figure[6] = new Triangle(randomNumberGenerator(),
                randomNumberGenerator(),
                randomNumberGenerator());
        figure[7] = new Circle(randomNumberGenerator());
        figure[8] = new Square(randomNumberGenerator());
        figure[9] = new Circle(randomNumberGenerator());

        for(int i = 0; i < figure.length; i++) {
            FigureList.addFigureToList(figure[i]);
        }

        FigureList.printArea();

        FigureList.sortArea();

        FigureList.printArea();


    }



    public static int randomNumberGenerator() {
        Random random = new Random();
        return random.nextInt(10 + 2);
    }
}