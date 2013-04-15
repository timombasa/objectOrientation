package test;

import main.Rectangle;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RectangleTest {

    private Rectangle rectangle = new Rectangle(4,5);

    @Test
    public void shouldReturnArea() {
        assertThat(rectangle.getArea(), is(20));
    }

}
