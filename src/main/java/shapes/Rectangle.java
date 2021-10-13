package shapes;

import java.util.List;
import java.util.Objects;

public class Rectangle {

    private final int SIDES_CONSTANT = 2;
    private final int length;
    private final int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return SIDES_CONSTANT*(length+breadth);
    }

    public static Rectangle CreateSquare(int side) {
        return new Rectangle(side, side);
    }

    public int compareTo(Rectangle comparableRectangle){
        if(this.area() == comparableRectangle.area())return 0;
        else if(this.area() > comparableRectangle.area()) return 1;
        else return -1;
    }


    public static Rectangle max(List<Rectangle> candidateRectangles){
        return candidateRectangles.stream().max(Rectangle::compareTo).get();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return length == rectangle.length && breadth == rectangle.breadth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, breadth);
    }
}
