/**
 * Created by kculpepp on 3/21/17.
 */
public class GetRectangleFactory {
    public Rectangle getRectangle(double width, double length){
        if(width == length){
            return new Square(width);
        }
        return new Rectangle(width, length);
    }
}
