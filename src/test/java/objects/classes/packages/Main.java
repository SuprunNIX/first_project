package objects.classes.packages;

import java.util.*;

public abstract class Main extends figur {

    public static void main(String[] args) {
        Random random = new Random();
        figur[] figure = new figur[3];
        figure[0] = new Triangle(randomNumberGenerator(),
                randomNumberGenerator(),
                randomNumberGenerator());
        figure[1] = new Circle(randomNumberGenerator());
        figure[2] = new Square(randomNumberGenerator());

        //new array with 10 random figures
        figur[] figures = new figur[10];
        arrayWithRandomFigures(figures, figure, random);

        //sorting figures on array
        sorting(figures);

        //output result
        output(figures, random);
    }

    public static void sorting(figur[] figures) {
        for(int i = figures.length-1 ; i > 0 ; i--) {
            for(int j = 0 ; j < i ; j++){
                if( figures[j].getArea() > figures[j+1].getArea() ){
                    figur tmp = figures[j];
                    figures[j] = figures[j+1];
                    figures[j+1] = tmp;
                }
            }
        }
    }

    public static void arrayWithRandomFigures(figur[] figures, figur[] figure, Random random) {
        for (int i = 0; i < 10; i++) {
            int j = random.nextInt(3);
            figures[i] = figure[j];
        }
    }

    public static void output(figur[] figures, Random random) {
        for (int i = 0; i < figures.length; i++) {
            int j = random.nextInt(3);
            System.out.println(figures[i].getName() +" : "+ figures[i].getArea());
        }
    }

    public static int randomNumberGenerator() {
        Random random = new Random();
        int randomValue = random.nextInt(10 + 2);
        return randomValue;
    }
}