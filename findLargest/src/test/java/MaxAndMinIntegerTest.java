package test.java;

import main.java.MaxAndMinInteger;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MaxAndMinIntegerTest {

    private MaxAndMinInteger maxAndMinInteger;
    private List numbers = new ArrayList<integer>();

    @Test
    public void shouldReturn2WhenComparing1And2() {
        numbers.add(1);
        numbers.add(2);
        assertThat((maxAndMinInteger.maxInteger(numbers),is(2));
    }
}
