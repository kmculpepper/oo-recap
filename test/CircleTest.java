import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by kculpepp on 3/14/17.
 */
public class CircleTest {

    private Circle circle;

    @Test
    public void shouldReturn4PiForAreaIfRadiusIs2(){
        circle = new Circle(2);

        assertThat(circle.area(), is(4*Math.PI));
    }

    @Test
    public void shouldReturn9PiForAreaIfRadiusIs3(){
        circle = new Circle(3);

        assertThat(circle.area(), is(9*Math.PI));
    }

    @Test
    public void shouldReturn4PiForPerimeterIfRadiusIs2(){
        circle = new Circle(2);
        assertThat(circle.perimeter(), is(4*Math.PI));

    }

    @Test
    public void shouldReturn6PiForPerimeterIfRadiusIs3(){
        circle = new Circle(3);
        assertThat(circle.perimeter(), is(6*Math.PI));

    }

}