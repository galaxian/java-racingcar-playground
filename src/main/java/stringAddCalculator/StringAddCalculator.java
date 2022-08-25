package stringAddCalculator;

public class StringAddCalculator {
    public static int splitAndSum(String text) {
        if (isNullOrBlank(text)) {
            return 0;
        }

        return sum(toInt(split(text)));
    }

    private static boolean isNullOrBlank(String text) {
        return text == null || text.isEmpty();
    }

    private static String[] split(String text) {
        return text.split("[,:]");
    }

    private static int[] toInt(String[] values) {
        int[] numbers = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            numbers[i] = Integer.parseInt(values[i]);
        }
        return numbers;
    }

    private static int sum(int[] numbers) {
        int result = 0;
        for (int number: numbers) {
            result += number;
        }
        return result;
    }
}
