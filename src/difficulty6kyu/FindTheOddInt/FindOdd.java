package difficulty6kyu.FindTheOddInt;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindOdd {

    public static int findIt(int[] a) {
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int num : a) {
            if (numbers.containsKey(num)) {
                numbers.put(num, numbers.get(num) + 1);
            } else {
                numbers.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            if (entry.getValue() % 2 != 0) return entry.getKey();
        }

        return -1;
    }
}
