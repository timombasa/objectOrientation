package src.main.java;

public class Converter{

    private int srcAmount;
    private String srcUnit;
    private String destUnit;

    public Converter(int srcAmount,String srcUnit,String destUnit) {
        this.srcAmount = srcAmount;
        this.srcUnit = srcUnit;
        this.destUnit = destUnit;
    }

    public int convertTableSpoonToTeaSpoons(int tablespoon) {
        return tablespoon * 3;
    }
}
