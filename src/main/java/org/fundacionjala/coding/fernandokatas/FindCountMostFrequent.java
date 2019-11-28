package org.fundacionjala.coding.fernandokatas;

import java.util.HashMap;
import java.util.Map;

public final class FindCountMostFrequent {
    private FindCountMostFrequent() {
    }

    public static int findCount(final int[] digits) {
        Map<Integer, Integer> integerHashMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < digits.length; i++) {
            int key = digits[i];
            if (integerHashMap.containsKey(key)) {
                int freq = integerHashMap.get(key);
                freq++;
                integerHashMap.put(key, freq);
            } else {
                integerHashMap.put(key, 1);
            }
        }
        int maxCount = 0, res = -1;
        for (Map.Entry<Integer, Integer> val : integerHashMap.entrySet()) {
            if (maxCount < val.getValue()) {
                res = val.getKey();
                maxCount = val.getValue();
            }
        }
        return maxCount;
    }
}
