package stringAddCalculator;

public class StringAddCalculator {
    public static int splitAndSum(String text) {
        if (isNullOrBlank(text)) {
            return 0;
        }

        String[] values = split(text);
        int result = 0;
        for (String value : values) {
            result += Integer.parseInt(value);
        }

        return result;
    }

    private static boolean isNullOrBlank(String text) {
        return text == null || text.isEmpty();
    }

    private static String[] split(String text) {
        return text.split("[,:]");
    }
}
