package shawn.shapes;


public class Rectangle {
            protected double length;
            protected double width;

            public Rectangle(double length, double width) {
                this.length = length;
                this.width = width;
            }

            public double getArea() {
                return length * width;
            }

            public double getPerimeter() {
                return 2 * (length + width);
            }


            public static void main(String[] args) {
                Rectangle rectangle = new Rectangle(23, 12);
                System.out.println(rectangle.getArea());
                System.out.println(rectangle.getPerimeter());
            }}
