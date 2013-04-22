package src.test.java;

import org.junit.Test;
import src.main.java.Converter;

import static org.junit.Assert.assertEquals;


public class ConverterTest {

    private Converter converter = new Converter(1, "tablespoon", "teaspoons");

    @Test
    public void shouldConvertTablespoonsToTeaspoons() {
        assertEquals((converter.convertTableSpoonsToTeaSpoons(1)), 3);
        assertEquals((converter.convertTableSpoonsToTeaSpoons(2)), 6);
        assertEquals((converter.convertTableSpoonsToTeaSpoons(7)), 21);
    }
}
