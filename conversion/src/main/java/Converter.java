package src.main.java;

public class Converter{

    private int sourceAmount;
    private String sourceUnit;
    private String targetUnit;

    public Converter(int sourceAmount, String sourceUnit, String targetUnit) {
        this.sourceAmount = sourceAmount;
        this.sourceUnit = sourceUnit;
        this.targetUnit = targetUnit;
    }

    public int getSourceAmount() {
        return sourceAmount;
    }

    public String getSourceUnit() {
        return sourceUnit;
    }

    public String getTargetUnit() {
        return targetUnit;
    }

    public int convertTableSpoonsToTeaSpoons(int tablespoon) {
        return tablespoon * 3;
    }
}
