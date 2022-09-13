package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int result = (int)Math.round(numberToBeRounded);
        System.out.println(result);
    }

    public static void main(String[] args) {
        FloatTypeCasting floatTypeCasting = new FloatTypeCasting();
        floatTypeCasting.roundNumber(3.5f);
    }
}
