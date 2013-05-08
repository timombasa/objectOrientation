
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MaxAndMinIntegerTest {

    private MaxAndMinInteger maxAndMinInteger = new MaxAndMinInteger();
    private List numbers = new ArrayList<Integer>();

    @Test
    public void shouldReturn2WhenComparing1And2() {
        numbers.add(1);
        numbers.add(2);
        assertThat((maxAndMinInteger.maxInteger(numbers)),is(2));
    }
}
