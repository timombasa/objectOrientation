package src.main.java;


public class ConversionMain {

    public static Converter converter = new Converter(1, "tablespoon", "teaspoons");

    private static final int SOURCE_AMOUNT = converter.getSourceAmount();
    private static final String SOURCE_UNIT = converter.getSourceUnit();
    private static final String TARGET_UNIT = converter.getTargetUnit();
    private static final int TARGET_AMOUNT = converter.convertTableSpoonsToTeaSpoons(SOURCE_AMOUNT);

    public static void main (String[] args) {
        System.out.println(SOURCE_AMOUNT + " " + SOURCE_UNIT + " is equal to " + TARGET_AMOUNT + " " + TARGET_UNIT);
    }
}
