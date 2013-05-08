package src.test.java;

import org.junit.Test;
import src.main.java.Converter;
import src.main.java.Unit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UnitConverterTest {

    private Converter converter;

    @Test
    public void shouldConvert1TablespoonTo3Teaspoons(){
        assertThat((converter.convert(Unit.TBSP, Unit.TSP)), is(3));
    }

}
