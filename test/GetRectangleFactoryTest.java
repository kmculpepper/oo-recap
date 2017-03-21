import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kculpepp on 3/21/17.
 */
public class GetRectangleFactoryTest {

    @Test
    public void shouldReturnRectangleWhenWidthAndLengthAreNotEqual(){
        GetRectangleFactory rectangleFactory = new GetRectangleFactory();
        Rectangle rectangle = rectangleFactory.getRectangle(5,4);
        assertEquals(rectangle.getClass(), Rectangle.class);
    }

    @Test
    public void shouldReturnSquareWhenWidthAndLengthAreEqual(){
        GetRectangleFactory rectangleFactory = new GetRectangleFactory();
        Rectangle square = rectangleFactory.getRectangle(5,5);
        assertEquals(square.getClass(), Square.class);
    }
}