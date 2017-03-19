/**
 * Created by kculpepp on 3/14/17.
 */
public class Rectangle {

    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }


    public double area() {
        return width*length;
    }

    public double perimeter() {
        return 2.0*(width+length);
    }
}
