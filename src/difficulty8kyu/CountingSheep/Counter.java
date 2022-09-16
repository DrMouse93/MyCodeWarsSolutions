package difficulty8kyu.CountingSheep;

import java.util.Arrays;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps).filter(s -> s != null && s).count();
    }
}
