package shawn.shapes;

public class ShapesTest {
    public static class Fox1 extends Rectangle{

        public Fox1(double length, double width) {
            super(length, width);
        }}
        public static class Fox2 extends Square{
            public Fox2(double side) {
                super(side);
            }}




public static void main(String[] args) {
    Fox1 Box1 = new Fox1(5, 4);
    System.out.println("the perimeter of box 1 is "+Box1.getPerimeter());
    System.out.println("the Area of box 1 is "+Box1.getArea());
    Fox2 Box2 = new Fox2(5);
    System.out.println("the perimeter of box 2 is "+Box2.getPerimeter());
    System.out.println("the Area of box 2 is "+Box2.getArea());

}}


