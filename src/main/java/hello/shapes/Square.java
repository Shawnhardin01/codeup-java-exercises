package hello.shapes;
import hello.shapes.Rectangle;

public class Square extends Rectangle  {
    protected double side;

    public Square(double side) {
        super(side,side);
        this.side = side;

    }

}

