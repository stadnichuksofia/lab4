package roman;

import java.util.HashMap;
import java.util.Map;
/*
  @author Sofia
  @project lab4
  @class ParallelogramTest
  @version 1.0.0
  @since 12.04.2025 - 12.29
*/
public class RomanToIntegerConverter {
    private static final Map<Character, Integer> MAP = new HashMap<>();
    static {
        MAP.put('I', 1);
        MAP.put('V', 5);
        MAP.put('X', 10);
        MAP.put('L', 50);
        MAP.put('C', 100);
        MAP.put('D', 500);
        MAP.put('M', 1000);
    }

    public static int convertToInteger(String roman) {
        int result = 0;
        int prev = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int curr = MAP.get(roman.charAt(i));
            if (curr < prev) {
                result -= curr;
            } else {
                result += curr;
            }
            prev = curr;
        }
        return result;
    }
}
