package stringAddCalculator;

public class StringAddCalculator {
    public static int splitAndSum(String text) {
        if (isNullOrBlank(text)) {
            return 0;
        }
        return 0;
    }

    private static boolean isNullOrBlank(String text) {
        return text == null || text.isEmpty();
    }
}
