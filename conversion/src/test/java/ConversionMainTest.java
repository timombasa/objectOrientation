package src.test.java;

import org.junit.Test;
import src.main.java.Converter;

import static org.junit.Assert.assertEquals;


public class ConversionMainTest {

    private Converter converter = new Converter(1, "tbsp", "tsp");;

    @Test
    public void shouldConvertOneTablespoonToThreeTeaspoons() {


        assertEquals((converter.convertTableSpoonToTeaSpoons(1)), 3);
    }



}
