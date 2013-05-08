
import java.util.ArrayList;

public class MaxAndMinNumber {

    private int maxNumber = 0;
    private int minNumber = 0;

    public MaxAndMinNumber(int maxNumber, int minNumber) {
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
    }

    public Integer maxInteger(ArrayList<Integer> numbers) {

        for(int number : numbers) {
            if (number > number + 1) {
                maxNumber = number;
            }
            else {
                maxNumber = number + 1;
            }
        }
        return maxNumber;
    }
}
