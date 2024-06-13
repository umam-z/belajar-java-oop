package zuper.programmer.util;

public class MathUtil {
    public static int sum(int ...values) {
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            total = total + values[i];
        }
        return total;
    }
}
