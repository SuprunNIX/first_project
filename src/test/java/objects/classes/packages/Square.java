package objects.classes.packages;

public class Square extends figur{
    private static final String NAME = "Square";

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getName() {
        return NAME;
    }

    public double side() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
