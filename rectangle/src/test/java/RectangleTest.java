package test.java;

import main.java.Rectangle;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RectangleTest {

    Rectangle rectangle = new Rectangle(4,5);

    @Test
    public void shouldReturnArea() {

        assertThat(rectangle.getArea(), is(20));
    }

    @Test
    public void shouldSumAreaOfTwoRectangles() {
//        assertThat(rectangle.sumAreaOfTwo());
    }
}
