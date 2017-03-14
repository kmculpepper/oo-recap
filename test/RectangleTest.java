import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by kculpepp on 3/14/17.
 */
public class RectangleTest {


    Rectangle rectangle;

    @Test
    public void shouldReturn12ForAreaWhenWidthIs3AndLengthIs4(){
        rectangle = new Rectangle(3,4);
        assertThat(rectangle.area(),is(12.0));
    }

    @Test
    public void shouldReturn20ForAreaWhenWidthIs5AndLengthIs4(){
        rectangle = new Rectangle(5,4);
        assertThat(rectangle.area(),is(20.0));
    }

    @Test
    public void shouldReturn14ForPerimeterWhenWidthIs3AndLengthIs4(){
        rectangle = new Rectangle(3,4);
        assertThat(rectangle.perimeter(),is(14.0));
    }

    @Test
    public void shouldReturn18ForPerimeterWhenWidthIs5AndLengthIs4(){
        rectangle = new Rectangle(5,4);
        assertThat(rectangle.perimeter(), is(18.0));
    }



}
