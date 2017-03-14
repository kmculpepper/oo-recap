import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by kculpepp on 3/14/17.
 */
public class SquareTest {

    @Test
    public void shouldReturn4ForAreaWhenLengthIs2(){
        Square square = new Square(2);
        assertThat(square.area(), is(4.0));
    }

    @Test
    public void shouldReturn9ForAreaWhenLengthIs3(){
        Square square = new Square(3);
        assertThat(square.area(), is(9.0));
    }

    @Test
    public void shouldReturn8ForPerimeterWhenLengthIs2(){
        Square square = new Square(2);
        assertThat(square.perimeter(), is(8.0));
    }

    @Test
    public void shouldReturn12ForPerimeterWhenLengthIs3(){
        Square square = new Square(3);
        assertThat(square.perimeter(), is(12.0));
    }
}