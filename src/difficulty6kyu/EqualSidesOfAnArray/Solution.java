package difficulty6kyu.EqualSidesOfAnArray;

import java.util.Arrays;

public class Solution {
    public static int findEvenIndex(int[] arr) {
        int index;
        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            index = i;
            int[] tempArray = Arrays.copyOfRange(arr, i + 1, arr.length);
            if (Arrays.stream(tempArray).sum() == leftSum) return index;

            leftSum += arr[i];
        }

        return -1;
    }
}
