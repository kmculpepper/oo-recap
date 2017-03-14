/**
 * Created by kculpepp on 3/14/17.
 */
public class Circle {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    private double circumference() {
        return Math.PI * radius;
    }

    public double area() {
        return circumference() * radius;
    }

    public double perimeter() {
        return 2*circumference();
    }
}
