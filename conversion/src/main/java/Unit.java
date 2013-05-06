package src.main.java;

public enum Unit {

    TEASPOON_TO_TABLESPOON(1/3),
    TEASPOON_TO_CUP(1/48),
    TABLESPOON_TO_TEASPOON(3),
    TABLESPOON_TO_CUP(3 * 1/48),
    CUP_TO_TEASPOON(48),
    CUP_TO_TABLESPOON(16);

    private final double formula;

    private Unit(double formula){
        this.formula = formula;
    }
}
