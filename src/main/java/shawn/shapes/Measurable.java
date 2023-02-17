package shawn.shapes;

public interface Measurable {
    double length = 0;
                double width = 0;
    public default double getArea() {
                return length * width;
            }

            public default double getPerimeter() {
                return 2 * (length + width);
            }
}
