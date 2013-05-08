
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MaxAndMinNumberTest {

    private MaxAndMinNumber maxAndMinNumber = new MaxAndMinNumber(3,4);
    private ArrayList numbers = new ArrayList<Integer>();

    @Test
    public void shouldReturn2WhenComparing1And2() {
        numbers.add(1);
        numbers.add(2);
        assertThat((maxAndMinNumber.maxInteger(numbers)),is(2));
    }
}
